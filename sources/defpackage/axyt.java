package defpackage;

/* renamed from: axyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyt implements axys {
    public static final agvx chreArAccelIntervalNs;
    public static final agvx chreArAggregateWindowMillis;
    public static final agvx chreArClockCheckTimeoutMs;
    public static final agvx chreArClockDriftToResyncMs;
    public static final agvx chreArDebugLogEnabled;
    public static final agvx chreArDisallowDisable;
    public static final agvx chreArEnabled;
    public static final agvx chreArMajorityVoteWindowMillis;
    public static final agvx chreArModel;
    public static final agvx chreArTimeoutToIdleMs;
    public static final agvx chreArTransitionMinVersion;
    public static final agvx chreArTransitionMinVersionAbms;
    public static final agvx chreArVersionToEnableRoadRailVehicle;
    public static final agvx enableChreArBluetoothFiltering;
    public static final agvx enableChreArWifiFiltering;
    public static final agvx enableChreResultsBikeRelabeling;
    public static final agvx legacyHardwareArNoOpEnabled;
    public static final agvx numConsecutiveStillsToIdle;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        chreArAccelIntervalNs = agvx.a(a, "chre_ar_accel_interval_ns", 20000000);
        chreArAggregateWindowMillis = agvx.a(a, "chre_ar_aggregate_window_millis", 20000);
        chreArClockCheckTimeoutMs = agvx.a(a, "chre_ar_clock_check_timeout_ms", 600000);
        chreArClockDriftToResyncMs = agvx.a(a, "chre_ar_clock_drift_to_resync_ms", 1500);
        chreArDebugLogEnabled = agvx.a(a, "chre_ar_debug_log_enabled", false);
        chreArDisallowDisable = agvx.a(a, "chre_ar_disallow_disable", true);
        chreArEnabled = agvx.a(a, "chre_ar_enabled", true);
        chreArMajorityVoteWindowMillis = agvx.a(a, "chre_ar_majority_vote_window_millis", 60000);
        chreArModel = agvx.a(a, "chre_ar_model", 4);
        chreArTimeoutToIdleMs = agvx.a(a, "chre_ar_timeout_to_idle_ms", 120000);
        chreArTransitionMinVersion = agvx.a(a, "chre_ar_transition_min_version", 131077);
        chreArTransitionMinVersionAbms = agvx.a(a, "chre_ar_transition_min_version_abms", 65792);
        chreArVersionToEnableRoadRailVehicle = agvx.a(a, "chre_ar_version_to_enable_road_rail_vehicle", 196608);
        enableChreArBluetoothFiltering = agvx.a(a, "enable_chre_ar_bluetooth_filtering", false);
        enableChreArWifiFiltering = agvx.a(a, "enable_chre_ar_wifi_filtering", false);
        enableChreResultsBikeRelabeling = agvx.a(a, "enable_chre_results_bike_relabeling", false);
        legacyHardwareArNoOpEnabled = agvx.a(a, "legacy_hardware_ar_no_op_enabled", true);
        numConsecutiveStillsToIdle = agvx.a(a, "num_consecutive_stills_to_idle", 10);
    }

    public long chreArAccelIntervalNs() {
        return ((Long) chreArAccelIntervalNs.c()).longValue();
    }

    public long chreArAggregateWindowMillis() {
        return ((Long) chreArAggregateWindowMillis.c()).longValue();
    }

    public long chreArClockCheckTimeoutMs() {
        return ((Long) chreArClockCheckTimeoutMs.c()).longValue();
    }

    public long chreArClockDriftToResyncMs() {
        return ((Long) chreArClockDriftToResyncMs.c()).longValue();
    }

    public boolean chreArDebugLogEnabled() {
        return ((Boolean) chreArDebugLogEnabled.c()).booleanValue();
    }

    public boolean chreArDisallowDisable() {
        return ((Boolean) chreArDisallowDisable.c()).booleanValue();
    }

    public boolean chreArEnabled() {
        return ((Boolean) chreArEnabled.c()).booleanValue();
    }

    public long chreArMajorityVoteWindowMillis() {
        return ((Long) chreArMajorityVoteWindowMillis.c()).longValue();
    }

    public long chreArModel() {
        return ((Long) chreArModel.c()).longValue();
    }

    public long chreArTimeoutToIdleMs() {
        return ((Long) chreArTimeoutToIdleMs.c()).longValue();
    }

    public long chreArTransitionMinVersion() {
        return ((Long) chreArTransitionMinVersion.c()).longValue();
    }

    public long chreArTransitionMinVersionAbms() {
        return ((Long) chreArTransitionMinVersionAbms.c()).longValue();
    }

    public long chreArVersionToEnableRoadRailVehicle() {
        return ((Long) chreArVersionToEnableRoadRailVehicle.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableChreArBluetoothFiltering() {
        return ((Boolean) enableChreArBluetoothFiltering.c()).booleanValue();
    }

    public boolean enableChreArWifiFiltering() {
        return ((Boolean) enableChreArWifiFiltering.c()).booleanValue();
    }

    public boolean enableChreResultsBikeRelabeling() {
        return ((Boolean) enableChreResultsBikeRelabeling.c()).booleanValue();
    }

    public boolean legacyHardwareArNoOpEnabled() {
        return ((Boolean) legacyHardwareArNoOpEnabled.c()).booleanValue();
    }

    public long numConsecutiveStillsToIdle() {
        return ((Long) numConsecutiveStillsToIdle.c()).longValue();
    }
}
