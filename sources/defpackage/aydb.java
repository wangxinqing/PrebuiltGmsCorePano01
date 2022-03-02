package defpackage;

/* renamed from: aydb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydb implements ayda {
    public static final agvx bypassDndNotificationPermissionPreOmr1;
    public static final agvx dndNotificationChannelEnabled;
    public static final agvx dndNotificationClearCutLogEnabled;
    public static final agvx dndNotificationMasterSwitch;
    public static final agvx dndNotificationSwitchTheme;
    public static final agvx drivingModeNotificationSource;
    public static final agvx drivingModeNotificationText;
    public static final agvx drivingModeNotificationTitle;
    public static final agvx enableDndNotificationDefaultImportanceChannel;
    public static final agvx enableDrivingModeNotificationExperiment;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bypassDndNotificationPermissionPreOmr1 = agvx.a(a, "bypass_dnd_notification_permission_pre_omr1", true);
        dndNotificationChannelEnabled = agvx.a(a, "dnd_notification_channel_enabled", true);
        dndNotificationClearCutLogEnabled = agvx.a(a, "dnd_notification_clear_cut_log_enabled", true);
        dndNotificationMasterSwitch = agvx.a(a, "dnd_notification_master_switch", false);
        dndNotificationSwitchTheme = agvx.a(a, "dnd_notification_switch_theme", true);
        drivingModeNotificationSource = agvx.a(a, "driving_mode_notification_source", "");
        drivingModeNotificationText = agvx.a(a, "driving_mode_notification_text", "");
        drivingModeNotificationTitle = agvx.a(a, "driving_mode_notification_title", "");
        enableDndNotificationDefaultImportanceChannel = agvx.a(a, "enable_dnd_notification_default_importance_channel", true);
        enableDrivingModeNotificationExperiment = agvx.a(a, "enable_driving_mode_notification_experiment", false);
    }

    public boolean bypassDndNotificationPermissionPreOmr1() {
        return ((Boolean) bypassDndNotificationPermissionPreOmr1.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean dndNotificationChannelEnabled() {
        return ((Boolean) dndNotificationChannelEnabled.c()).booleanValue();
    }

    public boolean dndNotificationClearCutLogEnabled() {
        return ((Boolean) dndNotificationClearCutLogEnabled.c()).booleanValue();
    }

    public boolean dndNotificationMasterSwitch() {
        return ((Boolean) dndNotificationMasterSwitch.c()).booleanValue();
    }

    public boolean dndNotificationSwitchTheme() {
        return ((Boolean) dndNotificationSwitchTheme.c()).booleanValue();
    }

    public String drivingModeNotificationSource() {
        return (String) drivingModeNotificationSource.c();
    }

    public String drivingModeNotificationText() {
        return (String) drivingModeNotificationText.c();
    }

    public String drivingModeNotificationTitle() {
        return (String) drivingModeNotificationTitle.c();
    }

    public boolean enableDndNotificationDefaultImportanceChannel() {
        return ((Boolean) enableDndNotificationDefaultImportanceChannel.c()).booleanValue();
    }

    public boolean enableDrivingModeNotificationExperiment() {
        return ((Boolean) enableDrivingModeNotificationExperiment.c()).booleanValue();
    }
}
