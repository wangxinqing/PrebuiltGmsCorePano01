package defpackage;

/* renamed from: ayad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayad implements ayac {
    public static final agvx alertExperimentCheckinIntervalMillis;
    public static final agvx alwaysCheckStaleFile;
    public static final agvx broadAvailability;
    public static final agvx bugfix154041665;
    public static final agvx connectionlessTimeoutSeconds;
    public static final agvx disableForSupervised;
    public static final agvx enable;
    public static final agvx enableAlertExperimentCheckin;
    public static final agvx enableConnectivityReporting;
    public static final agvx enableNotificationLatencyReporting;
    public static final agvx enableNotificationReceiver;
    public static final agvx enableOperatorReporting;
    public static final agvx enablePbe;
    public static final agvx enableRegionSupplier;
    public static final agvx enabledAreas;
    public static final agvx locationFastestIntervalMillis;
    public static final agvx locationIntervalMillis;
    public static final agvx maxDataStalenessMillis;
    public static final agvx notificationLogBaseOffsetMillis;
    public static final agvx notificationLogWindowMillis;
    public static final agvx numSupplementalRegions;
    public static final agvx regionLevel;
    public static final agvx regionSupplierIntervalMillis;
    public static final agvx useConnectionlessUlrCheck;
    public static final agvx useFileStorage;
    public static final agvx useNativeThread;
    public static final agvx useNewLocationApi;
    public static final agvx useUlrState;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        alertExperimentCheckinIntervalMillis = agvx.a(a, "Ealert__alert_experiment_checkin_interval_millis", 3600000);
        alwaysCheckStaleFile = agvx.a(a, "Ealert__always_check_stale_file", false);
        broadAvailability = agvx.a(a, "Ealert__broad_availability", false);
        bugfix154041665 = agvx.a(a, "Ealert__bugfix154041665", true);
        connectionlessTimeoutSeconds = agvx.a(a, "Ealert__connectionless_timeout_seconds", 5);
        disableForSupervised = agvx.a(a, "Ealert__disable_for_supervised", false);
        enable = agvx.a(a, "Ealert__enable", false);
        enableAlertExperimentCheckin = agvx.a(a, "Ealert__enable_alert_experiment_checkin", false);
        enableConnectivityReporting = agvx.a(a, "Ealert__enable_connectivity_reporting", true);
        enableNotificationLatencyReporting = agvx.a(a, "Ealert__enable_notification_latency_reporting", false);
        enableNotificationReceiver = agvx.a(a, "Ealert__enable_notification_receiver", false);
        enableOperatorReporting = agvx.a(a, "Ealert__enable_operator_reporting", true);
        enablePbe = agvx.a(a, "Ealert__enable_pbe", false);
        enableRegionSupplier = agvx.a(a, "Ealert__enable_region_supplier", false);
        enabledAreas = agvx.a(a, "Ealert__enabled_areas", "");
        locationFastestIntervalMillis = agvx.a(a, "Ealert__location_fastest_interval_millis", 300000);
        locationIntervalMillis = agvx.a(a, "Ealert__location_interval_millis", 1800000);
        maxDataStalenessMillis = agvx.a(a, "Ealert__max_data_staleness_millis", 604800000);
        notificationLogBaseOffsetMillis = agvx.a(a, "Ealert__notification_log_base_offset_millis", 300000);
        notificationLogWindowMillis = agvx.a(a, "Ealert__notification_log_window_millis", 1200000);
        numSupplementalRegions = agvx.a(a, "Ealert__num_supplemental_regions", 3);
        regionLevel = agvx.a(a, "Ealert__region_level", 8);
        regionSupplierIntervalMillis = agvx.a(a, "Ealert__region_supplier_interval_millis", 1800000);
        useConnectionlessUlrCheck = agvx.a(a, "Ealert__use_connectionless_ulr_check", true);
        useFileStorage = agvx.a(a, "Ealert__use_file_storage", false);
        useNativeThread = agvx.a(a, "Ealert__use_native_thread", false);
        useNewLocationApi = agvx.a(a, "Ealert__use_new_location_api", false);
        useUlrState = agvx.a(a, "Ealert__use_ulr_state", true);
    }

    public long alertExperimentCheckinIntervalMillis() {
        return ((Long) alertExperimentCheckinIntervalMillis.c()).longValue();
    }

    public boolean alwaysCheckStaleFile() {
        return ((Boolean) alwaysCheckStaleFile.c()).booleanValue();
    }

    public boolean broadAvailability() {
        return ((Boolean) broadAvailability.c()).booleanValue();
    }

    public boolean bugfix154041665() {
        return ((Boolean) bugfix154041665.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long connectionlessTimeoutSeconds() {
        return ((Long) connectionlessTimeoutSeconds.c()).longValue();
    }

    public boolean disableForSupervised() {
        return ((Boolean) disableForSupervised.c()).booleanValue();
    }

    public boolean enable() {
        return ((Boolean) enable.c()).booleanValue();
    }

    public boolean enableAlertExperimentCheckin() {
        return ((Boolean) enableAlertExperimentCheckin.c()).booleanValue();
    }

    public boolean enableConnectivityReporting() {
        return ((Boolean) enableConnectivityReporting.c()).booleanValue();
    }

    public boolean enableNotificationLatencyReporting() {
        return ((Boolean) enableNotificationLatencyReporting.c()).booleanValue();
    }

    public boolean enableNotificationReceiver() {
        return ((Boolean) enableNotificationReceiver.c()).booleanValue();
    }

    public boolean enableOperatorReporting() {
        return ((Boolean) enableOperatorReporting.c()).booleanValue();
    }

    public boolean enablePbe() {
        return ((Boolean) enablePbe.c()).booleanValue();
    }

    public boolean enableRegionSupplier() {
        return ((Boolean) enableRegionSupplier.c()).booleanValue();
    }

    public String enabledAreas() {
        return (String) enabledAreas.c();
    }

    public long locationFastestIntervalMillis() {
        return ((Long) locationFastestIntervalMillis.c()).longValue();
    }

    public long locationIntervalMillis() {
        return ((Long) locationIntervalMillis.c()).longValue();
    }

    public long maxDataStalenessMillis() {
        return ((Long) maxDataStalenessMillis.c()).longValue();
    }

    public long notificationLogBaseOffsetMillis() {
        return ((Long) notificationLogBaseOffsetMillis.c()).longValue();
    }

    public long notificationLogWindowMillis() {
        return ((Long) notificationLogWindowMillis.c()).longValue();
    }

    public long numSupplementalRegions() {
        return ((Long) numSupplementalRegions.c()).longValue();
    }

    public long regionLevel() {
        return ((Long) regionLevel.c()).longValue();
    }

    public long regionSupplierIntervalMillis() {
        return ((Long) regionSupplierIntervalMillis.c()).longValue();
    }

    public boolean useConnectionlessUlrCheck() {
        return ((Boolean) useConnectionlessUlrCheck.c()).booleanValue();
    }

    public boolean useFileStorage() {
        return ((Boolean) useFileStorage.c()).booleanValue();
    }

    public boolean useNativeThread() {
        return ((Boolean) useNativeThread.c()).booleanValue();
    }

    public boolean useNewLocationApi() {
        return ((Boolean) useNewLocationApi.c()).booleanValue();
    }

    public boolean useUlrState() {
        return ((Boolean) useUlrState.c()).booleanValue();
    }
}
