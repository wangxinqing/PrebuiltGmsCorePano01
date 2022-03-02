package defpackage;

/* renamed from: ayej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayej implements ayei {
    public static final agvx enablePlatformUpgradeDetection;
    public static final agvx locationHistoryNotificationForQ;
    public static final agvx locationHistoryNotificationForQAlternativeTitle;
    public static final agvx savePlatformVersionO;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enablePlatformUpgradeDetection = agvx.a(a, "PlatformUpgradeHandlers__enable_platform_upgrade_detection", false);
        locationHistoryNotificationForQ = agvx.a(a, "PlatformUpgradeHandlers__location_history_notification_for_q", true);
        locationHistoryNotificationForQAlternativeTitle = agvx.a(a, "PlatformUpgradeHandlers__location_history_notification_for_q_alternative_title", false);
        savePlatformVersionO = agvx.a(a, "save_platform_version_o", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enablePlatformUpgradeDetection() {
        return ((Boolean) enablePlatformUpgradeDetection.c()).booleanValue();
    }

    public boolean locationHistoryNotificationForQ() {
        return ((Boolean) locationHistoryNotificationForQ.c()).booleanValue();
    }

    public boolean locationHistoryNotificationForQAlternativeTitle() {
        return ((Boolean) locationHistoryNotificationForQAlternativeTitle.c()).booleanValue();
    }

    public boolean savePlatformVersionO() {
        return ((Boolean) savePlatformVersionO.c()).booleanValue();
    }
}
