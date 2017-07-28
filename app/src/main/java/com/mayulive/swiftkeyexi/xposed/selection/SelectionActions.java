package com.mayulive.swiftkeyexi.xposed.selection;

import android.content.Context;
import android.os.Vibrator;

import com.mayulive.swiftkeyexi.main.keyboard.HotkeyPanel;
import com.mayulive.swiftkeyexi.xposed.OverlayCommons;
import com.mayulive.swiftkeyexi.xposed.keyboard.KeyboardClassManager;
import com.mayulive.swiftkeyexi.xposed.selection.selectionstuff.pointerInformation;
import com.mayulive.swiftkeyexi.util.ContextUtils;
import com.mayulive.swiftkeyexi.xposed.key.KeyCommons;
import com.mayulive.swiftkeyexi.xposed.KeyboardInteraction;
import com.mayulive.swiftkeyexi.xposed.selection.selectionstuff.PointerState;

import static com.mayulive.swiftkeyexi.xposed.selection.SelectionState.mModifierKeyActions;

/**
 * Created by Roughy on 6/7/2017.
 */

public class SelectionActions
{


	protected static void handeModifierAction(pointerInformation mLastPointerInfo, String key)
	{
		if (key == null || key.isEmpty())
			return;

		key = key.toLowerCase();
		KeyboardInteraction.TextAction action = mModifierKeyActions.get(key);

		if (action != null)
		{
			KeyCommons.PerformTextAction( KeyboardClassManager.getInputConnection(), action);
			mLastPointerInfo.state = PointerState.ACTION;
			SelectionState.mActionTriggered = true;
		}
	}

	protected static void handleSpaceModifierKey(float posX, float posY)
	{
		//Ex
		String key = KeyCommons.getKeyAtLocation(posX , posY);
		if (key != null)
		{
			key = key.toLowerCase();
			KeyboardInteraction.TextAction action = mModifierKeyActions.get(key);
			handleTextAction(action);
		}
	}

	protected static void handleSpaceModifierMenu()
	{
		HotkeyPanel panel = OverlayCommons.getHotkeyPanel();

		//Order of operations maybe maybe.
		// Pointer-up is handled here rather than in the hotkeypanel though, so no listeners.
		if (panel != null)
		{
			handleTextAction(panel.getLastSelectedAction());
		}
	}

	protected static void handleTextAction(KeyboardInteraction.TextAction action)
	{
		if (action != null)
		{
			//Vibrate?
			Vibrator v = (Vibrator) ContextUtils.getHookContext().getSystemService(Context.VIBRATOR_SERVICE);
			v.vibrate(25);

			KeyCommons.PerformTextAction( KeyboardClassManager.getInputConnection(), action);
		}
	}
}
