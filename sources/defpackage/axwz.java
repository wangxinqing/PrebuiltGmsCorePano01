package defpackage;

/* renamed from: axwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwz implements axwy {
    public static final agvx aaeRelabelArResultsAsVehicle;
    public static final agvx activityLowPowerModeEnabled;
    public static final agvx activityPowerSaveModeMinIntervalMillis;
    public static final agvx allowInstantAlarm;
    public static final agvx arBatchingApiLatencyFixRollback;
    public static final agvx arDisallowActivityDetectionDisable;
    public static final agvx arWakeupAlignToMinute;
    public static final agvx collectBluetoothInVehicleDeviceClassification;
    public static final agvx downSampleArIntervalMs;
    public static final agvx emulateHardwareActivityRecognitionFlush;
    public static final agvx enableActivityRecognitionClearcutLogging;
    public static final agvx enableActivityRecognitionThrottling;
    public static final agvx enableAppImportanceListener;
    public static final agvx enableBluetoothInVehicle;
    public static final agvx enableBluetoothInVehicleLowLatency;
    public static final agvx enableGmmBluetoothMetrics;
    public static final agvx enableGmmHistoryTracker;
    public static final agvx minArIntervalMs;
    public static final agvx mockActivityType;
    public static final agvx motionClearsDeepStillState;
    public static final agvx registerPowerConnectionBroadcasts;
    public static final agvx relabelActivityWhenWifiConnected;
    public static final agvx sensorBatchingEnabled;
    public static final agvx sensorBatchingFlushTimeoutMillis;
    public static final agvx sensorBatchingNonwearableMaxPeriodMillis;
    public static final agvx sensorBatchingOnWatchEnabled;
    public static final agvx sensorBatchingProbDelayConst;
    public static final agvx sensorBatchingProbMin;
    public static final agvx significantMotionEnabled;
    public static final agvx trackActivityPowerModeTimeProb;
    public static final agvx userDomain;
    public static final agvx wakeUpTiltDetectorEnabled;
    public static final agvx wristTiltEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        aaeRelabelArResultsAsVehicle = agvx.a(a, "aae_relabel_ar_results_as_vehicle", true);
        activityLowPowerModeEnabled = agvx.a(a, "activity_low_power_mode_enabled", true);
        activityPowerSaveModeMinIntervalMillis = agvx.a(a, "activity_power_save_mode_min_interval_millis", 300000);
        allowInstantAlarm = agvx.a(a, "allow_instant_alarm", false);
        arBatchingApiLatencyFixRollback = agvx.a(a, "ar_batching_api_latency_fix_rollback", false);
        arDisallowActivityDetectionDisable = agvx.a(a, "ar_disallow_activity_detection_disable", true);
        arWakeupAlignToMinute = agvx.a(a, "ar_wakeup_align_to_minute", true);
        collectBluetoothInVehicleDeviceClassification = agvx.a(a, "collect_bluetooth_in_vehicle_device_classification", false);
        downSampleArIntervalMs = agvx.a(a, "down_sample_ar_interval_ms", 120000);
        emulateHardwareActivityRecognitionFlush = agvx.a(a, "emulate_hardware_activity_recognition_flush", false);
        enableActivityRecognitionClearcutLogging = agvx.a(a, "enable_activity_recognition_clearcut_logging", true);
        enableActivityRecognitionThrottling = agvx.a(a, "enable_activity_recognition_throttling", false);
        enableAppImportanceListener = agvx.a(a, "enable_app_importance_listener", false);
        enableBluetoothInVehicle = agvx.a(a, "enable_bluetooth_in_vehicle", true);
        enableBluetoothInVehicleLowLatency = agvx.a(a, "enable_bluetooth_in_vehicle_low_latency", true);
        enableGmmBluetoothMetrics = agvx.a(a, "enable_gmm_bluetooth_metrics", false);
        enableGmmHistoryTracker = agvx.a(a, "enable_gmm_history_tracker", false);
        minArIntervalMs = agvx.a(a, "min_ar_interval_ms", 60000);
        mockActivityType = agvx.a(a, "mock_activity_type", "");
        motionClearsDeepStillState = agvx.a(a, "motion_clears_deep_still_state", false);
        registerPowerConnectionBroadcasts = agvx.a(a, "register_power_connection_broadcasts", true);
        relabelActivityWhenWifiConnected = agvx.a(a, "relabel_activity_when_wifi_connected", true);
        sensorBatchingEnabled = agvx.a(a, "sensor_batching_enabled", false);
        sensorBatchingFlushTimeoutMillis = agvx.a(a, "sensor_batching_flush_timeout_millis", 200);
        sensorBatchingNonwearableMaxPeriodMillis = agvx.a(a, "sensor_batching_max_period", 240000);
        sensorBatchingOnWatchEnabled = agvx.a(a, "sensor_batching_on_watch_enabled", true);
        sensorBatchingProbDelayConst = agvx.a(a, "sensor_batching_prob_decay_const", 0.8d);
        sensorBatchingProbMin = agvx.a(a, "sensor_batching_prob_min", 0.01d);
        significantMotionEnabled = agvx.a(a, "significant_motion_enabled", true);
        trackActivityPowerModeTimeProb = agvx.a(a, "track_activity_power_mode_time_prob", 0.00390625d);
        userDomain = agvx.a(a, "user_domain", "");
        wakeUpTiltDetectorEnabled = agvx.a(a, "wake_up_tilt_detector_enabled", true);
        wristTiltEnabled = agvx.a(a, "wrist_tilt_enabled", true);
    }

    public boolean aaeRelabelArResultsAsVehicle() {
        return ((Boolean) aaeRelabelArResultsAsVehicle.c()).booleanValue();
    }

    public boolean activityLowPowerModeEnabled() {
        return ((Boolean) activityLowPowerModeEnabled.c()).booleanValue();
    }

    public long activityPowerSaveModeMinIntervalMillis() {
        return ((Long) activityPowerSaveModeMinIntervalMillis.c()).longValue();
    }

    public boolean allowInstantAlarm() {
        return ((Boolean) allowInstantAlarm.c()).booleanValue();
    }

    public boolean arBatchingApiLatencyFixRollback() {
        return ((Boolean) arBatchingApiLatencyFixRollback.c()).booleanValue();
    }

    public boolean arDisallowActivityDetectionDisable() {
        return ((Boolean) arDisallowActivityDetectionDisable.c()).booleanValue();
    }

    public boolean arWakeupAlignToMinute() {
        return ((Boolean) arWakeupAlignToMinute.c()).booleanValue();
    }

    public boolean collectBluetoothInVehicleDeviceClassification() {
        return ((Boolean) collectBluetoothInVehicleDeviceClassification.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long downSampleArIntervalMs() {
        return ((Long) downSampleArIntervalMs.c()).longValue();
    }

    public boolean emulateHardwareActivityRecognitionFlush() {
        return ((Boolean) emulateHardwareActivityRecognitionFlush.c()).booleanValue();
    }

    public boolean enableActivityRecognitionClearcutLogging() {
        return ((Boolean) enableActivityRecognitionClearcutLogging.c()).booleanValue();
    }

    public boolean enableActivityRecognitionThrottling() {
        return ((Boolean) enableActivityRecognitionThrottling.c()).booleanValue();
    }

    public boolean enableAppImportanceListener() {
        return ((Boolean) enableAppImportanceListener.c()).booleanValue();
    }

    public boolean enableBluetoothInVehicle() {
        return ((Boolean) enableBluetoothInVehicle.c()).booleanValue();
    }

    public boolean enableBluetoothInVehicleLowLatency() {
        return ((Boolean) enableBluetoothInVehicleLowLatency.c()).booleanValue();
    }

    public boolean enableGmmBluetoothMetrics() {
        return ((Boolean) enableGmmBluetoothMetrics.c()).booleanValue();
    }

    public boolean enableGmmHistoryTracker() {
        return ((Boolean) enableGmmHistoryTracker.c()).booleanValue();
    }

    public long minArIntervalMs() {
        return ((Long) minArIntervalMs.c()).longValue();
    }

    public String mockActivityType() {
        return (String) mockActivityType.c();
    }

    public boolean motionClearsDeepStillState() {
        return ((Boolean) motionClearsDeepStillState.c()).booleanValue();
    }

    public boolean registerPowerConnectionBroadcasts() {
        return ((Boolean) registerPowerConnectionBroadcasts.c()).booleanValue();
    }

    public boolean relabelActivityWhenWifiConnected() {
        return ((Boolean) relabelActivityWhenWifiConnected.c()).booleanValue();
    }

    public boolean sensorBatchingEnabled() {
        return ((Boolean) sensorBatchingEnabled.c()).booleanValue();
    }

    public long sensorBatchingFlushTimeoutMillis() {
        return ((Long) sensorBatchingFlushTimeoutMillis.c()).longValue();
    }

    public long sensorBatchingNonwearableMaxPeriodMillis() {
        return ((Long) sensorBatchingNonwearableMaxPeriodMillis.c()).longValue();
    }

    public boolean sensorBatchingOnWatchEnabled() {
        return ((Boolean) sensorBatchingOnWatchEnabled.c()).booleanValue();
    }

    public double sensorBatchingProbDelayConst() {
        return ((Double) sensorBatchingProbDelayConst.c()).doubleValue();
    }

    public double sensorBatchingProbMin() {
        return ((Double) sensorBatchingProbMin.c()).doubleValue();
    }

    public boolean significantMotionEnabled() {
        return ((Boolean) significantMotionEnabled.c()).booleanValue();
    }

    public double trackActivityPowerModeTimeProb() {
        return ((Double) trackActivityPowerModeTimeProb.c()).doubleValue();
    }

    public String userDomain() {
        return (String) userDomain.c();
    }

    public boolean wakeUpTiltDetectorEnabled() {
        return ((Boolean) wakeUpTiltDetectorEnabled.c()).booleanValue();
    }

    public boolean wristTiltEnabled() {
        return ((Boolean) wristTiltEnabled.c()).booleanValue();
    }
}
