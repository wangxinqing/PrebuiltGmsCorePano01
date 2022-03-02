package defpackage;

/* renamed from: axxc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxc implements axxb {
    public static final agvx arDeepStillTransitioningEnabled;
    public static final agvx arReportTransitionOnClientAdded;
    public static final agvx arTransitionApplyPersonalConfidenceFilter;
    public static final agvx arTransitionBikingWifiFilteringEnabled;
    public static final agvx arTransitionEventLogging;
    public static final agvx arTransitionFastVehicleexitOnfootEnabled;
    public static final agvx arTransitionFilteringEnabled;
    public static final agvx arTransitionHardwareSoftwareSwitchEnabled;
    public static final agvx arTransitionVehicleBluetoothFilteringEnabled;
    public static final agvx arTransitionVehicleBluetoothTimeoutOptimizations;
    public static final agvx arTransitionWifiFilteringEnabled;
    public static final agvx bikeHighConfidenceThreshold;
    public static final agvx enableActivityTransitionDetection;
    public static final agvx enableAdaptiveWifiSampling;
    public static final agvx footHighConfidenceThreshold;
    public static final agvx hardwareTransitionFilteringEnabled;
    public static final agvx inRailVehicleConfidenceThreshold;
    public static final agvx inVehicleConfidenceThreshold;
    public static final agvx locationStalenessThresholdForSpeedMillis;
    public static final agvx maxTimeVehicleExitWithConnectedBluetoothMillis;
    public static final agvx maxTimeWithoutInCarDetectionMillis;
    public static final agvx maxTimeWithoutInVehicleDetectionMillis;
    public static final agvx minArThrottlingIntervalInMillis;
    public static final agvx minBikeContinuousDetectionCount;
    public static final agvx minContinuousTimeIntervalWithConnectedWifi;
    public static final agvx minFootContinuousDetectionCount;
    public static final agvx minInRailVehicleContinuousDetectionCount;
    public static final agvx minInVehicleContinuousDetectionCount;
    public static final agvx minInVehicleSpeed;
    public static final agvx minOnfootConfidenceForChreResultsBikeRelabeling;
    public static final agvx minOnfootCountForChreResultsBikeRelabeling;
    public static final agvx minPersonalInVehicleConfidence;
    public static final agvx minStillContinuousDetectionCount;
    public static final agvx minStillForTransitionFromFoot;
    public static final agvx minStillHighConfidenceContinuousDetectionCount;
    public static final agvx minVehicleConfidenceForChreResultsBikeRelabeling;
    public static final agvx minVehicleCountForChreResultsBikeRelabeling;
    public static final agvx softwareActivityRecognitionTransitionEnabled;
    public static final agvx softwareActivityRecognitionTransitionEnabledV2;
    public static final agvx stillHighConfidenceThreshold;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        arDeepStillTransitioningEnabled = agvx.a(a, "ar_deep_still_transitioning_enabled", true);
        arReportTransitionOnClientAdded = agvx.a(a, "ar_report_transition_on_client_added", true);
        arTransitionApplyPersonalConfidenceFilter = agvx.a(a, "ar_transition_apply_personal_confidence_filter", true);
        arTransitionBikingWifiFilteringEnabled = agvx.a(a, "ar_transition_biking_wifi_filtering_enabled", true);
        arTransitionEventLogging = agvx.a(a, "ar_transition_event_logging", true);
        arTransitionFastVehicleexitOnfootEnabled = agvx.a(a, "ar_transition_fast_vehicleexit_onfoot_enabled", true);
        arTransitionFilteringEnabled = agvx.a(a, "ar_transition_filtering_enabled", true);
        arTransitionHardwareSoftwareSwitchEnabled = agvx.a(a, "ar_transition_hardware_software_switch_enabled", true);
        arTransitionVehicleBluetoothFilteringEnabled = agvx.a(a, "ar_transition_vehicle_bluetooth_filtering_enabled", true);
        arTransitionVehicleBluetoothTimeoutOptimizations = agvx.a(a, "ar_transition_vehicle_bluetooth_timeout_optimizations", true);
        arTransitionWifiFilteringEnabled = agvx.a(a, "ar_transition_wifi_filtering_enabled", true);
        bikeHighConfidenceThreshold = agvx.a(a, "bike_high_confidence_threshold", 75);
        enableActivityTransitionDetection = agvx.a(a, "enable_activity_transition_detection", true);
        enableAdaptiveWifiSampling = agvx.a(a, "enable_adaptive_wifi_sampling", false);
        footHighConfidenceThreshold = agvx.a(a, "foot_high_confidence_threshold", 75);
        hardwareTransitionFilteringEnabled = agvx.a(a, "hardware_transition_filtering_enabled", false);
        inRailVehicleConfidenceThreshold = agvx.a(a, "in_rail_vehicle_confidence_threshold", 75);
        inVehicleConfidenceThreshold = agvx.a(a, "in_vehicle_confidence_threshold", 75);
        locationStalenessThresholdForSpeedMillis = agvx.a(a, "location_staleness_threshold_for_speed_millis", 600000);
        maxTimeVehicleExitWithConnectedBluetoothMillis = agvx.a(a, "max_time_vehicle_exit_with_connected_bluetooth_millis", 900000);
        maxTimeWithoutInCarDetectionMillis = agvx.a(a, "max_time_without_in_car_detection_millis", 300000);
        maxTimeWithoutInVehicleDetectionMillis = agvx.a(a, "max_time_without_in_vehicle_detection_millis", 900000);
        minArThrottlingIntervalInMillis = agvx.a(a, "min_ar_throttling_interval_in_millis", 60000);
        minBikeContinuousDetectionCount = agvx.a(a, "min_bike_continuous_detection_count", 2);
        minContinuousTimeIntervalWithConnectedWifi = agvx.a(a, "min_continuous_time_interval_with_connected_wifi", 900000);
        minFootContinuousDetectionCount = agvx.a(a, "min_foot_continuous_detection_count", 2);
        minInRailVehicleContinuousDetectionCount = agvx.a(a, "min_in_rail_vehicle_continuous_detection_count", 2);
        minInVehicleContinuousDetectionCount = agvx.a(a, "min_in_vehicle_continuous_detection_count", 2);
        minInVehicleSpeed = agvx.a(a, "min_in_vehicle_speed", 10.0d);
        minOnfootConfidenceForChreResultsBikeRelabeling = agvx.a(a, "min_onfoot_confidence_for_chre_results_bike_relabeling", 70);
        minOnfootCountForChreResultsBikeRelabeling = agvx.a(a, "min_onfoot_count_for_chre_results_bike_relabeling", 2);
        minPersonalInVehicleConfidence = agvx.a(a, "min_personal_in_vehicle_confidence", 75);
        minStillContinuousDetectionCount = agvx.a(a, "min_still_continuous_detection_count", 5);
        minStillForTransitionFromFoot = agvx.a(a, "min_still_for_transition_from_foot", 2);
        minStillHighConfidenceContinuousDetectionCount = agvx.a(a, "min_still_high_confidence_continuous_detection_count", 1);
        minVehicleConfidenceForChreResultsBikeRelabeling = agvx.a(a, "min_vehicle_confidence_for_chre_results_bike_relabeling", 75);
        minVehicleCountForChreResultsBikeRelabeling = agvx.a(a, "min_vehicle_count_for_chre_results_bike_relabeling", 2);
        softwareActivityRecognitionTransitionEnabled = agvx.a(a, "software_activity_recognition_transition_enabled", false);
        softwareActivityRecognitionTransitionEnabledV2 = agvx.a(a, "software_activity_recognition_transition_enabled_v2", true);
        stillHighConfidenceThreshold = agvx.a(a, "still_high_confidence_threshold", 95);
    }

    public boolean arDeepStillTransitioningEnabled() {
        return ((Boolean) arDeepStillTransitioningEnabled.c()).booleanValue();
    }

    public boolean arReportTransitionOnClientAdded() {
        return ((Boolean) arReportTransitionOnClientAdded.c()).booleanValue();
    }

    public boolean arTransitionApplyPersonalConfidenceFilter() {
        return ((Boolean) arTransitionApplyPersonalConfidenceFilter.c()).booleanValue();
    }

    public boolean arTransitionBikingWifiFilteringEnabled() {
        return ((Boolean) arTransitionBikingWifiFilteringEnabled.c()).booleanValue();
    }

    public boolean arTransitionEventLogging() {
        return ((Boolean) arTransitionEventLogging.c()).booleanValue();
    }

    public boolean arTransitionFastVehicleexitOnfootEnabled() {
        return ((Boolean) arTransitionFastVehicleexitOnfootEnabled.c()).booleanValue();
    }

    public boolean arTransitionFilteringEnabled() {
        return ((Boolean) arTransitionFilteringEnabled.c()).booleanValue();
    }

    public boolean arTransitionHardwareSoftwareSwitchEnabled() {
        return ((Boolean) arTransitionHardwareSoftwareSwitchEnabled.c()).booleanValue();
    }

    public boolean arTransitionVehicleBluetoothFilteringEnabled() {
        return ((Boolean) arTransitionVehicleBluetoothFilteringEnabled.c()).booleanValue();
    }

    public boolean arTransitionVehicleBluetoothTimeoutOptimizations() {
        return ((Boolean) arTransitionVehicleBluetoothTimeoutOptimizations.c()).booleanValue();
    }

    public boolean arTransitionWifiFilteringEnabled() {
        return ((Boolean) arTransitionWifiFilteringEnabled.c()).booleanValue();
    }

    public long bikeHighConfidenceThreshold() {
        return ((Long) bikeHighConfidenceThreshold.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableActivityTransitionDetection() {
        return ((Boolean) enableActivityTransitionDetection.c()).booleanValue();
    }

    public boolean enableAdaptiveWifiSampling() {
        return ((Boolean) enableAdaptiveWifiSampling.c()).booleanValue();
    }

    public long footHighConfidenceThreshold() {
        return ((Long) footHighConfidenceThreshold.c()).longValue();
    }

    public boolean hardwareTransitionFilteringEnabled() {
        return ((Boolean) hardwareTransitionFilteringEnabled.c()).booleanValue();
    }

    public long inRailVehicleConfidenceThreshold() {
        return ((Long) inRailVehicleConfidenceThreshold.c()).longValue();
    }

    public long inVehicleConfidenceThreshold() {
        return ((Long) inVehicleConfidenceThreshold.c()).longValue();
    }

    public long locationStalenessThresholdForSpeedMillis() {
        return ((Long) locationStalenessThresholdForSpeedMillis.c()).longValue();
    }

    public long maxTimeVehicleExitWithConnectedBluetoothMillis() {
        return ((Long) maxTimeVehicleExitWithConnectedBluetoothMillis.c()).longValue();
    }

    public long maxTimeWithoutInCarDetectionMillis() {
        return ((Long) maxTimeWithoutInCarDetectionMillis.c()).longValue();
    }

    public long maxTimeWithoutInVehicleDetectionMillis() {
        return ((Long) maxTimeWithoutInVehicleDetectionMillis.c()).longValue();
    }

    public long minArThrottlingIntervalInMillis() {
        return ((Long) minArThrottlingIntervalInMillis.c()).longValue();
    }

    public long minBikeContinuousDetectionCount() {
        return ((Long) minBikeContinuousDetectionCount.c()).longValue();
    }

    public long minContinuousTimeIntervalWithConnectedWifi() {
        return ((Long) minContinuousTimeIntervalWithConnectedWifi.c()).longValue();
    }

    public long minFootContinuousDetectionCount() {
        return ((Long) minFootContinuousDetectionCount.c()).longValue();
    }

    public long minInRailVehicleContinuousDetectionCount() {
        return ((Long) minInRailVehicleContinuousDetectionCount.c()).longValue();
    }

    public long minInVehicleContinuousDetectionCount() {
        return ((Long) minInVehicleContinuousDetectionCount.c()).longValue();
    }

    public double minInVehicleSpeed() {
        return ((Double) minInVehicleSpeed.c()).doubleValue();
    }

    public long minOnfootConfidenceForChreResultsBikeRelabeling() {
        return ((Long) minOnfootConfidenceForChreResultsBikeRelabeling.c()).longValue();
    }

    public long minOnfootCountForChreResultsBikeRelabeling() {
        return ((Long) minOnfootCountForChreResultsBikeRelabeling.c()).longValue();
    }

    public long minPersonalInVehicleConfidence() {
        return ((Long) minPersonalInVehicleConfidence.c()).longValue();
    }

    public long minStillContinuousDetectionCount() {
        return ((Long) minStillContinuousDetectionCount.c()).longValue();
    }

    public long minStillForTransitionFromFoot() {
        return ((Long) minStillForTransitionFromFoot.c()).longValue();
    }

    public long minStillHighConfidenceContinuousDetectionCount() {
        return ((Long) minStillHighConfidenceContinuousDetectionCount.c()).longValue();
    }

    public long minVehicleConfidenceForChreResultsBikeRelabeling() {
        return ((Long) minVehicleConfidenceForChreResultsBikeRelabeling.c()).longValue();
    }

    public long minVehicleCountForChreResultsBikeRelabeling() {
        return ((Long) minVehicleCountForChreResultsBikeRelabeling.c()).longValue();
    }

    public boolean softwareActivityRecognitionTransitionEnabled() {
        return ((Boolean) softwareActivityRecognitionTransitionEnabled.c()).booleanValue();
    }

    public boolean softwareActivityRecognitionTransitionEnabledV2() {
        return ((Boolean) softwareActivityRecognitionTransitionEnabledV2.c()).booleanValue();
    }

    public long stillHighConfidenceThreshold() {
        return ((Long) stillHighConfidenceThreshold.c()).longValue();
    }
}
