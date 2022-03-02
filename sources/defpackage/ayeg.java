package defpackage;

/* renamed from: ayeg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayeg implements ayef {
    public static final agvx addPersonalizedBitToDetectorInfo;
    public static final agvx applyActivityPersonalization;
    public static final agvx applyActivityPersonalizationForWalking;
    public static final agvx checkBatteryStatus;
    public static final agvx personalizationClusterMinSize;
    public static final agvx personalizedModelRefreshIntervalDays;
    public static final agvx useFootprintsToFetchModels;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        addPersonalizedBitToDetectorInfo = agvx.a(a, "add_personalized_bit_to_detector_info", true);
        applyActivityPersonalization = agvx.a(a, "apply_activity_personalization", false);
        applyActivityPersonalizationForWalking = agvx.a(a, "apply_activity_personalization_for_walking", false);
        checkBatteryStatus = agvx.a(a, "check_battery_status", false);
        personalizationClusterMinSize = agvx.a(a, "personalization_cluster_min_size", 2);
        personalizedModelRefreshIntervalDays = agvx.a(a, "personalized_model_refresh_interval_days", 4);
        useFootprintsToFetchModels = agvx.a(a, "use_footprints_to_fetch_models", true);
    }

    public boolean addPersonalizedBitToDetectorInfo() {
        return ((Boolean) addPersonalizedBitToDetectorInfo.c()).booleanValue();
    }

    public boolean applyActivityPersonalization() {
        return ((Boolean) applyActivityPersonalization.c()).booleanValue();
    }

    public boolean applyActivityPersonalizationForWalking() {
        return ((Boolean) applyActivityPersonalizationForWalking.c()).booleanValue();
    }

    public boolean checkBatteryStatus() {
        return ((Boolean) checkBatteryStatus.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long personalizationClusterMinSize() {
        return ((Long) personalizationClusterMinSize.c()).longValue();
    }

    public long personalizedModelRefreshIntervalDays() {
        return ((Long) personalizedModelRefreshIntervalDays.c()).longValue();
    }

    public boolean useFootprintsToFetchModels() {
        return ((Boolean) useFootprintsToFetchModels.c()).booleanValue();
    }
}
