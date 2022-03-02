package defpackage;

/* renamed from: ayep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayep implements ayeo {
    public static final agvx enableFixBufferSize;
    public static final agvx seismicAccelAdaptiveThreshold;
    public static final agvx seismicAccelAngles;
    public static final agvx seismicAccelDetectOutlierAccel;
    public static final agvx seismicAccelDetectSpikes;
    public static final agvx seismicAccelEpochProportion;
    public static final agvx seismicAccelFilterInputFactor;
    public static final agvx seismicAccelFilterOutlierAccel;
    public static final agvx seismicAccelFilterSpikes;
    public static final agvx seismicAccelFrequency;
    public static final agvx seismicAccelFrequencyMax;
    public static final agvx seismicAccelFrequencyMin;
    public static final agvx seismicAccelIndividualAdaptiveThreshold;
    public static final agvx seismicAccelMaxVarianceThresholdM2s4;
    public static final agvx seismicAccelMeanDiffThreshold;
    public static final agvx seismicAccelMinVarianceThresholdM2s4;
    public static final agvx seismicAccelOutlierAccelThreshold;
    public static final agvx seismicAccelRejectNoisyDetectionSession;
    public static final agvx seismicAccelReportAngles;
    public static final agvx seismicAccelResamplingRate;
    public static final agvx seismicAccelShortenEpoch;
    public static final agvx seismicAccelSpikeDurationSeconds;
    public static final agvx seismicAccelSpikeThreshold;
    public static final agvx seismicAccelVarianceFilterAlpha;
    public static final agvx seismicAccelVarianceThreshold;
    public static final agvx seismicAccelVarianceThresholdFactor;
    public static final agvx seismicAccelVarianceThresholdNoisySessionM2s4;
    public static final agvx seismicAnglesFilterAlpha;
    public static final agvx seismicAnglesThresholdDegrees;
    public static final agvx seismicCollectClockSkew;
    public static final agvx seismicDataCollection;
    public static final agvx seismicDataCollectionBroad;
    public static final agvx seismicDataCollectionCircles;
    public static final agvx seismicDebugBypassBattery;
    public static final agvx seismicDebugBypassMotion;
    public static final agvx seismicDebugLog;
    public static final agvx seismicDebugNotification;
    public static final agvx seismicDetectorTimeoutMillis;
    public static final agvx seismicDeviceTypePrecision;
    public static final agvx seismicDisableForSupervised;
    public static final agvx seismicEnableGls;
    public static final agvx seismicEnableStartupDelay;
    public static final agvx seismicEnableVibratorAccess;
    public static final agvx seismicEventDetectionIntervalMillis;
    public static final agvx seismicEventDetectionWindowMillis;
    public static final agvx seismicEventReportingWindowMillis;
    public static final agvx seismicEventThrottlingPeriodMillis;
    public static final agvx seismicFilterActiveVibe;
    public static final agvx seismicFilterActiveVibeIntervalMs;
    public static final agvx seismicHeartbeatEnableS2CellReporting;
    public static final agvx seismicHeartbeatIntervalAllowanceMillis;
    public static final agvx seismicHeartbeatIntervalMillis;
    public static final agvx seismicHeartbeatS2CellLevel;
    public static final agvx seismicLocationFastestIntervalMillis;
    public static final agvx seismicLocationPassiveIntervalMillis;
    public static final agvx seismicMaxStartupDelayMillis;
    public static final agvx seismicMinBatteryPercent;
    public static final agvx seismicMinStartupDelayMillis;
    public static final agvx seismicOffsetRefreshIntervalMillis;
    public static final agvx seismicPowerCheckerPeriodMillis;
    public static final agvx seismicRefactor201906;
    public static final agvx seismicReportActiveVibe;
    public static final agvx seismicRequireGoogleAccount;
    public static final agvx seismicRunningPickupRecency;
    public static final agvx seismicScreenStateUse;
    public static final agvx seismicSendSessionFinish;
    public static final agvx seismicSendSessionHeartbeat;
    public static final agvx seismicSendSessionStart;
    public static final agvx seismicShakeThrottlerConfig;
    public static final agvx seismicUseNewLocationApi;
    public static final agvx seismicUsePersistentThrottler;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableFixBufferSize = agvx.a(a, "enable_fix_buffer_size", false);
        seismicAccelAdaptiveThreshold = agvx.a(a, "seismic_accel_adaptive_threshold", false);
        seismicAccelAngles = agvx.a(a, "seismic_accel_angles", false);
        seismicAccelDetectOutlierAccel = agvx.a(a, "seismic_accel_detect_outlier_accel", false);
        seismicAccelDetectSpikes = agvx.a(a, "seismic_accel_detect_spikes", false);
        seismicAccelEpochProportion = agvx.a(a, "seismic_accel_epoch_proportion", 0.6d);
        seismicAccelFilterInputFactor = agvx.a(a, "seismic_accel_filter_input_factor", 2.0d);
        seismicAccelFilterOutlierAccel = agvx.a(a, "seismic_filter_outlier_accel", false);
        seismicAccelFilterSpikes = agvx.a(a, "seismic_filter_spike", false);
        seismicAccelFrequency = agvx.a(a, "seismic_accel_frequency", 20);
        seismicAccelFrequencyMax = agvx.a(a, "seismic_accel_frequency_max", 60);
        seismicAccelFrequencyMin = agvx.a(a, "seismic_accel_frequency_min", 10);
        seismicAccelIndividualAdaptiveThreshold = agvx.a(a, "seismic_accel_individual_adaptive_threshold", false);
        seismicAccelMaxVarianceThresholdM2s4 = agvx.a(a, "seismic_accel_max_variance_threshold_m2s4", 0.3d);
        seismicAccelMeanDiffThreshold = agvx.a(a, "seismic_accel_mean_diff_threshold", 0.1d);
        seismicAccelMinVarianceThresholdM2s4 = agvx.a(a, "seismic_accel_min_variance_threshold_m2s4", 0.00125d);
        seismicAccelOutlierAccelThreshold = agvx.a(a, "seismic_accel_outlier_accel_threshold", 200.0d);
        seismicAccelRejectNoisyDetectionSession = agvx.a(a, "seismic_accel_reject_noisy_detection_session", false);
        seismicAccelReportAngles = agvx.a(a, "seismic_accel_report_angles", false);
        seismicAccelResamplingRate = agvx.a(a, "seismic_accel_resampling_rate", 64);
        seismicAccelShortenEpoch = agvx.a(a, "seismic_accel_shorten_epoch", false);
        seismicAccelSpikeDurationSeconds = agvx.a(a, "seismic_accel_spike_duration_seconds", 0.1d);
        seismicAccelSpikeThreshold = agvx.a(a, "seismic_accel_spike_threshold", 0.2d);
        seismicAccelVarianceFilterAlpha = agvx.a(a, "seismic_accel_variance_filter_alpha", 0.005d);
        seismicAccelVarianceThreshold = agvx.a(a, "seismic_accel_variance_threshold", 0.1d);
        seismicAccelVarianceThresholdFactor = agvx.a(a, "seismic_accel_variance_threshold_factor", 5.0d);
        seismicAccelVarianceThresholdNoisySessionM2s4 = agvx.a(a, "seismic_accel_variance_threshold_noisy_session_m2s4", 0.29d);
        seismicAnglesFilterAlpha = agvx.a(a, "seismic_angles_filter_alpha", 0.075d);
        seismicAnglesThresholdDegrees = agvx.a(a, "seismic_angles_threshold_degrees", 30.0d);
        seismicCollectClockSkew = agvx.a(a, "seismic_collect_clock_skew", false);
        seismicDataCollection = agvx.a(a, "seismic_data_collection", false);
        seismicDataCollectionBroad = agvx.a(a, "seismic_data_collection_broad", false);
        seismicDataCollectionCircles = agvx.a(a, "seismic_data_collection_circles", "");
        seismicDebugBypassBattery = agvx.a(a, "seismic_debug_bypass_battery", false);
        seismicDebugBypassMotion = agvx.a(a, "seismic_debug_bypass_motion", false);
        seismicDebugLog = agvx.a(a, "seismic_debug_log", false);
        seismicDebugNotification = agvx.a(a, "seismic_debug_notification", false);
        seismicDetectorTimeoutMillis = agvx.a(a, "seismic_detector_timeout_millis", 200);
        seismicDeviceTypePrecision = agvx.a(a, "seismic_device_type_precision", 1);
        seismicDisableForSupervised = agvx.a(a, "seismic_disable_for_supervised", false);
        seismicEnableGls = agvx.a(a, "seismic_enable_gls", false);
        seismicEnableStartupDelay = agvx.a(a, "seismic_enable_startup_delay", false);
        seismicEnableVibratorAccess = agvx.a(a, "seismic_enable_vibrator_access", false);
        seismicEventDetectionIntervalMillis = agvx.a(a, "seismic_event_detection_interval_millis", 500);
        seismicEventDetectionWindowMillis = agvx.a(a, "seismic_event_detection_window_millis", 1000);
        seismicEventReportingWindowMillis = agvx.a(a, "seismic_event_reporting_window_millis", 10000);
        seismicEventThrottlingPeriodMillis = agvx.a(a, "seismic_event_throttling_period_millis", 180000);
        seismicFilterActiveVibe = agvx.a(a, "seismic_filter_active_vibe", false);
        seismicFilterActiveVibeIntervalMs = agvx.a(a, "seismic_filter_active_vibe_interval", 30000);
        seismicHeartbeatEnableS2CellReporting = agvx.a(a, "seismic_heartbeat_enable_s2_cell_reporting", false);
        seismicHeartbeatIntervalAllowanceMillis = agvx.a(a, "seismic_heartbeat_interval_allowance_millis", 60000);
        seismicHeartbeatIntervalMillis = agvx.a(a, "seismic_heartbeat_interval_millis", 3600000);
        seismicHeartbeatS2CellLevel = agvx.a(a, "seismic_heartbeat_s2_cell_level", 11);
        seismicLocationFastestIntervalMillis = agvx.a(a, "seismic_location_fastest_interval_millis", 300000);
        seismicLocationPassiveIntervalMillis = agvx.a(a, "seismic_location_passive_interval_millis", 600000);
        seismicMaxStartupDelayMillis = agvx.a(a, "seismic_max_startup_delay_millis", 240000);
        seismicMinBatteryPercent = agvx.a(a, "seismic_min_battery_percent", 87);
        seismicMinStartupDelayMillis = agvx.a(a, "seismic_min_startup_delay_millis", 60000);
        seismicOffsetRefreshIntervalMillis = agvx.a(a, "seismic_offset_refresh_interval_millis", 600000);
        seismicPowerCheckerPeriodMillis = agvx.a(a, "seismic_power_checker_period_millis", 1800000);
        seismicRefactor201906 = agvx.a(a, "seismic_refactor_201906", false);
        seismicReportActiveVibe = agvx.a(a, "seismic_report_active_vibe", false);
        seismicRequireGoogleAccount = agvx.a(a, "seismic_require_google_account", false);
        seismicRunningPickupRecency = agvx.a(a, "seismic_running_pickup_recency", 100);
        seismicScreenStateUse = agvx.a(a, "seismic_screen_state_use", 0);
        seismicSendSessionFinish = agvx.a(a, "seismic_send_session_finish", false);
        seismicSendSessionHeartbeat = agvx.a(a, "seismic_send_session_heartbeat", false);
        seismicSendSessionStart = agvx.a(a, "seismic_send_session_start", false);
        seismicShakeThrottlerConfig = agvx.a(a, "seismic_shake_throttler_config", "120:1,300:2,86400:20");
        seismicUseNewLocationApi = agvx.a(a, "seismic_use_new_location_api", false);
        seismicUsePersistentThrottler = agvx.a(a, "seismic_use_persistent_throttler", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableFixBufferSize() {
        return ((Boolean) enableFixBufferSize.c()).booleanValue();
    }

    public boolean seismicAccelAdaptiveThreshold() {
        return ((Boolean) seismicAccelAdaptiveThreshold.c()).booleanValue();
    }

    public boolean seismicAccelAngles() {
        return ((Boolean) seismicAccelAngles.c()).booleanValue();
    }

    public boolean seismicAccelDetectOutlierAccel() {
        return ((Boolean) seismicAccelDetectOutlierAccel.c()).booleanValue();
    }

    public boolean seismicAccelDetectSpikes() {
        return ((Boolean) seismicAccelDetectSpikes.c()).booleanValue();
    }

    public double seismicAccelEpochProportion() {
        return ((Double) seismicAccelEpochProportion.c()).doubleValue();
    }

    public double seismicAccelFilterInputFactor() {
        return ((Double) seismicAccelFilterInputFactor.c()).doubleValue();
    }

    public boolean seismicAccelFilterOutlierAccel() {
        return ((Boolean) seismicAccelFilterOutlierAccel.c()).booleanValue();
    }

    public boolean seismicAccelFilterSpikes() {
        return ((Boolean) seismicAccelFilterSpikes.c()).booleanValue();
    }

    public long seismicAccelFrequency() {
        return ((Long) seismicAccelFrequency.c()).longValue();
    }

    public long seismicAccelFrequencyMax() {
        return ((Long) seismicAccelFrequencyMax.c()).longValue();
    }

    public long seismicAccelFrequencyMin() {
        return ((Long) seismicAccelFrequencyMin.c()).longValue();
    }

    public boolean seismicAccelIndividualAdaptiveThreshold() {
        return ((Boolean) seismicAccelIndividualAdaptiveThreshold.c()).booleanValue();
    }

    public double seismicAccelMaxVarianceThresholdM2s4() {
        return ((Double) seismicAccelMaxVarianceThresholdM2s4.c()).doubleValue();
    }

    public double seismicAccelMeanDiffThreshold() {
        return ((Double) seismicAccelMeanDiffThreshold.c()).doubleValue();
    }

    public double seismicAccelMinVarianceThresholdM2s4() {
        return ((Double) seismicAccelMinVarianceThresholdM2s4.c()).doubleValue();
    }

    public double seismicAccelOutlierAccelThreshold() {
        return ((Double) seismicAccelOutlierAccelThreshold.c()).doubleValue();
    }

    public boolean seismicAccelRejectNoisyDetectionSession() {
        return ((Boolean) seismicAccelRejectNoisyDetectionSession.c()).booleanValue();
    }

    public boolean seismicAccelReportAngles() {
        return ((Boolean) seismicAccelReportAngles.c()).booleanValue();
    }

    public long seismicAccelResamplingRate() {
        return ((Long) seismicAccelResamplingRate.c()).longValue();
    }

    public boolean seismicAccelShortenEpoch() {
        return ((Boolean) seismicAccelShortenEpoch.c()).booleanValue();
    }

    public double seismicAccelSpikeDurationSeconds() {
        return ((Double) seismicAccelSpikeDurationSeconds.c()).doubleValue();
    }

    public double seismicAccelSpikeThreshold() {
        return ((Double) seismicAccelSpikeThreshold.c()).doubleValue();
    }

    public double seismicAccelVarianceFilterAlpha() {
        return ((Double) seismicAccelVarianceFilterAlpha.c()).doubleValue();
    }

    public double seismicAccelVarianceThreshold() {
        return ((Double) seismicAccelVarianceThreshold.c()).doubleValue();
    }

    public double seismicAccelVarianceThresholdFactor() {
        return ((Double) seismicAccelVarianceThresholdFactor.c()).doubleValue();
    }

    public double seismicAccelVarianceThresholdNoisySessionM2s4() {
        return ((Double) seismicAccelVarianceThresholdNoisySessionM2s4.c()).doubleValue();
    }

    public double seismicAnglesFilterAlpha() {
        return ((Double) seismicAnglesFilterAlpha.c()).doubleValue();
    }

    public double seismicAnglesThresholdDegrees() {
        return ((Double) seismicAnglesThresholdDegrees.c()).doubleValue();
    }

    public boolean seismicCollectClockSkew() {
        return ((Boolean) seismicCollectClockSkew.c()).booleanValue();
    }

    public boolean seismicDataCollection() {
        return ((Boolean) seismicDataCollection.c()).booleanValue();
    }

    public boolean seismicDataCollectionBroad() {
        return ((Boolean) seismicDataCollectionBroad.c()).booleanValue();
    }

    public String seismicDataCollectionCircles() {
        return (String) seismicDataCollectionCircles.c();
    }

    public boolean seismicDebugBypassBattery() {
        return ((Boolean) seismicDebugBypassBattery.c()).booleanValue();
    }

    public boolean seismicDebugBypassMotion() {
        return ((Boolean) seismicDebugBypassMotion.c()).booleanValue();
    }

    public boolean seismicDebugLog() {
        return ((Boolean) seismicDebugLog.c()).booleanValue();
    }

    public boolean seismicDebugNotification() {
        return ((Boolean) seismicDebugNotification.c()).booleanValue();
    }

    public long seismicDetectorTimeoutMillis() {
        return ((Long) seismicDetectorTimeoutMillis.c()).longValue();
    }

    public long seismicDeviceTypePrecision() {
        return ((Long) seismicDeviceTypePrecision.c()).longValue();
    }

    public boolean seismicDisableForSupervised() {
        return ((Boolean) seismicDisableForSupervised.c()).booleanValue();
    }

    public boolean seismicEnableGls() {
        return ((Boolean) seismicEnableGls.c()).booleanValue();
    }

    public boolean seismicEnableStartupDelay() {
        return ((Boolean) seismicEnableStartupDelay.c()).booleanValue();
    }

    public boolean seismicEnableVibratorAccess() {
        return ((Boolean) seismicEnableVibratorAccess.c()).booleanValue();
    }

    public long seismicEventDetectionIntervalMillis() {
        return ((Long) seismicEventDetectionIntervalMillis.c()).longValue();
    }

    public long seismicEventDetectionWindowMillis() {
        return ((Long) seismicEventDetectionWindowMillis.c()).longValue();
    }

    public long seismicEventReportingWindowMillis() {
        return ((Long) seismicEventReportingWindowMillis.c()).longValue();
    }

    public long seismicEventThrottlingPeriodMillis() {
        return ((Long) seismicEventThrottlingPeriodMillis.c()).longValue();
    }

    public boolean seismicFilterActiveVibe() {
        return ((Boolean) seismicFilterActiveVibe.c()).booleanValue();
    }

    public long seismicFilterActiveVibeIntervalMs() {
        return ((Long) seismicFilterActiveVibeIntervalMs.c()).longValue();
    }

    public boolean seismicHeartbeatEnableS2CellReporting() {
        return ((Boolean) seismicHeartbeatEnableS2CellReporting.c()).booleanValue();
    }

    public long seismicHeartbeatIntervalAllowanceMillis() {
        return ((Long) seismicHeartbeatIntervalAllowanceMillis.c()).longValue();
    }

    public long seismicHeartbeatIntervalMillis() {
        return ((Long) seismicHeartbeatIntervalMillis.c()).longValue();
    }

    public long seismicHeartbeatS2CellLevel() {
        return ((Long) seismicHeartbeatS2CellLevel.c()).longValue();
    }

    public long seismicLocationFastestIntervalMillis() {
        return ((Long) seismicLocationFastestIntervalMillis.c()).longValue();
    }

    public long seismicLocationPassiveIntervalMillis() {
        return ((Long) seismicLocationPassiveIntervalMillis.c()).longValue();
    }

    public long seismicMaxStartupDelayMillis() {
        return ((Long) seismicMaxStartupDelayMillis.c()).longValue();
    }

    public long seismicMinBatteryPercent() {
        return ((Long) seismicMinBatteryPercent.c()).longValue();
    }

    public long seismicMinStartupDelayMillis() {
        return ((Long) seismicMinStartupDelayMillis.c()).longValue();
    }

    public long seismicOffsetRefreshIntervalMillis() {
        return ((Long) seismicOffsetRefreshIntervalMillis.c()).longValue();
    }

    public long seismicPowerCheckerPeriodMillis() {
        return ((Long) seismicPowerCheckerPeriodMillis.c()).longValue();
    }

    public boolean seismicRefactor201906() {
        return ((Boolean) seismicRefactor201906.c()).booleanValue();
    }

    public boolean seismicReportActiveVibe() {
        return ((Boolean) seismicReportActiveVibe.c()).booleanValue();
    }

    public boolean seismicRequireGoogleAccount() {
        return ((Boolean) seismicRequireGoogleAccount.c()).booleanValue();
    }

    public long seismicRunningPickupRecency() {
        return ((Long) seismicRunningPickupRecency.c()).longValue();
    }

    public long seismicScreenStateUse() {
        return ((Long) seismicScreenStateUse.c()).longValue();
    }

    public boolean seismicSendSessionFinish() {
        return ((Boolean) seismicSendSessionFinish.c()).booleanValue();
    }

    public boolean seismicSendSessionHeartbeat() {
        return ((Boolean) seismicSendSessionHeartbeat.c()).booleanValue();
    }

    public boolean seismicSendSessionStart() {
        return ((Boolean) seismicSendSessionStart.c()).booleanValue();
    }

    public String seismicShakeThrottlerConfig() {
        return (String) seismicShakeThrottlerConfig.c();
    }

    public boolean seismicUseNewLocationApi() {
        return ((Boolean) seismicUseNewLocationApi.c()).booleanValue();
    }

    public boolean seismicUsePersistentThrottler() {
        return ((Boolean) seismicUsePersistentThrottler.c()).booleanValue();
    }
}
