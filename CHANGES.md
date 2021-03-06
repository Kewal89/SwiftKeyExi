# Changelog
All notable changes to this project will be documented in this file.  
Dates are in the format dd/mm/yyyy

## [2.7.1] - 20-09-2020
### Fixed
 - Fixed crash caused by bad comparator

## [2.7.0] - 14-05-2020
### Fixed
 - Compatibility targeting 7.5.5.15 ( keys, quick menu, shortcuts
 - Long preferences getting cut off in some languages

## [2.6.9] - 25-04-2020
### Fixed
 - Text being inserted when long-pressing to remove a prediction
 - Prediction insertion in flow failing sometimes ( probably significant performance impact )

### Added
 - text selection using mod + arrow keys
 
### Changed
 - Updated translations ( Russian, Brazilian-portuguese )

## [2.6.8] - 03-04-2020
### Fixed
 - Emoji panel locking up Swiftkey ( Beta )
 - Quick-menu in sectioned layouts ( Chinese stroke etc )
 - Long popup strings being inserted correctly in certain fields

### Added
 - Text action to toggle number row
 - Text action to toggle toolbar
 
### Changed
 - Maximize predictions retains toolbar toggle button by default ( swipe gesture in settings )
 - Made Swipe gesture to open toolbar less sensitive

## [2.6.7] - 21-03-2020
### Fixed
 - Replacement toolbar toggle not working after some time

### Added
 - Option to set GIF search region to US ( other regions filter NSFW results regardless of SafeSearch setting )

## [2.6.6] - 18-03-2020
### Fixed
 - Compatibility targeting 7.5.1.5 ( ClassHunter library update )

### Added
 - Separate size modifier for emoji/gif/sticker panels

### Changed
 - Replaced toolbar toggle button with vertical swipe when maximize predictions enabled

## [2.6.5] - 07-03-2020
### Fixed
 - Emoji panel tab icons not displaying no some devices
 - Some emoji missing skin tone modifiers
 - Some emoji missing triangle indicating they support skin tones
 - Insert Newline action not working when triggered via hotkey

## [2.6.0] - 02-03-2020
### Added
 - Auto-width emoji panels
 - Insert Newline text action

### Fixed
 - Compatibility targeting 7.5.0.8 ( Emoji, jumping cursor, prediction bar stuff )

### Changed
 - Updated to Android 10 ( Unicode 13.0 ) Emoji ( Properly this time ) 
 - Swipe-selection RTL support disabled by default
 - Updated French translations

## [2.5.3] - 06-12-2019
### Fixed
 - Compatibility targeting 7.4.5.3 ( Emoji panel )
 
### Changed
 - Updated translations ( Polish, Russian )

## [2.5.1] - 19-11-2019
### Added
 - Quick/hotkey actions to toggle auto-correct, incognito mode, and both at the same time.
 - Paste-as-plain-text action

### Changed
 - Updated emoji ( Android 10 )
 - Updated French translation

## [2.4.1] - 11-11-2019
### Fixed
 - Compatibility targeting 7.4.3.32 ( Spacebar / Anything overlay related )

## [2.4.0] - 02-10-2019
### Fixed
 - Compatibility targeting 7.4.0.17 ( Swipe-selection, quick menu, jumping cursor, hotkeys )
 - Bing redirect not being removed from gif when inserted as text link
 - Lenny

## [2.3.6] - 28-08-2019
### Fixed
 - Cursor reverting to old position when moving vertically ( swipe-selection )
 - Swipe-selection and quick-menu failing for some users ( NPE )

## [2.3.5] - 22-08-2019
### Fixed
 - Compatibility targeting 7.3.7.18 ( Everything, backwards compatible except custom sound )
### Changed
 - Toolbar shortcut removed

## [2.3.4] - 18-07-2019
### Fixed
 - Compatibility targeting 7.3.5.18 ( Predictions )
 - Workaround for module entry being called multiple times by XposedBridge

## [2.3.2] - 06-07-2019
### Fixed
 - Compatibility targeting 7.3.4.17 ( Emoji panel )

## [2.3.1] - 24-06-2019
### Fixed
 - Compatibility targeting 7.3.3.10 ( Everything keyboard key related )

## [2.3.0] - 17-06-2019
### Added
 - Drag & Drop emoji editing ( Adding, rearranging, removing )
 
### Changed
 - Emoji panel icons selected using pick will b/w rather than color emoji

## [2.2.3] - 05-06-2019
### Fixed
 - Long prediction shortcuts being ellipsized
 - No punctuation autospace sometimes not applying to ampersand (&)
 
### Changed
 - Updated translations ( Russian )

## [2.2.2] - 26-05-2019
### Fixed
 - Compatibility targeting 7.3.1.17 ( Fixing anything prediction related )

### Added
 - Option to disable auto-removal of space before punctuation.
 - Option to disable auto-space when inserting predicitons

## [2.2.1] - 26-04-2019
### Changed
 - Compatibility targeting 7.2.9.36 ( Nothing was broken )
 - Translations ( Russian )

## [2.2.0] - 01-04-2019
### Fixed
 - Compatibility targeting 7.2.7.16 ( location feature unlock)

### Added
 -  Settings Backup & Restore

## [2.1.3] - 11-03-2019
### Fixed
 - Compatibility targeting 7.2.4.22 ( swipe/popup key issue )
 - Bing redirect not being removed when gif inserted as link text instead of content

### Added
 - Debug output when class/method profiles do not match exactly ( logcat )
 
### Changed
 - Translations updated ( Russian, Brazillian-Portugese, Polish )
 - Removed attempted EdXposed GC crash fix

## [2.1.0] - 28-02-2019
### Fixed
 - Swiftkey crashing a few times before working when using EdXposed ( maybe )

### Added
 - Option to only enable remapped hardware keys when keyboard is open
 
### Changed
 - Translations updated ( Russian, Brazillian-Portugese )

## [2.0.4] - 16-02-2019
### Fixed
 - Compatibility ( targeting 7.2.3.24, hide predictions )

## [2.0.3] - 12-02-2019
### Fixed
 - Shift key not working when used with EDxPosed
 - Swipe selection cursor jumping when moving near line breaks
 
### Added
 - Intent to set theme, incognito, and vibrate via tasker
 - Option to remove Bing url redirect from gifs
 
### Changed
 - Updated translations ( Polish, Russian )
 - Remove vibrate quick pref ( moved to intent )

## [1.9.1] - 01-02-2019
### Fixed
 - Iterated the the bloody version code.
 
## [1.9.0] - 01-02-2019
### Fixed
 - Compatibility targeting 7.2.2.31 ( Custom search, sticky incognito 
 - broken thumb layout, empty space next to keyboard on some devices.
 
### Added
 - Separate keyboard size multipler for landscape/portrait
 
### Changed
 - Updated translations ( Polish, Russian, Croatian )

## [1.8.2] - 03-01-2019
### Fixed
 - Compatibility targeting 7.2.1.17 ( only Emoji panel affected )

### Changed
 - Updated translations ( Croatian & Polish )

## [1.8.1] - 05-12-2018
### Fixed
 - Compatibility targeting 7.1.9.23
 - Cursor getting stuck when transitioning from swipe-selection to quick menu
 - Rare crash caused by missing hook requirement check

### Added
 - Customizable search

### Changed
 - Updated emoji ( Android Pie )

## [1.7.2] - 04-11-2018
### Fixed
 - Compatibility targeting 7.1.7.31
 - Native left-swipe gesture erasing wrong text when used after swipe-selection
 
## [1.7.0] - 01-11-2018
### Fixed
 - Primary candidate missing punctuation immediately after swipe-selecting
 - Exi shortcut button in toolbar
 
### Added
 - Unlocked the Location feature for all territories
 - Insert text action to Quick Menu
 - Use system vibration setting toggle to quick settings
 
### Changed
 - Made incognito mode setting persist across reboots
 - Vibration when triggering quick menu or inserted candidate will respect Swiftkey vibration setting
 - Updated Russian translations
 - Updated Croatian translations


## [1.6.1] - 02-09-2018
### Fixed
 - Swipe, quick-menu, and hotkeys breaking after a while.

### Changed
 - Added missing translations

### Unchanged
 - Still not compatible with old Swiftkey stable version.
   Wait until Swiftkey update or use beta ( or revert to Exi 1.5.4 )


## [1.6.0] - 21-08-2018
### Fixed
 - Compatibility targeting 7.1.2.20 ( breaks backwards compatibility )
 - Recent emoji being cleared at random
 - No punctuation auto-space sometimes not being applied until toggled again
 
### Added
 - Option to hide predictions bar
 - Option to display shortcut to Exi config app in toolbar

## [1.5.4] - 21-07-2018
### Fixed
 - Immediate crash on Oreo devices ( Async setup disabled to fix )
 - Disable full-screen mode not working correctly
 
### Added
 - Option to disable vertical cusor movement when swiping

## [1.5.3] - 23-06-2018
### Fixed
 - Module not working due to main hook failing ( 7.0 7.28/8.362 )

## [1.5.2] - 31-05-2018
### Fixed
 - Keyboard not centering properly on some devices
 - Swiping from shift messing with auto-capitalization
 - Emoji tabs not matching keyboard theme
 
### Added
 - Async hook setup with progress displayed on keyboard
 
### Changed
 - Removed Emoji pre-rendering
 
## [1.4.2] - 12-05-2018
### Fixed
 - Keyboard overlay breaking everything ( targeting 7.0.5.22 )
 - More suggestions suggestions crashing on click ( targeting 7.0.5.22 )
 
## [1.4.2] - 17-04-2018
### Fixed
 - Keyboard opacity being reset after orientation change
 
### Added
 - Default diverse emoji modifier

## [1.4.1] - 11-04-2018

### Fixed
 - Emoji font size setting sometimes not being applied
 - Quick menu and hotkey popups not displaying correctly in floating keyboard
 - Crash caused by incomplete database initialization
 - Swiftkey crash when updating module without restarting device
 
### Added
 - Remappable hardware keys
 - Configurable hardware key shortcuts
 - Undo / Redo text actions ( Android Marshmallow and later )
 - Keyboard transparency slider ( for floating keyboard)
 - Option to disable support for RTL text when swipe-selecting ( for compatibility )
 - Memory limit to emoji render cache
 - Ability to cancel quick-menu by return finger to start location on the space bar
 - Croatian translation courtesy of Dino (dugi991) 
 
### Changed
 - Increased max emoji font size
 - No-Punctuation auto-space now also applies to ampersand and hyphen characters
 
## [1.3.4] - 23-01-2018

### Fixed
 - Vertical selection not triggering on vertical swipe
 - Both fingers moving the same cursor when moving vertically
 - Module failing to load on Kitkat (and anything below nougat?)
 - Keyboard size modifier not working on some systems
 
 ### Changed
 - Added more log output to Xposed in addition to logcat

## [1.3.3] - 18-01-2018

### Fixed
 - Keys being input when attempting to trigger 2-finger gesture swipe selection
 - Emoji failing to load in Android Oreo (8.0) and above
 - Both fingers controlling the same cursor when starting selection from the end of a text block.
 
## [1.3.2] - 15-01-2018

### Fixed
 - More suggestions and removal of black bars surrounding candidates targeting >6.7.4.31
 - Fixed keys being input before swipe in hold-and-swipe modes
 - Fixed new emoji back button being too small ( >6.7.5.28)
 
### Added
 - Toggle to enable/disable vibration when inputting emoji (Exi panel only)
 - Keyboard size multiplier (Range 0.3 to 3.0)

### Changed
 - Recent Emoji panel can now be cleared like the other user-created panels

## [1.3.1] - 06-12-2017

### Changed
- Device will now vibrate when you input an emoji
- Shortcuts will no longer be ellipsized
- Translations updated, Russian/Polish now complete
- More file types allowed when selecting custom sounds

## [1.3.0] - 30-11-2017

### Fixed
- Cursor sometimes being to wrong position when inserting shortcut
- Popups not respecting case (Upper can also be set manually)
- Shortcuts being inserted into flow even when disabled

### Added
- Option to set custom keypress sounds
- Number-row swipe-selection mode
- RTL language support for swipe selection
- Option to disable cursor jumping to end of word
- Option to display NSFW Gifs
- Option to disable full-screen keyboard mode
- Polish translation (Thanks to xda user )
- French translation (Thanks to xda user )

## [1.2.1] - 02-11-2017

### Fixed
- Some emoji rendering as text instead of bitmap-emoji
- Emoji losing diverse modifiers when using "add-all emoji to panel"
- Cursor not jumping to end of word when tapping it on-screen

### Added
- Ability to choose between pre- and post-nougat stock emoji panels
- Option to remove existing popup keys
- Russian translation (Thanks to xda user alex_long)
- Brazilian Portuguese translation (Thanks to xda user X_hunter)

## [1.2.0] - 28-10-2017

### Fixed
- More suggestions
- Dark/Light theming in emoji panel
- Overlay hook sometimes not being called, breaking the quick-menu

### Added
- Diverse Emoji support
- Icons to all menus
- Ability to partially restore stock configuration

### Changed
- Emoji panels to match Nougat
- Stock Emoji panels to be unmodifiable
- Emoji menus to be more intuitive

### Broke
- Support for Swiftkey 6.6.7.24

## [1.1.1] - 02-10-2017
### Fixed
- Crash when flow shortcuts enabled

## [1.1.0] - 01-10-2017
### Fixed
- Disable auto-space after punctuation accidentally removing all punctuation rules
- Numerous style and theming issues
- Swipe-to-hotkey sometimes not working properly

### Added
- Ability to configure the Quick-Menu 
- Go-to-start text action

## [1.0.3] - 10-09-2017
### Fixed
- Compatibility targeting Swiftkey Beta 6.6.7.28

## [1.0.2] - 24-08-2017
### Fixed
- Quick Menu triggering with the wrong finger
- Custom actions with the Shift key not working in some langauges (e.g. Korean)
- ;-) emoticon having been incorrectly entered as ,-) ( Will not affect existing installs )
- Emoji replacing composing text instead of inserting cleanly

### Added
- Verical cursor movement when swiping
- Ability to disable auto-space after punctuation

## [1.0.1] - 08-08-2017
### Fixed
- Popups always being upper case. They are now input as-is
- Fontloader redundantly loading fonts on every launch

### Added
- Button to open keyboard in most sections of the app

### Changed
- Redesigned Swipe Speed slider
- Menu title and descriptions changed to be less confusing

## [1.0.0] - 02-08-2017
### Added
- Initial Release
