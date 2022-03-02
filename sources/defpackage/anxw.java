package defpackage;

import com.android.volley.toolbox.ImageRequest;

/* renamed from: anxw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum anxw implements auco {
    UNKNOWN_ACTION(0),
    FACET_VIEW(1),
    LENS_SWITCHER_TAP_OPEN(2),
    LENS_SWITCHER_TAP_CLOSE(3),
    DRAWER_TAP(4),
    MIC_TAP(5),
    SCREEN_VIEW(6),
    BACK_BUTTON(7),
    BACK_BUTTON_REPEATED(8),
    EXPANDING_ACTION_PANEL_OPENED(9),
    EXPANDING_ACTION_PANEL_CLOSED(10),
    LIFETIME_NOTIFICATION_RETURN(50),
    LIFETIME_NOTIFICATION_EXIT(51),
    STATUS_BAR_SWIPE_DOWN(60),
    STATUS_BAR_GET_CAR_WINDOW_MANAGER(61),
    FACET_BAR_SWIPE_OPEN(70),
    FACET_BAR_SWITCH_REJECTED(71),
    PHONE_CALL_HISTORY(100),
    PHONE_FAVORITES(101),
    PHONE_MISSED_CALLS(102),
    PHONE_DIAL_NUMBER(103),
    PHONE_VOICEMAIL(104),
    PHONE_ACCEPT_CALL(105),
    PHONE_TOGGLE_DIALPAD(106),
    PHONE_REJECT_CALL(107),
    PHONE_END_CALL(108),
    PHONE_TOGGLE_MUTE(109),
    PHONE_TOGGLE_SPEAKER(110),
    PHONE_DIALPAD_FAB_TAP(111),
    PHONE_MERGE_CALL(112),
    PHONE_TOGGLE_HOLD_CALL(113),
    PHONE_SWAP_CALL(114),
    PHONE_DELETE(115),
    PHONE_DIALPAD_CALL_NUMBER(116),
    PHONE_DIALPAD_END_CALL(117),
    PHONE_DIALPAD_LONG_PRESS_VOICEMAIL(118),
    PHONE_PLACE_CALL(119),
    PHONE_DELETE_LONG_PRESS(120),
    PHONE_CONTACTS(121),
    PHONE_SHOW_AUDIO_ROUTE_OPTIONS(122),
    PHONE_CALL_LAST_NUMBER(123),
    PHONE_CALL_STARRED(124),
    PHONE_CALL_RECENT(125),
    PHONE_CALL_LATEST(126),
    PHONE_DIAL_FROM_INTENT(127),
    PHONE_DIALPAD_PLACE_CALL_FROM_INTENT(128),
    PHONE_DIALPAD_CLOSE(129),
    PHONE_GOTO_DIALER_FACET(130),
    PHONE_RETURN_MISSED_CALL(131),
    PHONE_DIALPAD_OPEN(132),
    PHONE_DISMISS_INCOMING_CALL_HUN(133),
    PHONE_NEW_CALL_BLOCKED_BY_ONGOING(134),
    PHONE_STARRED_CONTACTS_NODE_HIDDEN(135),
    PHONE_CALL_FROM_INTENT(136),
    PHONE_CALL_DURATION(137),
    AUDIO_ROUTE_USE_BLUETOOTH(145),
    AUDIO_ROUTE_USE_HEADSET(146),
    AUDIO_ROUTE_USE_SPEAKER(147),
    AUDIO_ROUTE_USE_EARPIECE(148),
    AUDIO_ROUTE_USE_UNKNOWN(149),
    CONTACT_DETAILS(150),
    OVERVIEW_CARD_TAP(200),
    OVERVIEW_CARD_SWIPE_LEFT(201),
    OVERVIEW_CARD_SWIPE_RIGHT(202),
    OVERVIEW_FEEDBACK(203),
    OVERVIEW_SETTINGS(204),
    OVERVIEW_ABOUT_ANDROID_AUTO(205),
    OVERVIEW_APPS_FOR_ANDROID_AUTO(206),
    OVERVIEW_EXIT(207),
    OVERVIEW_CARD_TAP_NO_ACTION(208),
    OVERVIEW_MESSAGE_AUTOREPLY(209),
    OVERVIEW_MESSAGE_MUTE(210),
    OVERVIEW_MESSAGE_UNMUTE(211),
    OVERVIEW_HELP_AND_FEEDBACK(212),
    OVERVIEW_SCROLL_DOWN(213),
    OVERVIEW_SCROLL_UP(214),
    OVERVIEW_CARD_IMPRESS(215),
    OVERVIEW_CARD_CREATED(216),
    OVERVIEW_PRESENTER_CRASH(217),
    OVERVIEW_CARD_DISMISS_CONTAINER_SHOW(218),
    OVERVIEW_CARD_LONG_PRESS_DISMISS(219),
    OVERVIEW_CARD_DISMISS(220),
    OVERVIEW_CALENDAR_EVENT_FIRST_PARTY(221),
    OVERVIEW_CALENDAR_EVENT_THIRD_PARTY(222),
    OVERVIEW_MINIMIZE(223),
    OVERVIEW_MESSAGE_READ(224),
    OVERVIEW_MESSAGE_SHARE_LOCATION_AUTOREPLY(225),
    OVERVIEW_MESSAGE_SHARE_ETA_AUTOREPLY(226),
    OVERVIEW_MESSAGE_OFFER_TEXT_VISIBILITY_CONTROL(227),
    OVERVIEW_MESSAGE_SHOW_TEXT(228),
    OVERVIEW_MESSAGE_HIDE_TEXT(229),
    NOTIFICATION_VIEW(300),
    NOTIFICATION_DISMISS(301),
    NOTIFICATION_TAP_NO_ACTION(302),
    NOTIFICATION_NAVIGATE_MAPS(303),
    NOTIFICATION_READ_MESSAGE(304),
    NOTIFICATION_ACCEPT_CALL(305),
    NOTIFICATION_REJECT_CALL(306),
    NOTIFICATION_NAVIGATE_MEDIA(307),
    NOTIFICATION_SHOW_SDK(308),
    NOTIFICATION_SHOW_TOAST(309),
    NOTIFICATION_MESSAGE_AUTOREPLY(310),
    NOTIFICATION_MESSAGE_MUTE_CONVERSATION(311),
    NOTIFICATION_MESSAGE_SHARE_ETA(312),
    NOTIFICATION_MESSAGE_SHARE_LOCATION(313),
    NOTIFICATION_MESSAGE_OFFER_TEXT_VISIBILITY_CONTROL(314),
    NOTIFICATION_MESSAGE_SHOW_TEXT(315),
    NOTIFICATION_MESSAGE_HIDE_TEXT(316),
    NOTIFICATION_DISMISS_ON_WINDOW_FOCUS_CHANGE(317),
    NOTIFICATION_DISMISS_ON_CLOSE_BUTTON_PRESSED(318),
    NOTIFICATION_DISMISS_ON_TIMEOUT(319),
    NOTIFICATION_DISMISS_SWIPE_TOUCH_ONLY(320),
    NOTIFICATION_DISMISS_ON_BACK_BUTTON_PRESSED(321),
    NOTIFICATION_DISMISS_ON_SCRIM_PRESSED(322),
    DRAWER_OPEN(400),
    DRAWER_ITEM_SELECT(401),
    DRAWER_BACK(402),
    DRAWER_SCROLL_DOWN(403),
    DRAWER_SCROLL_UP(404),
    DRAWER_GESTURE_UP(405),
    DRAWER_GESTURE_DOWN(406),
    DRAWER_TAP_LIMIT_DISPLAYED(407),
    DRAWER_UNLIMITED_BROWSE_EXIT_DISPLAYED(408),
    DRAWER_CONTENT_LOAD_ON_SELECT(409),
    DRAWER_CONTENT_LOAD_ON_BACK(410),
    DRAWER_CLOSE(411),
    ALPHA_JUMP_AVAILABLE(412),
    ALPHA_JUMP_OPEN(413),
    ALPHA_JUMP_CHARACTER_SELECT(414),
    ALPHA_JUMP_CLOSED(415),
    DRAWER_TAP_LIMIT_DISMISSED(416),
    DRAWER_TAP_LIMIT_DISPLAYED_FIRST_TIME(417),
    DRAWER_TAP_LIMIT_IGNORED_DUE_TO_SPEED(418),
    DRAWER_TAP_LIMIT_DISPLAYED_WITH_SPEED(419),
    DRAWER_TAP_LIMIT_DISPLAYED_WITHOUT_SPEED(420),
    SPEED_BUMP_PERMIT_REQUESTED(421),
    SPEED_BUMP_PERMIT_DENIED(422),
    FRX_ENTER_VANAGON(500),
    FRX_ENTER_PROJECTED(501),
    FRX_ENTER_AUTOLAUNCH_SETUP(502),
    FRX_SCREEN_ACCEPT(505),
    FRX_SCREEN_REJECT(506),
    FRX_SCREEN_MORE_INFO(507),
    FRX_SCREEN_SELECT(508),
    FRX_SCREEN_CANCELLED(509),
    FRX_SCREEN_EXIT(510),
    FRX_EXIT_SUCCESS(515),
    FRX_EXIT_FAILED(516),
    FRX_DOWNLOAD_FAIL_INACTIVE(517),
    FRX_DOWNLOAD_FAILED_FINISH(518),
    FRX_DOWNLOAD_FAILED_NETWORK(519),
    FRX_DOWNLOAD_FAILED_CANCEL(520),
    FRX_DOWNLOAD_SUCCESS(521),
    FRX_DOWNLOAD_MULTIPLE(522),
    FRX_DOWNLOAD_START(523),
    FRX_DOWNLOAD_START_FAILED(524),
    FRX_DOWNLOAD_INSTALLATION_ERROR(525),
    FRX_SENSITIVE_PERMISSIONS_REQUEST_FLOW_STARTED(526),
    FRX_SENSITIVE_PERMISSIONS_REQUEST_NOT_GRANTED(527),
    FRX_ACTIVATION(528),
    FRX_USB_RESET_ATTEMPT(529),
    FRX_PRESETUP_FORCE_FINISH(530),
    FRX_PRESETUP_START_USB(531),
    FRX_PRESETUP_START_WIFI(532),
    SETTINGS_CHANGE_WIFI(550),
    SETTINGS_CHANGE_BLUETOOTH(551),
    SETTINGS_CHANGE_AUTO_LAUNCH(552),
    SETTINGS_CHANGE_VOLUME_PROFILE(553),
    SETTINGS_CHANGE_POWER_POLICY(554),
    SETTINGS_CHANGE_CUSTOM_REPLY_MESSAGE(555),
    SETTINGS_CHANGE_AUTO_ROTATE(556),
    SETTINGS_CHANGE_POWER_POLICY_ALWAYS_ON(557),
    SETTINGS_CHANGE_POWER_POLICY_ALWAYS_ON_WHEN_POWERED(558),
    SETTINGS_CHANGE_POWER_POLICY_SYSTEM(559),
    SETTINGS_TOGGLE_AUTO_LAUNCH(560),
    SETTINGS_AUTO_LAUNCH_DEVICE_NON_EMPTY(561),
    SETTINGS_AUTO_LAUNCH_DEVICE_TOGGLE(562),
    SETTINGS_CHANGE_MESSAGE_NOTIFICATIONS(563),
    SETTINGS_AA_GOOGLE_SETTINGS_OPEN(564),
    SETTINGS_AA_GOOGLE_SETTINGS_CALL_TO_ACTION(565),
    SETTINGS_AA_GOOGLE_SETTINGS_GET_THE_APP(566),
    SETTINGS_AA_GOOGLE_SETTINGS_LEARN_MORE(567),
    SETTINGS_AA_GOOGLE_SETTINGS_DOWNLOAD_SUCCESS(568),
    SETTINGS_TELEMETRY_ENABLED(569),
    SETTINGS_TELEMETRY_DISABLED(570),
    SETTINGS_CHANGE_VISUAL_PREVIEW(571),
    SETTINGS_HD_PROJECTION_ON(572),
    SETTINGS_HD_PROJECTION_OFF(573),
    SETTINGS_SHOW_LOCK_SCREEN(574),
    SETTINGS_CHANGE_LAUNCHER_ICON_VISIBILITY(575),
    SETTINGS_MESSAGING_MUTE_GROUP_CONVERSATIONS(576),
    SETTINGS_MESSAGING_GROUP_NOTIFICATIONS(577),
    SETTINGS_AUTOPLAY_MEDIA(578),
    SETTINGS_VISUAL_PREVIEW_ON(579),
    SETTINGS_VISUAL_PREVIEW_OFF(580),
    SETTINGS_LAUNCHER_ICON_VISIBILITY_ON(581),
    SETTINGS_LAUNCHER_ICON_VISIBILITY_OFF(582),
    SETTINGS_MESSAGING_GROUP_NOTIFICATIONS_ON(583),
    SETTINGS_MESSAGING_GROUP_NOTIFICATIONS_OFF(584),
    SETTINGS_NEW_AUTO_EXPERIENCE(585),
    SETTINGS_CHANGE_ANY(586),
    SETTINGS_ACCEPT_TRY_MORRIS(590),
    SETTINGS_HIDE_TRY_MORRIS(591),
    SETTINGS_SHOW_MEDIA_NOTIFICATIONS(592),
    SETTINGS_NO_NOTIFICATION_SOUND(593),
    AUTO_LAUNCH_BLUETOOTH_START(600),
    AUTO_LAUNCH_BLUETOOTH_END(601),
    AUTO_LAUNCH_BLUETOOTH_PARTNER_START(602),
    AUTO_LAUNCH_BLUETOOTH_PARTNER_END(603),
    LOCK_WAITER_START(604),
    LOCK_WAITER_SUCCESS(605),
    LOCK_WAITER_TIME_OUT(606),
    LOCK_WAITER_NULL_INTENT(607),
    LOCK_WAITER_EARLY_DESTROY(608),
    KEYBOARD_OPEN(700),
    KEYBOARD_DONE(701),
    KEYBOARD_CLOSE(702),
    KEYBOARD_CHANGE_KEYGROUP(703),
    KEYBOARD_HANDWRITING_RECOGNITION(704),
    KEYBOARD_EXTERNAL_OPEN(705),
    KEYBOARD_LANGUAGE_SWITCH(706),
    KEYBOARD_EXTERNAL_TYPE(707),
    KEYBOARD_EXTERNAL_DEFAULT_ON(708),
    KEYBOARD_EXTERNAL_DEFAULT_OFF(709),
    KEYBOARD_EXTERNAL_PROXIMITY_NEAR(710),
    KEYBOARD_EXTERNAL_PROXIMITY_FAR(711),
    APP_SELECTED(800),
    RAIL_UNKNOWN_ACTION(850),
    RAIL_MAPS_TAP(851),
    RAIL_PHONE_TAP(852),
    RAIL_OVERVIEW_TAP(653),
    RAIL_MEDIA_TAP(854),
    RAIL_OEM_TAP(855),
    MEDIA_PLAY(901),
    MEDIA_PAUSE(902),
    MEDIA_SKIP_TO_NEXT(903),
    MEDIA_SKIP_TO_PREVIOUS(904),
    MEDIA_CUSTOM_ACTION(905),
    MEDIA_STOP(906),
    MEDIA_OPEN_QUEUE(907),
    MEDIA_DISPLAY_SEARCH_RESULTS(908),
    MEDIA_METADATA_BITMAP_FOUND(909),
    MEDIA_ATTEMPT_RESUME_PLAYBACK_DURING_CALL(910),
    MEDIA_ATTEMPT_STOP_PLAYBACK_DURING_CALL(911),
    MEDIA_PLAYBACK_STATE_ERROR_WHILE_BROWSE_VISIBLE(912),
    MEDIA_PLAYBACK_STATE_ERROR_WHILE_PLAYBACK_VISIBLE(913),
    MEDIA_PLAYBACK_STATE_ERROR_RESOLVED(914),
    MEDIA_PLAYBACK_STATE_ERROR_EXITED_ACTIVITY(915),
    MEDIA_METADATA_REMOTE_URI_FOUND(916),
    MEDIA_PLAYBACK_STATE_IS_ERROR(917),
    MEDIA_PLAYBACK_STATE_IS_NONE_OR_NULL(918),
    MEDIA_PLAYBACK_STATE_IS_BUFFERING_OR_CONNECTING(919),
    MEDIA_PLAYBACK_STATE_IS_PLAYING(920),
    MEDIA_PLAYBACK_STATE_IS_PAUSED_OR_STOPPED(921),
    MEDIA_BROWSE_SERVICE_CONNECTED(922),
    MEDIA_BROWSE_SERVICE_FAILED_TO_CONNECT(923),
    MEDIA_BROWSE_SERVICE_SUSPENDED(924),
    HATS_SURVEY_SHOWN(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS),
    HATS_NOTIFICATION_SHOWN(1001),
    HATS_NOTIFICATION_TIMEOUT(1002),
    HATS_NOTIFICATION_DISMISS(1003),
    RATING_PROMPT_INTERACTION(1100),
    CALENDAR_PERMISSION_NOTIFICATION_POSTED(1200),
    CALENDAR_PERMISSION_NOTIFICATION_SELECTED(1201),
    CALENDAR_PERMISSION_ACCEPTED(1202),
    CALENDAR_PERMISSION_DECLINED(1203),
    AUTOLAUNCH_PROMPT_SHOWN(1300),
    AUTOLAUNCH_PROMPT_DISMISSED(1301),
    AUTOLAUNCH_PROMPT_TAPPED(1302),
    AUTOLAUNCH_PROMPT_DIALOG_CANCELLED(1303),
    AUTOLAUNCH_PROMPT_DIALOG_ACCEPTED(1304),
    EXIT_CONFIRMATION_DIALOG_SHOW(1400),
    EXIT_CONFIRMATION_DIALOG_BACK(1401),
    EXIT_CONFIRMATION_DIALOG_EXIT(1402),
    EXIT_CONFIRMATION_DIALOG_MINIMIZE(1403),
    EXIT_CONFIRMATION_DIALOG_STARTED_FROM_HOME_BUTTON(1404),
    EXIT_CONFIRMATION_DIALOG_DIRECT_ESCAPE(1405),
    DRIVING_MODE_SETTINGS(1500),
    DRIVING_MODE_BEHAVIOR_SETTINGS(1501),
    DRIVING_MODE_MANUAL_TOGGLE_ENABLED(1502),
    DRIVING_MODE_MANUAL_TOGGLE_DISABLED(1503),
    DRIVING_MODE_PREFERENCE_GEAR_CLICKED(1504),
    DRIVING_MODE_SETTINGS_CHANGED_ACTIVITY_RECOGNITION(1505),
    DRIVING_MODE_SETTINGS_CHANGED_PROMPT_BEFORE_LAUNCH(1506),
    DRIVING_MODE_SETTINGS_CHANGED_POCKET_DETECTION(1507),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_ON_WHILE_DRIVING(1508),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH(1509),
    DRIVING_MODE_SETTINGS_CHANGED_BLUETOOTH_AUTOLAUNCH_DEVICE(1510),
    DRIVING_MODE_AUTOMATIC_RULES_SETTINGS(1511),
    DRIVING_MODE_LAUNCH_NOTIFICATION_SHOW(1512),
    DRIVING_MODE_LAUNCH_NOTIFICATION_ACCEPT(1513),
    DRIVING_MODE_LAUNCH_NOTIFICATION_CANCEL(1514),
    DRIVING_MODE_LAUNCH_NOTIFICATION_SNOOZE(1515),
    DRIVING_MODE_BLUETOOTH_AUTOLAUNCH_SETTINGS(1516),
    DRIVING_MODE_START_GEARHEAD_BEHAVIOR(1517),
    DRIVING_MODE_START_DND_BEHAVIOR(1518),
    DRIVING_MODE_START_THIRDPARTY_BEHAVIOR(1519),
    DRIVING_MODE_START_EMPTY_BEHAVIOR(1520),
    DRIVING_MODE_STOP_GEARHEAD_BEHAVIOR(1521),
    DRIVING_MODE_STOP_DND_BEHAVIOR(1522),
    DRIVING_MODE_STOP_THIRDPARTY_BEHAVIOR(1523),
    DRIVING_MODE_STOP_EMPTY_BEHAVIOR(1524),
    DRIVING_MODE_SETTINGS_CHANGED_AUTOMATIC_RULES(1525),
    DRIVING_MODE_LAUNCH_NOTIFICATION_TIMEOUT(1526),
    DRIVING_MODE_SETTINGS_FROM_SEARCH(1527),
    DRIVING_MODE_START_MORRIS_BEHAVIOR(1528),
    DRIVING_MODE_STOP_MORRIS_BEHAVIOR(1529),
    DRIVING_MODE_LAUNCH_NOTIFICATION_AUTO_DISMISS(1530),
    DATA_NOTICE_NOTIFICATION_POSTED(1600),
    DATA_NOTICE_NOTIFICATION_SELECTED(1601),
    DRIVING_MODE_FRX_NEXT_BUTTON(1700),
    DRIVING_MODE_FRX_BACK_BUTTON(1701),
    DRIVING_MODE_FRX_TERTIARY_BUTTON(1702),
    DRIVING_MODE_FRX_SWITCH_TOGGLED(1703),
    DRIVING_MODE_FRX_READY(1704),
    DRIVING_MODE_FRX_STARTED_BY_SETTING_ACCESS(1705),
    DRIVING_MODE_FRX_LAUNCHES_GEARHEAD_FRX(1706),
    DRIVING_MODE_FRX_STARTED_BY_LEAVE_BEHIND_NOTIFICATION(1707),
    OPEN_PLAYBACK_VIEW_FROM_FAB(1800),
    CLOSE_PLAYBACK_VIEW(1801),
    OPEN_PLAYBACK_VIEW_ROTARY(1802),
    SEARCH_RESULTS_SELECTED_FROM_DRAWER(1803),
    QUEUE_SELECTED_FROM_DRAWER(1804),
    OPEN_PLAYBACK_VIEW_FROM_FAB_IN_PLAYBACK_STATE_ERROR(1805),
    CLOSE_PLAYBACK_VIEW_IN_PLAYBACK_STATE_ERROR(1806),
    BROWSABLE_PIVOT_SELECTED_FROM_DRAWER(1820),
    BROWSE_VIEW_PLAYABLE_SELECTED(1821),
    BROWSE_VIEW_BROWSABLE_SELECTED(1822),
    BROWSE_VIEW_SCROLL_UP(1823),
    BROWSE_VIEW_SCROLL_DOWN(1824),
    SEARCH_CAPPING_ITEM_REVEALED(1825),
    SEARCH_CAPPING_ITEM_TAPPED(1826),
    BROWSE_VIEW_ITEMS_LOADED(1827),
    BROWSE_VIEW_SEARCH_RESULTS_LOADED(1828),
    BROWSE_VIEW_SEARCH_RESULT_SELECTED(1829),
    SEARCH_CAPPING_ITEM_TRIGGERED(1830),
    SEARCH_CAPPING_ITEM_DISMISSED(1831),
    ASSISTANT_SEARCH_QUERY_PERFORMED(1832),
    BROWSE_VIEW_SCROLL_UP_GRIDS(1833),
    BROWSE_VIEW_SCROLL_UP_LISTS(1834),
    BROWSE_VIEW_SCROLL_UP_GRIDS_LISTS(1835),
    BROWSE_VIEW_SCROLL_DOWN_GRIDS(1836),
    BROWSE_VIEW_SCROLL_DOWN_LISTS(1837),
    BROWSE_VIEW_SCROLL_DOWN_GRIDS_LISTS(1838),
    ASSISTANT_SEND_FEEDBACK_QUERY_PERFORMED(1839),
    BROWSE_VIEW_MENU_ITEM_TITLE_EMPTY(1840),
    BROWSE_VIEW_BROWSABLE_AND_PLAYABLE_ITEM_LOADED(1841),
    BROWSE_VIEW_EMPTY_NODE_LOADED(1842),
    BROWSE_VIEW_NODE_FAILED_TO_LOAD(1843),
    ASSISTANT_OPEN_APP_QUERY_PERFORMED(1844),
    ASSISTANT_NAVIGATE_TO_QUERY_PERFORMED(1845),
    OVERVIEW_MESSAGE_AUTOREPLY_WITH_VISUAL_PREVIEW(1900),
    OVERVIEW_MESSAGE_MUTE_WITH_VISUAL_PREVIEW(1901),
    OVERVIEW_MESSAGE_UNMUTE_WITH_VISUAL_PREVIEW(1902),
    NOTIFICATION_MESSAGE_MUTE_WITH_VISUAL_PREVIEW(1903),
    VISUAL_PREVIEW_SETTING_ENABLED_ANYWHERE(1919),
    VISUAL_PREVIEW_ENABLED_BY_DISCOVERY_CARD(1920),
    VISUAL_PREVIEW_DISCOVERY_EXHAUSTED_BY_DISMISSAL(1921),
    VISUAL_PREVIEW_DISCOVERY_DISABLED_BY_SETTING_MANUALLY_ENABLED(1922),
    VISUAL_PREVIEW_DISCOVERY_DISABLED_BY_EXISTING_SETTINGS(1923),
    VISUAL_PREVIEW_DISCOVERY_EXHAUSTED_BY_IMPRESSIONS(1924),
    LOCK_SCREEN_SHOW_VIDEO_FOCUS(2000),
    LOCK_SCREEN_SHOW_VIDEO_FOCUS_DISMISS(2001),
    LOCK_SCREEN_SHOW_NO_VIDEO_FOCUS(2002),
    LOCK_SCREEN_SHOW_NO_VIDEO_FOCUS_DISMISS(2003),
    LOCK_SCREEN_SHOW_NO_VIDEO_FOCUS_HUN(2004),
    LOCK_SCREEN_BYPASS(2005),
    LOCK_SCREEN_GET_CAR_MANAGER(2006),
    WIDESCREEN_CARD_TAP(2050),
    WIDESCREEN_CARD_TAP_NO_ACTION(2051),
    KEY_EVENT(2052),
    KEY_EVENT_KEYCODE_MEDIA(2053),
    KEY_EVENT_KEYCODE_MUSIC(2054),
    KEY_EVENT_KEYCODE_NAVIGATION(2055),
    KEY_EVENT_KEYCODE_TEL(2056),
    KEY_EVENT_KEYCODE_HOME(2057),
    KEY_EVENT_KEYCODE_SEARCH(2058),
    KEY_EVENT_KEYCODE_UNHANDLED(2059),
    APP_LAUNCH(2100),
    LAUNCHER_PAGE_UP(2101),
    LAUNCHER_PAGE_DOWN(2102),
    CLICKED_NEWS_ACTION_WHILE_CONNECTED_TO_NEWS(2103),
    LAUNCHER_START(2104),
    RAIL_WIDGET_SHOW(2150),
    RAIL_WIDGET_ACTION(2151),
    TRAMPOLINE_RUN(2200),
    TRAMPOLINE_LAUNCH_TARGET_FAILURE(2201),
    TRAMPOLINE_LAUNCH_FALLBACK_FAILURE(2202),
    BOARDWALK_OPT_IN_NEW_USER_FORCED_INTO_BOARDWALK(2250),
    BOARDWALK_OPT_IN_FROM_SETTINGS(2251),
    BOARDWALK_OPT_OUT_FROM_SETTINGS(2252),
    BOARDWALK_OPT_IN_NOT_AVAILABLE(2253),
    BOARDWALK_OPT_IN_AVAILABLE_BOARDWALK_NOT_OPTED_IN(2254),
    BOARDWALK_OPT_IN_AVAILABLE_BOARDWALK_OPTED_IN(2255),
    BOARDWALK_OPT_IN_AVAILABLE_CLASSIC_NOT_OPTED_IN(2256),
    BOARDWALK_OPT_IN_AVAILABLE_CLASSIC_OPTED_OUT(2257),
    BOARDWALK_OPT_IN_FORCED_BOARDWALK(2258),
    BOARDWALK_OPT_IN_BAD_CONFIGURATION(2259),
    RELINQUISH_FOCUS(2300),
    REGAIN_FOCUS(2301),
    CARD_CLICK(2400),
    BUTTON_CLICK(2401),
    CARD_DISMISS(2402),
    CLEAR_ALL(2403),
    NOTIFICATION_COUNT(2404),
    NOTIFICATION_CENTER_PAGE_UP(2405),
    NOTIFICATION_CENTER_PAGE_DOWN(2406),
    NOTIFICATION_CENTER_OPEN(2407),
    NOTIFICATION_CENTER_CLOSE(2408),
    NOTIFICATION_CENTER_GET_CAR_WINDOW_MANAGER(2409),
    MESSAGE_AUTOREPLY(2501),
    MESSAGE_MUTE(2502),
    MESSAGE_UNMUTE(2503),
    MESSAGE_SHOW_TEXT(2504),
    MESSAGE_HIDE_TEXT(2505),
    WIFI_DEVELOPER_MODE_ENABLED(2600),
    WIFI_FLAG_ENABLED(2601),
    WIFI_START_EXPONENTIAL_RETRY(2602),
    WIFI_START_EXPONENTIAL_RETRY_MAX_DELAY_REACHED(2603),
    TOOLTIP_SHOW(2700),
    TOOLTIP_DISMISS_FROM_TIMEOUT(2701),
    TOOLTIP_DISMISS_FROM_DISCONNECT(2702),
    TOOLTIP_DISMISS_FROM_ANCHOR_CLICK(2703),
    TOOLTIP_DISMISS_FROM_TOOLTIP_CLICK(2704),
    TOOLTIP_SUPPRESSED_FOR_DRY_RUN(2705),
    TOOLTIP_DISMISS_FROM_OUTSIDE_CLICK(2706),
    SBN_HAS_MESSAGING_STYLE_BUT_IS_NOT_AA_COMPATIBLE_BATCHED_PER_SESSION(2800),
    SBN_HAS_VALID_MESSAGING_STYLE_BATCHED_PER_SESSION(2801),
    SBN_IS_FROM_DEFAULT_SMS_APP_BATCHED_PER_SESSION(2802),
    MESSAGING_STYLE_SBN_HAS_NO_MARK_AS_READ_BATCHED_PER_SESSION(2803),
    MESSAGING_STYLE_SBN_HAS_NO_REPLY_BATCHED_PER_SESSION(2804),
    MESSAGING_STYLE_SBN_HAS_MORE_THAN_ONE_MARK_AS_READ_BATCHED_PER_SESSION(2805),
    MESSAGING_STYLE_SBN_HAS_MORE_THAN_ONE_REPLY_BATCHED_PER_SESSION(2806),
    MESSAGING_STYLE_SBN_IS_GROUP_CONVERSATION_BATCHED_PER_SESSION(2807),
    MESSAGING_STYLE_SBN_HAS_IMAGE_BATCHED_PER_SESSION(2808),
    MESSAGING_STYLE_SBN_HAS_NON_IMAGE_MULTIMEDIA_BATCHED_PER_SESSION(2809),
    SBN_COUNT(2810),
    MESSAGING_STYLE_SBN_PROBABLY_HAS_REPLY_BATCHED_PER_SESSION(2811),
    MESSAGING_STYLE_SBN_PROBABLY_HAS_MARK_AS_READ_BATCHED_PER_SESSION(2812),
    MESSAGING_COMPOSE_FOR_APP_BATCHED_PER_SESSION(2813),
    MESSAGING_COMPOSE_FOR_SMS_BATCHED_PER_SESSION(2814),
    FLAKY_PARKING_STATES_SMOOTHED_BATCHED_PER_SESSION(2900),
    CAR_SETUP_NOTIFICATION_GET_THE_APP(3000),
    CAR_SETUP_NOTIFICATION_UPDATE_THE_APP(3001),
    PERMISSIONS_NOTIFICATIONS_CHECK_EQUAL(3100),
    PERMISSIONS_NOTIFICATIONS_CHECK_GRANTED_LEGACY(3101),
    PERMISSIONS_NOTIFICATIONS_CHECK_GRANTED_O_MR1(3102),
    TOAST_SHOW(3200),
    TOAST_CANCEL_BY_NEW_TOAST(3201),
    TOAST_SHOW_ERROR(3202),
    SYSTEM_UI_NOTIFICATION_HUN_THROTTLING_CANCELLED(3300),
    SYSTEM_UI_NOTIFICATION_HUN_SHOWN(3301),
    SYSTEM_UI_NOTIFICATION_MEDIA_HUN_SETTING_CANCELLED(3302),
    SYSTEM_UI_NOTIFICATION_SIMPLE_HUN_SHOWN(3303),
    SYSTEM_UI_NOTIFICATION_CALL_HUN_SHOWN(3304),
    SYSTEM_UI_NOTIFICATION_HUN_CONTENT_TAP(3305),
    SYSTEM_UI_NOTIFICATION_HUN_ACTION_1_TAP(3306),
    SYSTEM_UI_NOTIFICATION_HUN_DISMISSED_SCRIM_TAP(3307),
    SYSTEM_UI_NOTIFICATION_HUN_DISMISSED_CLOSE_TAP(3308),
    SYSTEM_UI_NOTIFICATION_CALL_HUN_ACTION_1_TAP(3309),
    SYSTEM_UI_NOTIFICATION_CALL_HUN_ACTION_2_TAP(3310),
    INPUT_CONFIGURATION_START(3400),
    LIFECYCLE_SERVICE_GET_CAR_MANAGER(3500),
    ASSISTANT_ADAPTER_START(3600),
    LIFETIME_START(3700),
    APP_DECOR_REGISTER_SENSOR_UPDATES(3800),
    ETC_STATUS_SENSOR_UPDATES(3900),
    NAVIGATION_KEY_RECEIVER_CREATE_CAR_WINDOW_MANAGER(4000),
    PROJECTION_CONTEXT_START_CAR_ACTIVITY(4100),
    NAVIGATION_APP_MANAGER_GET_CAR_SERVICE_SETTING(4200),
    OPEN_LAUNCHER_APP_CUSTOMIZATION_SETTING(4300),
    DISABLE_LAUNCHER_APP_WHILE_CONNECTED_TO_CAR(4301),
    ENABLE_LAUNCHER_APP_WHILE_CONNECTED_TO_CAR(4302),
    DISABLE_LAUNCHER_APP_WHILE_NOT_CONNECTED_TO_CAR(4304),
    ENABLE_LAUNCHER_APP_WHILE_NOT_CONNECTED_TO_CAR(4305),
    LONG_CLICK_TO_OPEN_CUSTOMIZATION(4306),
    SWITCH_TO_CUSTOM_ORDER_THROUGH_BUTTON(4307),
    SWITCH_TO_CUSTOM_ORDER_THROUGH_MOVING_APP(4308),
    SWITCH_TO_AZ_ORDER_THROUGH_BUTTON(4309),
    ACTIVITY_DESTROYED(4400),
    AUTO_DISMISS(4401),
    CONNECTION_DETACHED(4402),
    SETTINGS_APP_OPENED(4500),
    SETTINGS_APP_NOT_OPENING_DUE_TO_DRIVING(4501),
    RAIL_GET_CAR_INFO(4600),
    PHONE_STATE_SCREEN_ON(4610),
    PHONE_STATE_SCREEN_OFF(4611),
    PHONE_STATE_USER_PRESENT(4612),
    FIRST_ACTIVITY_START(4700),
    SENSITIVE_PERMISSION_POLLING_STARTED(4800),
    SENSITIVE_PERMISSION_POLLING_GRANTED(4801),
    SENSITIVE_PERMISSION_POLLING_TIMED_OUT(4802),
    SENSITIVE_PERMISSION_POLLING_STOPPED(4803),
    APP_NAVIGATION_HOST_START(4900),
    APP_NAVIGATION_HOST_REQUEST_FOCUS(4901),
    APP_NAVIGATION_HOST_ABANDON_FOCUS(4902),
    CRASH(5000),
    BLUETOOTH_PAIRING_PBAP_EXPECTED_SAME_AS_OBSERVED(5100),
    BLUETOOTH_PAIRING_PBAP_EXPECTED_FALSE_OBSERVED_TRUE(5101),
    BLUETOOTH_PAIRING_PBAP_EXPECTED_TRUE_OBSERVED_FALSE(5102),
    PHONE_SUPPORT_H265_ENCODER(5200),
    PHONE_NOT_SUPPORT_H265_ENCODER(5201),
    PHONE_CAPABILITIES(5202),
    HOTSEAT_ATTEMPTED_TO_LOAD_UNAVAILABLE_APP(5300),
    INVALID_APP(5400),
    FIRST_ACTIVITY_RESTART_STARTED(5500),
    FIRST_ACTIVITY_RESTART_DONE(5501),
    PACKAGE_DENIED(5600),
    BATTERY_SAVER_ON_AT_START(5700),
    BATTERY_SAVER_SWITCHED_ON(5701),
    BATTERY_SAVER_SWITCHED_OFF(5702),
    BATTERY_SAVER_OFF_AT_START(5703),
    SERVICE_AUTHORIZER_QUERY_ALLOWED_SERVICES(5800),
    SERVICE_AUTHORIZER_IS_NON_NAV_PACKAGE_ALLOWED(5801),
    API_TEST_APP_ALLOWED_TO_PROJECT_PM_AND_AUTHORIZER_AGREE(5900),
    API_TEST_APP_ALLOWED_TO_PROJECT_PM_TRUE_AUTHORIZER_FALSE(5901),
    API_TEST_APP_ALLOWED_TO_PROJECT_PM_FALSE_AUTHORIZER_TRUE(5902),
    TELEMETRY_EVENTS_BUFFERED(6000),
    FRAMER_READER_THREAD_STUCK(6100),
    AUDIO_CAPTURE_THREAD_STUCK(6101),
    VIDEO_FOCUS_HANDLING_THREAD_STUCK(6102),
    VIDEO_ENCODING_THREAD_STUCK(61003),
    WINDOW_MANAGER_COMPOSITION_THREAD_STUCK(6104);
    
    public final int jd;

    private anxw(int i) {
        this.jd = i;
    }

    public final int a() {
        return this.jd;
    }

    public final String toString() {
        return Integer.toString(this.jd);
    }
}
