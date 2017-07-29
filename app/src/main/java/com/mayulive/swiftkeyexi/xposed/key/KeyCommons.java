package com.mayulive.swiftkeyexi.xposed.key;

import android.content.Context;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

import com.mayulive.swiftkeyexi.xposed.keyboard.KeyboardMethods;
import com.mayulive.swiftkeyexi.R;
import com.mayulive.swiftkeyexi.main.commons.data.KeyDefinition;
import com.mayulive.swiftkeyexi.xposed.KeyboardInteraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roughy on 2/14/2017.
 */

public class KeyCommons
{
	///////////////////
	//Key down stuff
	///////////////////


	private static ArrayList<OnKeyDownListener> mKeyDownListeners = new ArrayList<OnKeyDownListener>();


	//Unlike hitboxes, which will overwrite any existing entries, key definitions will stay around
	//until we clear them. Use system has to avoid blocking garbage collection.
	// In the case of android, the system identifier for an object is (last I checked) just the pointer address.
	private static Map<Integer, KeyDefinition> mKeyDefinitions = new HashMap<>();

	public static String sLastSymbolDefined = null;
	protected static KeyDefinition mLastKeyDefined = null;

	public enum KeyType
	{
		//There are many other keys in addition to these.
		//They are weird duplicates (e.g. EmojiSwitchKey)
		//and things I don't understand at all (e.g ReturnLetterKey).
		//There are also keys I assume are legacy (e.g. EmojiEnterKey)
		//More obscure languages will likely also have keys not listed here.

		DEFAULT,			//Any other type
		SYMBOL, 			//SymbolKey, LetterKey
		DELETE,				//DeleteKey
		SHIFT,				//ShiftKey
		SPACE,				//LanguageSwitchingSpaceKey, SpaceKey
		SWITCH_LAYOUT,		//SwitchLayoutKey. Note: There will be multiple of these. abc -> symbols -> symbols2
		EMOJI,				//EmojiLayoutKey
		ENTER,				//IMEGoKey
		PERIOD, 			//PuncKey
		CLEAR_BUFFER_KEY, 	//ClearBufferKey. 清空 key
		TAB;				//Tab

		public static KeyType getType(String tag)
		{
			if (tag.contains("SpaceKey"))
				return SPACE;
			if (tag.equals("SymbolKey") || tag.contains("LetterKey") ||  tag.contains("LayoutMappedLetterKey"))
				return SYMBOL;
			if (tag.equals("DeleteKey"))
				return DELETE;
			if (tag.equals("ShiftKey"))
				return SHIFT;
			if (tag.equals("SwitchLayoutKey"))
				return SWITCH_LAYOUT;
			if (tag.equals("EmojiLayoutKey"))
				return EMOJI;
			if (tag.equals("IMEGoKey") || tag.equals("EnterKey"))
				return ENTER;
			if (tag.equals("PuncKey"))
				return PERIOD;
			if (tag.equals("ClearBufferKey"))
				return CLEAR_BUFFER_KEY;
			if (tag.equals("Tab"))
				return TAB;

			return DEFAULT;
		}

		public static String getKeyDefinitionDisplayString(Context context, KeyType type)
		{

			switch(type)
			{
				case DEFAULT:
					return context.getResources().getString(R.string.keydefinition_default);
				case SYMBOL:
					return context.getResources().getString(R.string.keydefinition_symbol);
				case DELETE:
					return context.getResources().getString(R.string.keydefinition_delete);
				case SHIFT:
					return context.getResources().getString(R.string.keydefinition_shift);
				case SPACE:
					return context.getResources().getString(R.string.keydefinition_space);
				case SWITCH_LAYOUT:
					return context.getResources().getString(R.string.keydefinition_switch_layout);
				case EMOJI:
					return context.getResources().getString(R.string.keydefinition_emoji);
				case ENTER:
					return context.getResources().getString(R.string.keydefinition_enter);
				case PERIOD:
					return context.getResources().getString(R.string.keydefinition_period);
				case CLEAR_BUFFER_KEY:
					return context.getResources().getString(R.string.keydefinition_clearbuffer);
				case TAB:
					return context.getResources().getString(R.string.keydefinition_tab);
			}

			return "";
		}
	}

	////////////
	//Misc
	////////////


	public static void clearKeys()
	{
		mHitboxMap.clear();
		mKeyDefinitions.clear();
	}

	//Fun fact: You cannot obtain multiple capture groups when using quantifiers, and java regex does not support recursion. Result: This nonsense.
	//Matches: ag { Content: {Bottom: com.touchtype.keyboard.e.f.j@ec9390a, Top: {Text: , Label: }}, Area: RectF(0.0025000572, 0.42631578, 0.14750004, 0.6263158) }
	//Specifically, the 4 numbers that make up RectF.  The capture groups are just pasted 4 times.
	private static Pattern AREA_RECTF_STRING_PATTERN = Pattern.compile("Area: RectF\\((?:(\\d+(?:\\.\\d+)?)(?:, )?)(?:(\\d+(?:\\.\\d+)?)(?:, )?)(?:(\\d+(?:\\.\\d+)?)(?:, )?)(?:(\\d+(?:\\.\\d+)?)(?:, )?)\\)");

	//Takes a key and uses its toString method to get the area.
	//Trust me, it's the least-horrible-but-also-stable method.
	public static RectF getKeyArea(Object key)
	{
		//Expected output
		//ag { Content: {Bottom: com.touchtype.keyboard.e.f.j@ec9390a, Top: {Text: , Label: }}, Area: RectF(0.0025000572, 0.42631578, 0.14750004, 0.6263158) }
		float[] values = new float[4];
		Matcher matcher = AREA_RECTF_STRING_PATTERN.matcher(key.toString());
		try
		{
			if (matcher.find())
			{
				for (int i = 0; i < 4; i++)
				values[i] = Float.valueOf(matcher.group(i+1));
			}
		}
		catch (NumberFormatException ex)
		{
			ex.printStackTrace();
		}

		return new RectF(values[0], values[1], values[2], values[3] );
	}


	/////////////
	//Key down
	/////////////

	public static void addKeyDefinition(Object swiftkeyKey, KeyDefinition key)
	{
		mKeyDefinitions.put( System.identityHashCode(swiftkeyKey), key);
	}

	public static KeyDefinition getKeyDefinition(Object swiftkeyKey)
	{
		return mKeyDefinitions.get( System.identityHashCode(swiftkeyKey) );
	}

	protected static void callKeyDownListeners(KeyDefinition key)
	{
		for (OnKeyDownListener listener : mKeyDownListeners)
		{
			listener.onKeyDown(key);
		}
	}

	public interface OnKeyDownListener
	{
		void onKeyDown(KeyDefinition key);
	}

	public static void addOnKeyDownListener(OnKeyDownListener listener)
	{
		mKeyDownListeners.add(listener);
	}

	public static void removeOnKeyDownListener(OnKeyDownListener listener)
	{
		mKeyDownListeners.remove(listener);
	}


	//////////////////
	//Cancel tap stuff
	//////////////////

	protected static boolean mCancelNextKey = false;
	protected static long mCancelNextKey_RequestTime = 0;

	protected static boolean mCancelAllKeys = false;

	public static void requestCancelNextKey()
	{
		mCancelNextKey = true;
		mCancelNextKey_RequestTime = System.currentTimeMillis();
	}

	public static void setCancelAllKeys(boolean cancel)
	{
		mCancelAllKeys = cancel;
	}


	///////////////////
	//Actions
	///////////////////

	public static boolean PerformTextAction(InputConnection connection, KeyboardInteraction.TextAction action)
	{
		if (action != null && action != KeyboardInteraction.TextAction.DEFAULT)
		{
			//Log.e("###", "Performing action: "+action.toString());

			int menuAction = 0;

			switch(action)
			{
				case COPY:
				{
					menuAction = android.R.id.copy;
					break;
				}
				case CUT:
				{
					menuAction = android.R.id.cut;
					break;
				}
				case PASTE:
				{
					menuAction = android.R.id.paste;
					break;
				}
				case SELECT_ALL:
				{
					menuAction = android.R.id.selectAll;
					break;
				}
				case GO_TO_END:
				{
					//KEYCODE_MOVE_END only moves to the end of the line. We usually want to move to the end of the text, which
					//can be accomplished by selecting all before triggering the key.
					connection.performContextMenuAction(android.R.id.selectAll);
					connection.sendKeyEvent( new KeyEvent( KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MOVE_END ));
					connection.sendKeyEvent( new KeyEvent( KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MOVE_END ));

					return true;
				}
				default:
					break;
			}

			connection.performContextMenuAction(menuAction);

			return true;
		}

		return false;
	}

	//////////////////////
	//Normal key up stuff
	//////////////////////

	//protected static Map< String, Pair<String, RectF> > mKeyHitboxes = new HashMap<>();

	private static Map<String, HitboxMap> mHitboxMap = new HashMap<String,HitboxMap>();
	private static HitboxMap mCurrentHitboxMap = new HitboxMap();	//Initialize incase we never set it


	public static class HitboxMap extends HashMap<String, KeyDefinition>
	{
		public HitboxMap()
		{
			super();
		}
	}

	public static void setCurrentHitboxMap(String layoutName)
	{
		HitboxMap map = mHitboxMap.get(layoutName);
		if (map == null)
		{
			map = new HitboxMap();
			mHitboxMap.put(KeyboardMethods.getCurrentLayoutName(), map);
		}

		mCurrentHitboxMap = map;
	}

	public static HitboxMap getHitboxMap()
	{
		return mCurrentHitboxMap;
	}

	public static String getKeyAtLocation(float posX, float posY)
	{
		HitboxMap map = getHitboxMap();

		for (KeyDefinition entry : map.values())
		{
			if (entry.hitbox.contains(posX, posY))
			{
				return entry.getContent();
			}
		}

		return null;
	}

	public static KeyDefinition getHitboxAtLocation(float posX, float posY)
	{
		//Log.e("###", "Checking input X: "+posX+", Y: "+posY+", count: "+getHitboxMap().size());

		HitboxMap map = getHitboxMap();

		for (KeyDefinition entry : map.values())
		{
			//Log.e("###", "Box: X: "+entry.hitbox+", key: "+entry.getContent());
			if (entry.hitbox.contains(posX, posY))
			{
				return entry;
			}

		}


		return null;
	}

}