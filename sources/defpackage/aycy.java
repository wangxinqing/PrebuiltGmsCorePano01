package defpackage;

/* renamed from: aycy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aycy implements aycx {
    public static final agvx addDndRuleOnBind;
    public static final agvx autoDismissNotificationOnVehicleExit;
    public static final agvx dndClearCutLogEnabled;
    public static final agvx dndDefaultInterruption;
    public static final agvx enableDndNotificationBroadcast;
    public static final agvx enableDrivingModeGoogleSetting;
    public static final agvx enableDrivingModeInConnectedDeviceSetting;
    public static final agvx enableDrivingModeLaunchOneTapNotification;
    public static final agvx enableDrivingModeLocationClearCutLog;
    public static final agvx morrisBroadcastIntent;
    public static final agvx morrisPackageName;
    public static final agvx removeDndRuleUponDrivingModeTurnedOff;
    public static final agvx routeDndRuleToDrivingModeForAuto;
    public static final agvx showDndBehavior;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        addDndRuleOnBind = agvx.a(a, "add_dnd_rule_on_bind", false);
        autoDismissNotificationOnVehicleExit = agvx.a(a, "auto_dismiss_notification_on_vehicle_exit", true);
        dndClearCutLogEnabled = agvx.a(a, "dnd_clear_cut_log_enabled", true);
        dndDefaultInterruption = agvx.a(a, "dnd_default_interruption", 2);
        enableDndNotificationBroadcast = agvx.a(a, "enable_dnd_notification_broadcast", false);
        enableDrivingModeGoogleSetting = agvx.a(a, "enable_driving_mode_google_setting", false);
        enableDrivingModeInConnectedDeviceSetting = agvx.a(a, "enable_driving_mode_in_connected_device_setting", true);
        enableDrivingModeLaunchOneTapNotification = agvx.a(a, "enable_driving_mode_launch_one_tap_notification", true);
        enableDrivingModeLocationClearCutLog = agvx.a(a, "enable_driving_mode_location_clear_cut_log", false);
        morrisBroadcastIntent = agvx.a(a, "morris_broadcast_intent", "com.google.android.apps.gsa.morris.INTENT_ACTION_ENTER_DRIVING_MODE");
        morrisPackageName = agvx.a(a, "morris_package_name", "com.google.android.apps.gsa.staticplugins.opa.morris");
        removeDndRuleUponDrivingModeTurnedOff = agvx.a(a, "remove_dnd_rule_upon_driving_mode_turned_off", true);
        routeDndRuleToDrivingModeForAuto = agvx.a(a, "route_dnd_rule_to_driving_mode_for_auto", true);
        showDndBehavior = agvx.a(a, "show_dnd_behavior", true);
    }

    public boolean addDndRuleOnBind() {
        return ((Boolean) addDndRuleOnBind.c()).booleanValue();
    }

    public boolean autoDismissNotificationOnVehicleExit() {
        return ((Boolean) autoDismissNotificationOnVehicleExit.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean dndClearCutLogEnabled() {
        return ((Boolean) dndClearCutLogEnabled.c()).booleanValue();
    }

    public long dndDefaultInterruption() {
        return ((Long) dndDefaultInterruption.c()).longValue();
    }

    public boolean enableDndNotificationBroadcast() {
        return ((Boolean) enableDndNotificationBroadcast.c()).booleanValue();
    }

    public boolean enableDrivingModeGoogleSetting() {
        return ((Boolean) enableDrivingModeGoogleSetting.c()).booleanValue();
    }

    public boolean enableDrivingModeInConnectedDeviceSetting() {
        return ((Boolean) enableDrivingModeInConnectedDeviceSetting.c()).booleanValue();
    }

    public boolean enableDrivingModeLaunchOneTapNotification() {
        return ((Boolean) enableDrivingModeLaunchOneTapNotification.c()).booleanValue();
    }

    public boolean enableDrivingModeLocationClearCutLog() {
        return ((Boolean) enableDrivingModeLocationClearCutLog.c()).booleanValue();
    }

    public String morrisBroadcastIntent() {
        return (String) morrisBroadcastIntent.c();
    }

    public String morrisPackageName() {
        return (String) morrisPackageName.c();
    }

    public boolean removeDndRuleUponDrivingModeTurnedOff() {
        return ((Boolean) removeDndRuleUponDrivingModeTurnedOff.c()).booleanValue();
    }

    public boolean routeDndRuleToDrivingModeForAuto() {
        return ((Boolean) routeDndRuleToDrivingModeForAuto.c()).booleanValue();
    }

    public boolean showDndBehavior() {
        return ((Boolean) showDndBehavior.c()).booleanValue();
    }
}
