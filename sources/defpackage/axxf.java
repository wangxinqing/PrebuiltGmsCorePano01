package defpackage;

/* renamed from: axxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxf implements axxe {
    public static final agvx chreArAudioDiagnosticsLog;
    public static final agvx chreArAudioEnableAudioBasedCarExit;
    public static final agvx chreArAudioEnableAudioFusion;
    public static final agvx chreArAudioMinAudioCarClassificationConfidence;
    public static final agvx chreArAudioMinAudioNoncarClassificationConfidence;
    public static final agvx chreArAudioMinBufferedMotionClassificationsCar;
    public static final agvx chreArAudioMinBufferedMotionClassificationsOnfoot;
    public static final agvx chreArAudioMinBufferedMotionClassificationsStill;
    public static final agvx chreArAudioMinContinuousAudioClassificationsCar;
    public static final agvx chreArAudioMinContinuousAudioClassificationsNoncar;
    public static final agvx chreArAudioMinContinuousMotionClassificationsBicycle;
    public static final agvx chreArAudioMinContinuousMotionClassificationsCar;
    public static final agvx chreArAudioMinContinuousMotionClassificationsOnfoot;
    public static final agvx chreArAudioMinContinuousMotionClassificationsStill;
    public static final agvx chreArAudioMinMotionBicycleClassificationConfidence;
    public static final agvx chreArAudioMinMotionCarClassificationConfidence;
    public static final agvx chreArAudioMinMotionOnfootClassificationConfidence;
    public static final agvx chreArAudioMinMotionStillClassificationConfidence;
    public static final agvx chreArAudioMinPressurePeakSpikeBackDelta;
    public static final agvx chreArAudioMinPressurePeakSpikeThreshold;
    public static final agvx chreArAudioTimeIntervalThresholdForPressurePeakMillis;
    public static final agvx chreArAudioVerbose;
    public static final agvx chreArDeepStillIntervalExitMillis;
    public static final agvx chreArEnableMultimodalModelBasedExitTransition;
    public static final agvx chreArMaxLastVehicleDetectionIntervalForAllStillMillis;
    public static final agvx chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis;
    public static final agvx chreArOnfootRecencyTimeIntervalMillis;
    public static final agvx enableActivityRecognitionMode;
    public static final agvx enableAudioChreWifiFiltering;
    public static final agvx enableCarExitOnIdle;
    public static final agvx enableConnectedWifiFilterAudioFusion;
    public static final agvx enableDrivingDndExitWithAudioFusion;
    public static final agvx enableDrivingDndWithAudioFusion;
    public static final agvx enableDrivingDndWithRoadRail;
    public static final agvx firstPartyAudioEnabledPackageWhitelist;
    public static final agvx flexAudioFusion;
    public static final agvx onlyRelyOnCarTransitionStateMachine;
    public static final agvx zeroPartyAudioEnabledTagWhitelist;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        chreArAudioDiagnosticsLog = agvx.a(a, "chre_ar_audio_diagnostics_log", true);
        chreArAudioEnableAudioBasedCarExit = agvx.a(a, "chre_ar_audio_enable_audio_based_car_exit", true);
        chreArAudioEnableAudioFusion = agvx.a(a, "chre_ar_audio_enable_audio_fusion", false);
        chreArAudioMinAudioCarClassificationConfidence = agvx.a(a, "chre_ar_audio_min_audio_car_classification_confidence", 0.85d);
        chreArAudioMinAudioNoncarClassificationConfidence = agvx.a(a, "chre_ar_audio_min_audio_noncar_classification_confidence", 0.9d);
        chreArAudioMinBufferedMotionClassificationsCar = agvx.a(a, "chre_ar_audio_min_buffered_motion_classifications_car", 5);
        chreArAudioMinBufferedMotionClassificationsOnfoot = agvx.a(a, "chre_ar_audio_min_buffered_motion_classifications_onfoot", 5);
        chreArAudioMinBufferedMotionClassificationsStill = agvx.a(a, "chre_ar_audio_min_buffered_motion_classifications_still", 5);
        chreArAudioMinContinuousAudioClassificationsCar = agvx.a(a, "chre_ar_audio_min_continuous_audio_classifications_car", 2);
        chreArAudioMinContinuousAudioClassificationsNoncar = agvx.a(a, "chre_ar_audio_min_continuous_audio_classifications_noncar", 5);
        chreArAudioMinContinuousMotionClassificationsBicycle = agvx.a(a, "chre_ar_audio_min_continuous_motion_classifications_bicycle", 8);
        chreArAudioMinContinuousMotionClassificationsCar = agvx.a(a, "chre_ar_audio_min_continuous_motion_classifications_car", 0);
        chreArAudioMinContinuousMotionClassificationsOnfoot = agvx.a(a, "chre_ar_audio_min_continuous_motion_classifications_onfoot", 2);
        chreArAudioMinContinuousMotionClassificationsStill = agvx.a(a, "chre_ar_audio_min_continuous_motion_classifications_still", 3);
        chreArAudioMinMotionBicycleClassificationConfidence = agvx.a(a, "chre_ar_audio_min_motion_bicycle_classification_confidence", 0.8d);
        chreArAudioMinMotionCarClassificationConfidence = agvx.a(a, "chre_ar_audio_min_motion_car_classification_confidence", 0.8d);
        chreArAudioMinMotionOnfootClassificationConfidence = agvx.a(a, "chre_ar_audio_min_motion_onfoot_classification_confidence", 0.8d);
        chreArAudioMinMotionStillClassificationConfidence = agvx.a(a, "chre_ar_audio_min_motion_still_classification_confidence", 0.8d);
        chreArAudioMinPressurePeakSpikeBackDelta = agvx.a(a, "chre_ar_audio_min_pressure_peak_spike_back_delta", 0.1d);
        chreArAudioMinPressurePeakSpikeThreshold = agvx.a(a, "chre_ar_audio_min_pressure_peak_spike_threshold", 5.0d);
        chreArAudioTimeIntervalThresholdForPressurePeakMillis = agvx.a(a, "chre_ar_audio_time_interval_threshold_for_pressure_peak_millis", 1000);
        chreArAudioVerbose = agvx.a(a, "chre_ar_audio_verbose", false);
        chreArDeepStillIntervalExitMillis = agvx.a(a, "chre_ar_deep_still_interval_exit_millis", 600000);
        chreArEnableMultimodalModelBasedExitTransition = agvx.a(a, "chre_ar_enable_multimodal_model_based_exit_transition", false);
        chreArMaxLastVehicleDetectionIntervalForAllStillMillis = agvx.a(a, "chre_ar_max_last_vehicle_detection_interval_for_all_still_millis", 600000);
        chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis = agvx.a(a, "chre_ar_max_last_vehicle_detection_interval_for_other_transition_millis", 600000);
        chreArOnfootRecencyTimeIntervalMillis = agvx.a(a, "chre_ar_onfoot_recency_time_interval_millis", 10000);
        enableActivityRecognitionMode = agvx.a(a, "enable_activity_recognition_mode", false);
        enableAudioChreWifiFiltering = agvx.a(a, "enable_audio_chre_wifi_filtering", true);
        enableCarExitOnIdle = agvx.a(a, "enable_car_exit_on_idle", true);
        enableConnectedWifiFilterAudioFusion = agvx.a(a, "enable_connected_wifi_filter_audio_fusion", false);
        enableDrivingDndExitWithAudioFusion = agvx.a(a, "enable_driving_dnd_exit_with_audio_fusion", true);
        enableDrivingDndWithAudioFusion = agvx.a(a, "enable_driving_dnd_with_audio_fusion", false);
        enableDrivingDndWithRoadRail = agvx.a(a, "enable_driving_dnd_with_road_rail", false);
        firstPartyAudioEnabledPackageWhitelist = agvx.a(a, "first_party_audio_enabled_package_whitelist", "com.google.android.gms.samples.location.activity.firstparty;");
        flexAudioFusion = agvx.a(a, "flex_audio_fusion", 0);
        onlyRelyOnCarTransitionStateMachine = agvx.a(a, "only_rely_on_car_transition_state_machine", false);
        zeroPartyAudioEnabledTagWhitelist = agvx.a(a, "zero_party_audio_enabled_tag_whitelist", "ardnd;DrivingMode;");
    }

    public boolean chreArAudioDiagnosticsLog() {
        return ((Boolean) chreArAudioDiagnosticsLog.c()).booleanValue();
    }

    public boolean chreArAudioEnableAudioBasedCarExit() {
        return ((Boolean) chreArAudioEnableAudioBasedCarExit.c()).booleanValue();
    }

    public boolean chreArAudioEnableAudioFusion() {
        return ((Boolean) chreArAudioEnableAudioFusion.c()).booleanValue();
    }

    public double chreArAudioMinAudioCarClassificationConfidence() {
        return ((Double) chreArAudioMinAudioCarClassificationConfidence.c()).doubleValue();
    }

    public double chreArAudioMinAudioNoncarClassificationConfidence() {
        return ((Double) chreArAudioMinAudioNoncarClassificationConfidence.c()).doubleValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsCar() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsCar.c()).longValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsOnfoot() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsOnfoot.c()).longValue();
    }

    public long chreArAudioMinBufferedMotionClassificationsStill() {
        return ((Long) chreArAudioMinBufferedMotionClassificationsStill.c()).longValue();
    }

    public long chreArAudioMinContinuousAudioClassificationsCar() {
        return ((Long) chreArAudioMinContinuousAudioClassificationsCar.c()).longValue();
    }

    public long chreArAudioMinContinuousAudioClassificationsNoncar() {
        return ((Long) chreArAudioMinContinuousAudioClassificationsNoncar.c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsBicycle() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsBicycle.c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsCar() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsCar.c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsOnfoot() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsOnfoot.c()).longValue();
    }

    public long chreArAudioMinContinuousMotionClassificationsStill() {
        return ((Long) chreArAudioMinContinuousMotionClassificationsStill.c()).longValue();
    }

    public double chreArAudioMinMotionBicycleClassificationConfidence() {
        return ((Double) chreArAudioMinMotionBicycleClassificationConfidence.c()).doubleValue();
    }

    public double chreArAudioMinMotionCarClassificationConfidence() {
        return ((Double) chreArAudioMinMotionCarClassificationConfidence.c()).doubleValue();
    }

    public double chreArAudioMinMotionOnfootClassificationConfidence() {
        return ((Double) chreArAudioMinMotionOnfootClassificationConfidence.c()).doubleValue();
    }

    public double chreArAudioMinMotionStillClassificationConfidence() {
        return ((Double) chreArAudioMinMotionStillClassificationConfidence.c()).doubleValue();
    }

    public double chreArAudioMinPressurePeakSpikeBackDelta() {
        return ((Double) chreArAudioMinPressurePeakSpikeBackDelta.c()).doubleValue();
    }

    public double chreArAudioMinPressurePeakSpikeThreshold() {
        return ((Double) chreArAudioMinPressurePeakSpikeThreshold.c()).doubleValue();
    }

    public long chreArAudioTimeIntervalThresholdForPressurePeakMillis() {
        return ((Long) chreArAudioTimeIntervalThresholdForPressurePeakMillis.c()).longValue();
    }

    public boolean chreArAudioVerbose() {
        return ((Boolean) chreArAudioVerbose.c()).booleanValue();
    }

    public long chreArDeepStillIntervalExitMillis() {
        return ((Long) chreArDeepStillIntervalExitMillis.c()).longValue();
    }

    public boolean chreArEnableMultimodalModelBasedExitTransition() {
        return ((Boolean) chreArEnableMultimodalModelBasedExitTransition.c()).booleanValue();
    }

    public long chreArMaxLastVehicleDetectionIntervalForAllStillMillis() {
        return ((Long) chreArMaxLastVehicleDetectionIntervalForAllStillMillis.c()).longValue();
    }

    public long chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis() {
        return ((Long) chreArMaxLastVehicleDetectionIntervalForOtherTransitionMillis.c()).longValue();
    }

    public long chreArOnfootRecencyTimeIntervalMillis() {
        return ((Long) chreArOnfootRecencyTimeIntervalMillis.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityRecognitionMode() {
        return ((Boolean) enableActivityRecognitionMode.c()).booleanValue();
    }

    public boolean enableAudioChreWifiFiltering() {
        return ((Boolean) enableAudioChreWifiFiltering.c()).booleanValue();
    }

    public boolean enableCarExitOnIdle() {
        return ((Boolean) enableCarExitOnIdle.c()).booleanValue();
    }

    public boolean enableConnectedWifiFilterAudioFusion() {
        return ((Boolean) enableConnectedWifiFilterAudioFusion.c()).booleanValue();
    }

    public boolean enableDrivingDndExitWithAudioFusion() {
        return ((Boolean) enableDrivingDndExitWithAudioFusion.c()).booleanValue();
    }

    public boolean enableDrivingDndWithAudioFusion() {
        return ((Boolean) enableDrivingDndWithAudioFusion.c()).booleanValue();
    }

    public boolean enableDrivingDndWithRoadRail() {
        return ((Boolean) enableDrivingDndWithRoadRail.c()).booleanValue();
    }

    public String firstPartyAudioEnabledPackageWhitelist() {
        return (String) firstPartyAudioEnabledPackageWhitelist.c();
    }

    public long flexAudioFusion() {
        return ((Long) flexAudioFusion.c()).longValue();
    }

    public boolean onlyRelyOnCarTransitionStateMachine() {
        return ((Boolean) onlyRelyOnCarTransitionStateMachine.c()).booleanValue();
    }

    public String zeroPartyAudioEnabledTagWhitelist() {
        return (String) zeroPartyAudioEnabledTagWhitelist.c();
    }
}
