package com.mayulive.swiftkeyexi.xposed.keyboard;

import com.mayulive.xposed.classhunter.profiles.ClassItem;
import com.mayulive.xposed.classhunter.profiles.ClassProfile;
import com.mayulive.xposed.classhunter.profiles.ConstructorProfile;
import com.mayulive.xposed.classhunter.profiles.FieldItem;
import com.mayulive.xposed.classhunter.profiles.MethodProfile;

import static com.mayulive.xposed.classhunter.Modifiers.*;


public class KeyboardProfiles
{

	public static ClassProfile get_TOOLBAR_OPEN_BUTTON_OVERLAY_CLASS_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("fnt");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | FINAL );

		newProfile.setTypeParamCount(0);
		newProfile.setSuperClass(	new ClassItem(android.widget.FrameLayout.class));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem(android.view.ViewTreeObserver.OnGlobalLayoutListener.class),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(android.content.Context.class)),	//a
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//b
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//c
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//d
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//e
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//f
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//g
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//h
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//i
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//j
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(boolean.class)),	//k
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//l
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//m

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #1: b
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #2: c
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #3: c
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(void.class)

								),

						//Method #4: d
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #5: d
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(void.class)

								),

						//Method #6: e
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #7: e
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(void.class)

								),

						//Method #8: setUpRedDot
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.widget.ImageView.class)

								),

						//Method #9: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #10: a
						new MethodProfile
								(
										PUBLIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(void.class),

										new ClassItem(java.lang.Object.class),
										new ClassItem(int.class)

								),

						//Method #11: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(boolean.class)

								),

						//Method #12: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #13: onAttachedToWindow
						new MethodProfile
								(
										PROTECTED | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #14: onDetachedFromWindow
						new MethodProfile
								(
										PROTECTED | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #15: onGlobalLayout
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #16: setVisibility
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(int.class)

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		PUBLIC | EXACT ,

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),


				});

		return newProfile;
	}

	public static ClassProfile get_KEY_HEIGHT_CLASS_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("iix");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | FINAL );

		newProfile.setTypeParamCount(0);
		newProfile.setSuperClass(	new ClassItem(java.lang.Object.class));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem(android.content.SharedPreferences.OnSharedPreferenceChangeListener.class)

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{
						new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//a
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(java.util.Set.class)),	//b
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//c
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//d
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//e
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(int.class)),	//f

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #1: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #2: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(int.class)

								),

						//Method #3: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #4: c
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(int.class)

								),

						//Method #5: d
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(int.class)

								),

						//Method #6: onSharedPreferenceChanged
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.content.SharedPreferences.class),
										new ClassItem(java.lang.String.class)

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		PUBLIC | EXACT ,

										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),


				});

		return newProfile;
	}



	public static ClassProfile get_FULL_KEYBOARD_SERVICE_DELEGATE_CLASS_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("cqp");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | FINAL );

		newProfile.setTypeParamCount(0);
		newProfile.setSuperClass(	new ClassItem(java.lang.Object.class));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem("com.touchtype_fluency.service.HandwritingModelLoadStateListener" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("com.touchtype_fluency.service.LanguageLoadStateListener" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("com.touchtype_fluency.service.receiver.SDCardListener" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//A
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//B
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//C
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(android.content.res.Resources.class)),	//D
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//E
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//F
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//G
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//H
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//I
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//J
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )),	//K
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//L
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//M
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//N
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//O
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//P
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//Q
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//R
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//S
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//T
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | ABSTRACT | EXACT )),	//U
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//V
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//W
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )),	//X
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//Y
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//Z
						new FieldItem( FINAL | EXACT , 	new ClassItem(android.content.Context.class)),	//a
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aA
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//aB
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aC
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aD
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//aE
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aF
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aG
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aH
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aI
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aJ
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aK
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aL
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(java.util.Locale.class)),	//aM
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//aN
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aO
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("com.touchtype_fluency.service.handwriting.HandwritingModelLoadState" , PUBLIC | FINAL | ENUM | EXACT )),	//aP
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aQ
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aR
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aS
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//aT
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )),	//aU
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aV
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aW
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(android.content.BroadcastReceiver.class)),	//aX
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aa
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ab
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ac
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ad
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ae
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//af
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(android.content.ClipboardManager.class)),	//ag
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ah
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ai
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(java.util.Collection.class)),	//aj
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ak
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//al
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//am
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//an
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ao
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//ap
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aq
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ar
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | EXACT )),	//as
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(int.class)),	//at
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//au
						new FieldItem( PRIVATE | EXACT , 	new ClassItem("com.touchtype.keyboard.service.LockScreenWatcher" , PUBLIC | EXACT )),	//av
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//aw
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//ax
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//ay
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//az
						new FieldItem( FINAL | EXACT , 	new ClassItem("com.touchtype.KeyboardService" , PUBLIC | EXACT )),	//b
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//c
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//d
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//e
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//f
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//g
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//h
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//i
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//j
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//k
						new FieldItem( FINAL | EXACT , 	new ClassItem("com.touchtype_fluency.service.FluencyServiceProxy" , PUBLIC | EXACT )),	//l
						new FieldItem( FINAL | EXACT , 	new ClassItem("com.touchtype_fluency.service.languagepacks.LanguagePackListener" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//m
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//n
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )),	//o
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//p
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//q
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT )),	//r
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//s
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//t
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | EXACT )),	//u
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//v
						new FieldItem( FINAL | EXACT , 	new ClassItem("com.touchtype_fluency.service.receiver.SDCardReceiverWrapper" , PUBLIC | EXACT )),	//w
						new FieldItem( EXACT , 	new ClassItem("com.touchtype_fluency.service.LanguageLoadStateCombiner" , PUBLIC | EXACT )),	//x
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//y
						new FieldItem( FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//z

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(android.view.inputmethod.EditorInfo.class),

										new ClassItem("com.touchtype.KeyboardService" , PUBLIC | EXACT )

								),

						//Method #1: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem(android.content.ComponentName.class)

								),

						//Method #2: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem(java.lang.String.class)

								),

						//Method #3: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("com.touchtype.extendedpanel" , PUBLIC | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #4: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("com.touchtype_fluency.service.FluencyServiceProxy" , PUBLIC | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #5: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT ),

										new ClassItem("" , PUBLIC | EXACT ),
										new ClassItem("com.touchtype.KeyboardService" , PUBLIC | EXACT ),
										new ClassItem(android.content.Context.class),
										new ClassItem(android.content.res.Resources.class)

								),

						//Method #6: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #7: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #8: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #9: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #10: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.ComponentName.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #11: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(java.lang.String.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #12: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #13: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #14: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #15: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("com.touchtype.KeyboardService" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #16: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(java.util.concurrent.ExecutorService.class),
										new ClassItem("com.touchtype_fluency.service.FluencyServiceProxy" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #17: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | STATIC | FINAL | ENUM | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #18: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(java.lang.Boolean.class),

										new ClassItem(android.content.res.Resources.class)

								),

						//Method #19: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(java.lang.Iterable.class),

										new ClassItem("com.touchtype_fluency.service.FluencyServiceProxy" , PUBLIC | EXACT )

								),

						//Method #20: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT ),
										new ClassItem("" , PUBLIC | EXACT ),
										new ClassItem("com.touchtype_fluency.service.languagepacks.layouts.LayoutData.Layout" , PUBLIC | STATIC | FINAL | ENUM | EXACT )

								),

						//Method #21: a
						new MethodProfile
								(
										PRIVATE | VARARGS | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.View[].class)

								),

						//Method #22: a
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(boolean.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #23: b
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #24: b
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #25: b
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),

						//Method #26: b
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(java.lang.Boolean.class),

										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #27: b
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | EXACT )

								),

						//Method #28: c
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("com.touchtype_fluency.service.personalize.service.PersonalizationModel" , PUBLIC | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #29: d
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(java.lang.String.class),

										new ClassItem(android.content.Context.class)

								),

						//Method #30: e
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #31: f
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #32: g
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #33: h
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | ENUM | EXACT ),

										new ClassItem(android.content.Context.class)

								),

						//Method #34: n
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem(java.lang.Integer.class)

								),

						//Method #35: o
						new MethodProfile
								(
										STATIC | FINAL | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #36: p
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(boolean.class)

								),

						//Method #37: q
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(boolean.class)

								),

						//Method #38: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #39: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(int.class)

								),

						//Method #40: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(int.class),
										new ClassItem(int.class)

								),

						//Method #41: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(int.class),
										new ClassItem(int.class),
										new ClassItem(int.class),
										new ClassItem(int.class),
										new ClassItem(int.class),
										new ClassItem(int.class)

								),

						//Method #42: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.content.res.Configuration.class)

								),

						//Method #43: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.inputmethodservice.InputMethodService.Insets.class)

								),

						//Method #44: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.Window.class),
										new ClassItem(boolean.class),
										new ClassItem(boolean.class)

								),

						//Method #45: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.inputmethod.CursorAnchorInfo.class)

								),

						//Method #46: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.inputmethod.EditorInfo.class),
										new ClassItem(boolean.class)

								),

						//Method #47: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | EXACT )

								),

						//Method #48: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | EXACT ),
										new ClassItem(android.view.inputmethod.CompletionInfo.class)

								),

						//Method #49: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(boolean.class)

								),

						//Method #50: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.inputmethod.CompletionInfo[].class)

								),

						//Method #51: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(boolean.class),

										new ClassItem(int.class),
										new ClassItem(android.view.KeyEvent.class)

								),

						//Method #52: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(boolean.class),

										new ClassItem(int.class),
										new ClassItem(boolean.class)

								),

						//Method #53: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.view.inputmethod.EditorInfo.class),
										new ClassItem(boolean.class)

								),

						//Method #54: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(boolean.class)

								),

						//Method #55: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(boolean.class),

										new ClassItem(int.class),
										new ClassItem(android.view.KeyEvent.class)

								),

						//Method #56: c
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.view.View.class)

								),

						//Method #57: d
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #58: e
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.view.View.class)

								),

						//Method #59: f
						new MethodProfile
								(
										FINAL | EXACT ,
										new ClassItem(android.view.View.class)

								),

						//Method #60: g
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(int.class)

								),

						//Method #61: h
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(android.view.View.class)

								),

						//Method #62: i
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(boolean.class)

								),

						//Method #63: j
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #64: k
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #65: l
						new MethodProfile
								(
										FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #66: m
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #67: onHandwritingModelLoadStateChanged
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("com.touchtype_fluency.service.handwriting.HandwritingModelLoadState" , PUBLIC | FINAL | ENUM | EXACT ),
										new ClassItem(java.lang.String.class)

								),

						//Method #68: onLanguageLoadStateChanged
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | EXACT ),
										new ClassItem("com.touchtype_fluency.service.LanguageLoadState" , PUBLIC | FINAL | ENUM | EXACT )

								),

						//Method #69: onMediaMounted
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #70: onMediaUnmounted
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		PRIVATE | EXACT ,

										new ClassItem("com.touchtype.KeyboardService" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(android.content.Context.class),
										new ClassItem(android.content.res.Resources.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("com.touchtype_fluency.service.FluencyServiceProxy" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | STATIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(android.content.ClipboardManager.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem(java.util.Locale.class),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(java.util.Collection.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("com.touchtype_fluency.service.receiver.SDCardReceiverWrapper" , PUBLIC | EXACT ),
										new ClassItem("com.touchtype.keyboard.service.LockScreenWatcher" , PUBLIC | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),


				});

		return newProfile;
	}

	protected static ClassProfile _get_LOCATION_MANAGER_CLASS_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("fhd");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | FINAL );

		newProfile.setTypeParamCount(0);
		newProfile.setSuperClass(	new ClassItem(java.lang.Object.class));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
						new ClassItem("" , INTERFACE | ABSTRACT | EXACT )

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{
						new ClassItem("" , STATIC | FINAL | ENUM | EXACT )

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem(android.content.Context.class)),	//b
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//c
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//d
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//e
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//f
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem(android.content.BroadcastReceiver.class)),	//g
						new FieldItem( PUBLIC | FINAL | EXACT , 	new ClassItem(java.util.concurrent.ExecutorService.class)),	//h
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(android.net.wifi.WifiManager.class)),	//i
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//j
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//k
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//l
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//m
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | FINAL | EXACT )),	//n
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem(android.content.IntentFilter.class)),	//o
						new FieldItem( PRIVATE | FINAL | EXACT , 	new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )),	//p
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(java.util.UUID.class)),	//q
						new FieldItem( PRIVATE | EXACT , 	new ClassItem(android.location.Location.class)),	//r
						new FieldItem( PUBLIC | STATIC | FINAL | EXACT , 	new ClassItem("" , PUBLIC | ABSTRACT | EXACT )),	//a

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(android.content.Context.class),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #1: a
						new MethodProfile
								(
										PRIVATE | STATIC | EXACT ,
										new ClassItem(java.util.List.class),

										new ClassItem(boolean.class),
										new ClassItem(boolean.class),
										new ClassItem(boolean.class),
										new ClassItem(int.class)

								),

						//Method #2: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(void.class),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT ),
										new ClassItem(java.util.UUID.class)

								),

						//Method #3: b
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | FINAL | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #4: b
						new MethodProfile
								(
										PRIVATE | EXACT ,
										new ClassItem(java.lang.String.class),

										new ClassItem(java.util.List.class)

								),

						//Method #5: c
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(java.util.UUID.class),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #6: d
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),

										new ClassItem("" , PUBLIC | FINAL | THIS | EXACT )

								),

						//Method #7: e
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(java.util.List.class)

								),

						//Method #8: f
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(java.util.List.class)

								),

						//Method #9: g
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem(java.util.List.class)

								),

						//Method #10: h
						new MethodProfile
								(
										PRIVATE | STATIC | EXACT ,
										new ClassItem(java.util.List.class)

								),

						//Method #11: i
						new MethodProfile
								(
										PRIVATE | STATIC | EXACT ,
										new ClassItem(java.util.List.class)

								),

						//Method #12: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #13: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(int.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT )

								),

						//Method #14: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(android.location.Location.class)

								),

						//Method #15: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem("com.swiftkey.avro.telemetry.sk.android.LocationGpsResultStatus" , PUBLIC | FINAL | ENUM | EXACT )

								),

						//Method #16: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(java.util.List.class)

								),

						//Method #17: a
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class),

										new ClassItem(java.util.UUID.class)

								),

						//Method #18: b
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #19: c
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),

						//Method #20: d
						new MethodProfile
								(
										PUBLIC | FINAL | EXACT ,
										new ClassItem(void.class)

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		PUBLIC | EXACT ,

										new ClassItem(android.content.Context.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(android.net.wifi.WifiManager.class),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT ),
										new ClassItem("" , PUBLIC | FINAL | EXACT ),
										new ClassItem(android.content.IntentFilter.class),
										new ClassItem(java.util.concurrent.ExecutorService.class),
										new ClassItem("" , PUBLIC | INTERFACE | ABSTRACT | EXACT )

								),


				});

		return newProfile;
	}

	protected static ClassProfile _get_COLLECTION_CLASS_USE_BY_LOCATION_PROFILE()
	{
		ClassProfile newProfile = new ClassProfile();

		newProfile.setFullPath("cas");
		newProfile.setKnownPath("");

		newProfile.setMinDepth(0);
		newProfile.setMaxDepth(0);
		newProfile.setModifiers(PUBLIC | ABSTRACT );

		newProfile.setTypeParamCount(1);
		newProfile.setSuperClass(	new ClassItem("" , PUBLIC | ABSTRACT | EXACT ));
/////////////////////////
//Interfaces
/////////////////////////
		newProfile.setInterfaces(new ClassItem[]
				{
						new ClassItem(java.util.Set.class)

				});
/////////////////////////
//Nested Classes
/////////////////////////
		newProfile.setNestedClasses(new ClassItem[]
				{
						new ClassItem("" , PUBLIC | STATIC | EXACT )

				});
/////////////////////////
//Declared fields
/////////////////////////
		newProfile.setDeclaredFields(new FieldItem[]
				{

				});
/////////////////////////
//Declared Methods
/////////////////////////
		newProfile.setDeclaredMethods(new MethodProfile[]
				{
						//Method #0: a
						new MethodProfile
								(
										PRIVATE | STATIC | EXACT ,
										new ClassItem(int.class),

										new ClassItem(int.class)

								),

						//Method #1: a
						new MethodProfile
								(
										STATIC | SYNTHETIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(int.class),
										new ClassItem(java.lang.Object[].class)

								),

						//Method #2: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Iterable.class)

								),

						//Method #3: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class)

								),

						//Method #4: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class)

								),

						//Method #5: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class)

								),

						//Method #6: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class)

								),

						//Method #7: a
						new MethodProfile
								(
										PUBLIC | STATIC | VARARGS | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object.class),
										new ClassItem(java.lang.Object[].class)

								),

						//Method #8: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.util.Collection.class)

								),

						//Method #9: a
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object[].class)

								),

						//Method #10: b
						new MethodProfile
								(
										PRIVATE | STATIC | VARARGS | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(int.class),
										new ClassItem(java.lang.Object[].class)

								),

						//Method #11: b
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT ),

										new ClassItem(java.lang.Object.class)

								),

						//Method #12: g
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | THIS | EXACT )

								),

						//Method #13: h
						new MethodProfile
								(
										PUBLIC | STATIC | EXACT ,
										new ClassItem("" , PUBLIC | STATIC | EXACT )

								),

						//Method #14: b
						new MethodProfile
								(
										PUBLIC | ABSTRACT | EXACT ,
										new ClassItem("" , PUBLIC | ABSTRACT | EXACT )

								),

						//Method #15: equals
						new MethodProfile
								(
										PUBLIC | EXACT ,
										new ClassItem(boolean.class),

										new ClassItem(java.lang.Object.class)

								),

						//Method #16: hashCode
						new MethodProfile
								(
										PUBLIC | EXACT ,
										new ClassItem(int.class)

								),

						//Method #17: i_
						new MethodProfile
								(
										EXACT ,
										new ClassItem(boolean.class)

								),

						//Method #18: iterator
						new MethodProfile
								(
										PUBLIC | SYNTHETIC | EXACT ,
										new ClassItem(java.util.Iterator.class)

								),


				});
/////////////////////////
//Declared Constructors
/////////////////////////
		newProfile.setDeclaredConstructors(new ConstructorProfile[]
				{
						//Constructor #0
						new ConstructorProfile
								(		EXACT ,

										new ClassItem[0]

								),


				});

		return newProfile;
	}



}
