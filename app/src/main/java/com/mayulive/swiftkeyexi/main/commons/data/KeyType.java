package com.mayulive.swiftkeyexi.main.commons.data;

import android.content.Context;

import com.mayulive.swiftkeyexi.R;
import com.mayulive.swiftkeyexi.xposed.key.KeyCommons;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Roughy on 8/1/2017.
 */
public enum KeyType
{

	//There are many other keys in addition to these.
	//They are weird duplicates (e.g. EmojiSwitchKey)
	//and things I don't understand at all (e.g ReturnLetterKey).
	//There are also keys I assume are legacy (e.g. EmojiEnterKey)
	//More obscure languages will likely also have keys not listed here.

	DEFAULT,            //Any other type
	SYMBOL,            //SymbolKey, LetterKey
	DELETE,                //DeleteKey
	SHIFT,                //ShiftKey
	SPACE,                //LanguageSwitchingSpaceKey, SpaceKey
	SWITCH_LAYOUT,        //SwitchLayoutKey. Note: There will be multiple of these. abc -> symbols -> symbols2
	EMOJI,                //EmojiLayoutKey
	ENTER,                //IMEGoKey
	PERIOD,            //PuncKey
	CLEAR_BUFFER_KEY,    //ClearBufferKey. 清空 key
	TAB,                //Tab
	NUMBER,				//There is no number key type, but set it manually for 0-9
	COMMA,
	POPUP,				// Type created by us to track popup key instances
	LEFT_ARROW,
	UP_ARROW,
	RIGHT_ARROW,
	DOWN_ARROW;


	private static final Set<String> NUMBER_CHARACTERS = new HashSet<>();

	static
	{
		//Adds 0 to 9
		for (int i = 0; i < 10; i++)
		{
			NUMBER_CHARACTERS.add(String.valueOf(i));
		}
	}

	public static boolean contentIsNumber(String content)
	{
		return ( NUMBER_CHARACTERS.contains(content) );
	}

	public static KeyType getType( int typeIdentifier, String content )
	{

		switch (typeIdentifier)
		{
			case 0xE:
			case 0xF:
			case 0x17:
				return SPACE;

			case 0xC:
				return SWITCH_LAYOUT;
			case 0x4:
				return PERIOD;

			case 0xD:
			case 0x3:
				return COMMA;

			case 0x6:
				return DELETE;
			case 0x14:
				return SHIFT;

			case 0x0:
			case 0x13:
			{
				if (KeyType.contentIsNumber( content ))
				{
					return NUMBER;
				}
				else
				{
					return SYMBOL;
				}


			}

			case 0xA:
			{
				switch( content )
				{
					case "icon_leftArrow":
						return LEFT_ARROW;
					case "icon_upArrow":
						return UP_ARROW;
					case "icon_rightArrow":
						return RIGHT_ARROW;
					case "icon_downArrow":
						return DOWN_ARROW;
				}

				return DEFAULT;
			}

			case 0x7:			// Probably more of these
				return ENTER;

			case 0x8:
				return EMOJI;

		}

		return DEFAULT;

	}

	public boolean isArrowKey()
	{
		switch (this)
		{
			case LEFT_ARROW:
			case UP_ARROW:
			case RIGHT_ARROW:
			case DOWN_ARROW:
				return true;
			default:
				return false;
		}
	}

	public static KeyType getType(String tag)
	{
		if (tag.contains("SpaceKey") || tag.contains("SpaceOpenBoxKey"))
			return SPACE;
		if (tag.equals("SymbolKey") )
			return SYMBOL;
		if ( tag.contains("LetterKey") || tag.contains("LayoutMappedLetterKey"))
			return SYMBOL;
		if (tag.contains("DeleteKey"))
			return DELETE;
		if (tag.contains("ShiftKey"))
			return SHIFT;
		if (tag.equals("SwitchLayoutKey"))
			return SWITCH_LAYOUT;
		if (tag.equals("EmojiLayoutKey"))
			return EMOJI;
		if (tag.equals("IMEGoKey") || tag.contains("EnterKey"))
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

		switch (type)
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
