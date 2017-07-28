package com.mayulive.swiftkeyexi.xposed;

import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.mayulive.swiftkeyexi.ExiModule;
import com.mayulive.swiftkeyexi.main.keyboard.HotkeyPanel;
import com.mayulive.swiftkeyexi.settings.Settings;
import com.mayulive.swiftkeyexi.xposed.style.StyleCommons;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Roughy on 2/22/2017.
 */

public class OverlayCommons
{
	private static String LOGTAG = ExiModule.getLogTag(OverlayCommons.class);

	public static RelativeLayout mKeyboardOverlay = null;

	public static String mLastKeyDisplayed = null;

	private static ArrayList<TextView> mPopupViews = new ArrayList<>();
	private static ArrayList<TextView> mCheckedPopupViews = new ArrayList<>();

	private static float mPopupTextSize = 0;
	private static int mPopupPaddingX = 0;
	private static int mPopupPaddingY = 0;

	private static HotkeyPanel mHotkeyMenuPanel = null;

	public static void setPopupDimensions(float textSize, int paddingX, int paddingY)
	{
		mPopupTextSize = textSize;
		mPopupPaddingX = paddingX;
		mPopupPaddingY = paddingY;
	}


	public static void clearPopupviewCache()
	{
		mPopupViews.clear();
	}


	private static TextView getPopup()
	{
		if (mPopupViews.isEmpty())
		{
			if (mKeyboardOverlay != null)
			{
				TextView button = StyleCommons.getPopupTextView(mKeyboardOverlay.getContext());

				button.setIncludeFontPadding(false);
				button.setPadding(mPopupPaddingX,mPopupPaddingY,mPopupPaddingX,mPopupPaddingY);

				button.setGravity(Gravity.CENTER);
				button.setTextSize( TypedValue.COMPLEX_UNIT_PX, mPopupTextSize);
				RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
				button.setLayoutParams(params);

				mCheckedPopupViews.add(button);
				return button;
			}
			else
			{
				Log.e(LOGTAG, "Strange, overlay was null");
			}

		}

		TextView button = mPopupViews.remove(mPopupViews.size()-1);
		mCheckedPopupViews.add(button);
		return button;
	}

	private static void returnPopup(TextView view)
	{
		view.setText("");
		view.measure(0,0);
		view.layout(0,0,0,0);

		mCheckedPopupViews.remove(view);
		mPopupViews.add(view);
	}


	//Set a key manually to avoid extra calls
	public static void setPopupKeyManually(String key)
	{
		mLastKeyDisplayed = key;
	}

	public static boolean isDisplayed(String key)
	{
		return mLastKeyDisplayed != null && mLastKeyDisplayed.equals(key);
	}

	public static boolean isHotkeyMenuDisplayed()
	{
		return mHotkeyMenuPanel != null;
	}


	//Full-screen coordinates
	public static void displayKeyAbove(String key, String text, float fromBottom, float xCenter)
	{

		mLastKeyDisplayed = key;

		if (mKeyboardOverlay == null)
			Log.e(LOGTAG, "Strange, overlay was null");

		TextView button = getPopup();


		button.setText(text);

		//Get the size of the view so we know where to place it
		button.measure(View.MeasureSpec.UNSPECIFIED, View.MeasureSpec.UNSPECIFIED);

		int viewWidth = button.getMeasuredWidth();
		int viewHeight = button.getMeasuredHeight();

		//Get the x position we want the left side of the view to be at
		float xPos = xCenter - (viewWidth / 2);
		if (xPos < 0)
			xPos = 0;

		//Don't try to consider width if size has not been set
		if (mKeyboardOverlay.getMeasuredWidth() > 0)
		{
			//Check if we are off-screen on the right
			float rightPos = xPos + viewWidth;
			if ( rightPos >= mKeyboardOverlay.getMeasuredWidth() )
			{
				//Offset left position accordingly
				xPos -=( rightPos - mKeyboardOverlay.getMeasuredWidth()) ;
			}

		}

		//////////////////
		RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)button.getLayoutParams();
		params.leftMargin = (int)xPos;
		params.topMargin = (int) mKeyboardOverlay.getMeasuredHeight() - (int) fromBottom - viewHeight;

		button.setLayoutParams(params);

		mKeyboardOverlay.addView(button);
	}


	public static void clearPopups()
	{

		if (mKeyboardOverlay != null)
		{
			if (mHotkeyMenuPanel != null)
			{
				mKeyboardOverlay.removeView(mHotkeyMenuPanel);
				mHotkeyMenuPanel = null;
			}

			ListIterator<TextView> iterator = mCheckedPopupViews.listIterator();
			while(iterator.hasNext())
			{
				TextView view = iterator.next();
				returnPopup(view);
				mKeyboardOverlay.removeView(view);
			}
		}
		else
			Log.e(LOGTAG, "Strange, overlay was null");


		mLastKeyDisplayed = null;
	}

	public static void handleDisplayHotkeyMenuTouch(float x, float y, float viewHeight)
	{

		if (mHotkeyMenuPanel != null)
		{
			float heightOffset = mHotkeyMenuPanel.getMeasuredHeight() - viewHeight;
			mHotkeyMenuPanel.handleTouch(x, y + heightOffset);
		}
	}

	//Full-screen coordinates
	public static void displayHotkeyMenu(float fromBottom, float coverTopFromBottom, float xCenter)
	{
		if (mKeyboardOverlay == null)
		{
			Log.e(LOGTAG, "Strange, overlay was null");
			return;
		}

		mHotkeyMenuPanel = new HotkeyPanel( mKeyboardOverlay.getContext(), Settings.QUICK_MENU_HIGHLIGHT_COLOR );

		//Max radius calculated from height. Actual panel will take care of horizontal fitting
		float maxRadius_Y = coverTopFromBottom - fromBottom;
		float centerRatio = mKeyboardOverlay.getMeasuredWidth() != 0 ? xCenter /  mKeyboardOverlay.getMeasuredWidth() : 0.5f;

		mHotkeyMenuPanel.setHorizontalCenterRadio( centerRatio );
		mHotkeyMenuPanel.setTargetRadius( maxRadius_Y);
		mHotkeyMenuPanel.setBottomMargin(fromBottom);
		mHotkeyMenuPanel.setCoverTop(mKeyboardOverlay.getMeasuredHeight() - coverTopFromBottom);

		///////////////////

		RelativeLayout.LayoutParams params =  new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
		mHotkeyMenuPanel.setLayoutParams(params);

		mKeyboardOverlay.addView(mHotkeyMenuPanel);
	}

	public static HotkeyPanel getHotkeyPanel()
	{
		return mHotkeyMenuPanel;
	}


}
