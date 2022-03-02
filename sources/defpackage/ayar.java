package defpackage;

/* renamed from: ayar  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayar implements ayaq {
    public static final agvx aaeFlpGpsForward;
    public static final agvx analyticsEnabled;
    public static final agvx analyticsTrackingId;
    public static final agvx bugfixLsdAlwaysOk;
    public static final agvx bugfixLsdReadProvider;
    public static final agvx bugfixReleaseClientResource;
    public static final agvx catchSecurityException;
    public static final agvx eventLogSize;
    public static final agvx fixGlsConsentAtv;
    public static final agvx flpAllowedDeliveryAgeMs;
    public static final agvx flpEnableDebugLogging;
    public static final agvx flpEnablePdrOnlyWhenScreenIsOn;
    public static final agvx flpEnableSensorfusionLogs;
    public static final agvx flpFusionGpsRequestTimePeriodSec;
    public static final agvx flpFusionNearIndoorGpsSnrThreshold;
    public static final agvx flpFusionWifiRequestTimePeriodSec;
    public static final agvx flpHighPowerGpsPulseMs;
    public static final agvx flpMinArScreenOfOrNoHighAccuracyIntervalMs;
    public static final agvx flpMinArScreenOnHighAccuracyIntervalMs;
    public static final agvx flpMinIntervalToPulseGpsMs;
    public static final agvx flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled;
    public static final agvx flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled;
    public static final agvx flpScreenOnHighAccuracyModeEnabled;
    public static final agvx flpUsePdr;
    public static final agvx g2kRolloverCorrection;
    public static final agvx locationModeBufferDelayMs;
    public static final agvx logSensorFusionOutputPosition;
    public static final agvx minSdkForRemovalCallback;
    public static final agvx removeGacUsage;
    public static final agvx removeIndoorLevelAndFloor;
    public static final agvx sendCallbackOnRemoval;
    public static final agvx sensorFusionOutputPositionLogMaxBufferSize;
    public static final agvx sensorFusionOutputPositionLogTimeWindowSec;
    public static final agvx setWearableRequestModuleId;
    public static final agvx supportMaxLocationAge;
    public static final agvx uploadLocationPermission;
    public static final agvx useAaeLocationCaching;
    public static final agvx useFullLocationForCoarse;
    public static final agvx useGnssStatus;
    public static final agvx useNewSettingsListeners;
    public static final agvx useReflectedSystemApis;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        aaeFlpGpsForward = agvx.a(a, "Flp__aae_flp_gps_forward", true);
        analyticsEnabled = agvx.a(a, "analytics_enabled", false);
        analyticsTrackingId = agvx.a(a, "analytics_tracking_id", "UA-44492294-1");
        bugfixLsdAlwaysOk = agvx.a(a, "Flp__bugfix_lsd_always_ok", true);
        bugfixLsdReadProvider = agvx.a(a, "Flp__bugfix_lsd_read_provider", true);
        bugfixReleaseClientResource = agvx.a(a, "Flp__bugfix_release_client_resource", true);
        catchSecurityException = agvx.a(a, "Flp__catch_security_exception", true);
        eventLogSize = agvx.a(a, "flp_event_log_size", 500);
        fixGlsConsentAtv = agvx.a(a, "Flp__fix_gls_consent_atv", true);
        flpAllowedDeliveryAgeMs = agvx.a(a, "flp_allowed_delivery_age_ms", 15000);
        flpEnableDebugLogging = agvx.a(a, "flp_enable_debug_logging", false);
        flpEnablePdrOnlyWhenScreenIsOn = agvx.a(a, "flp_enable_pdr_only_when_screen_on", false);
        flpEnableSensorfusionLogs = agvx.a(a, "flp_enable_sensorfusion_logs", true);
        flpFusionGpsRequestTimePeriodSec = agvx.a(a, "flp_fusion_gps_request_time_period_sec", 1);
        flpFusionNearIndoorGpsSnrThreshold = agvx.a(a, "flp_fusion_near_indoor_gps_snr_threshold", 25);
        flpFusionWifiRequestTimePeriodSec = agvx.a(a, "flp_fusion_wifi_request_time_period_sec", 5);
        flpHighPowerGpsPulseMs = agvx.a(a, "flp_high_power_gps_pulse_ms", 30000);
        flpMinArScreenOfOrNoHighAccuracyIntervalMs = agvx.a(a, "flp_min_ar_screen_off_or_no_high_accuracy_interval_ms", 30000);
        flpMinArScreenOnHighAccuracyIntervalMs = agvx.a(a, "flp_min_ar_screen_on_high_accuracy_interval_ms", 0);
        flpMinIntervalToPulseGpsMs = agvx.a(a, "flp_min_interval_to_pulse_gps_ms", 45000);
        flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled = agvx.a(a, "flp_particle_fusion_disable_passive_provider_controller_when_location_disabled", true);
        flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled = agvx.a(a, "flp_particle_fusion_disable_step_and_ar_provider_controller_when_location_disabled", true);
        flpScreenOnHighAccuracyModeEnabled = agvx.a(a, "flp_screen_on_high_accuracy_mode_enabled", true);
        flpUsePdr = agvx.a(a, "flp_use_pdr", true);
        g2kRolloverCorrection = agvx.a(a, "Flp__g2k_rollover_correction", false);
        locationModeBufferDelayMs = agvx.a(a, "Flp__location_mode_buffer_delay_ms", 50);
        logSensorFusionOutputPosition = agvx.a(a, "Flp__log_sensor_fusion_output_position", false);
        minSdkForRemovalCallback = agvx.a(a, "Flp__min_sdk_for_removal_callback", 200500000);
        removeGacUsage = agvx.a(a, "Flp__remove_gac_usage", true);
        removeIndoorLevelAndFloor = agvx.a(a, "Flp__remove_indoor_level_and_floor", false);
        sendCallbackOnRemoval = agvx.a(a, "Flp__send_callback_on_removal", false);
        sensorFusionOutputPositionLogMaxBufferSize = agvx.a(a, "Flp__sensor_fusion_output_position_log_max_buffer_size", 900);
        sensorFusionOutputPositionLogTimeWindowSec = agvx.a(a, "Flp__sensor_fusion_output_position_log_time_window_sec", 600);
        setWearableRequestModuleId = agvx.a(a, "Flp__set_wearable_request_module_id", true);
        supportMaxLocationAge = agvx.a(a, "Flp__support_max_location_age", false);
        uploadLocationPermission = agvx.a(a, "Flp__upload_location_permission", false);
        useAaeLocationCaching = agvx.a(a, "Flp__use_aae_location_caching", false);
        useFullLocationForCoarse = agvx.a(a, "Flp__use_full_location_for_coarse", false);
        useGnssStatus = agvx.a(a, "Flp__use_gnss_status", false);
        useNewSettingsListeners = agvx.a(a, "Flp__use_new_settings_listeners", true);
        useReflectedSystemApis = agvx.a(a, "Flp__use_reflected_system_apis", true);
    }

    public boolean aaeFlpGpsForward() {
        return ((Boolean) aaeFlpGpsForward.c()).booleanValue();
    }

    public boolean analyticsEnabled() {
        return ((Boolean) analyticsEnabled.c()).booleanValue();
    }

    public String analyticsTrackingId() {
        return (String) analyticsTrackingId.c();
    }

    public boolean bugfixLsdAlwaysOk() {
        return ((Boolean) bugfixLsdAlwaysOk.c()).booleanValue();
    }

    public boolean bugfixLsdReadProvider() {
        return ((Boolean) bugfixLsdReadProvider.c()).booleanValue();
    }

    public boolean bugfixReleaseClientResource() {
        return ((Boolean) bugfixReleaseClientResource.c()).booleanValue();
    }

    public boolean catchSecurityException() {
        return ((Boolean) catchSecurityException.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long eventLogSize() {
        return ((Long) eventLogSize.c()).longValue();
    }

    public boolean fixGlsConsentAtv() {
        return ((Boolean) fixGlsConsentAtv.c()).booleanValue();
    }

    public long flpAllowedDeliveryAgeMs() {
        return ((Long) flpAllowedDeliveryAgeMs.c()).longValue();
    }

    public boolean flpEnableDebugLogging() {
        return ((Boolean) flpEnableDebugLogging.c()).booleanValue();
    }

    public boolean flpEnablePdrOnlyWhenScreenIsOn() {
        return ((Boolean) flpEnablePdrOnlyWhenScreenIsOn.c()).booleanValue();
    }

    public boolean flpEnableSensorfusionLogs() {
        return ((Boolean) flpEnableSensorfusionLogs.c()).booleanValue();
    }

    public long flpFusionGpsRequestTimePeriodSec() {
        return ((Long) flpFusionGpsRequestTimePeriodSec.c()).longValue();
    }

    public long flpFusionNearIndoorGpsSnrThreshold() {
        return ((Long) flpFusionNearIndoorGpsSnrThreshold.c()).longValue();
    }

    public long flpFusionWifiRequestTimePeriodSec() {
        return ((Long) flpFusionWifiRequestTimePeriodSec.c()).longValue();
    }

    public long flpHighPowerGpsPulseMs() {
        return ((Long) flpHighPowerGpsPulseMs.c()).longValue();
    }

    public long flpMinArScreenOfOrNoHighAccuracyIntervalMs() {
        return ((Long) flpMinArScreenOfOrNoHighAccuracyIntervalMs.c()).longValue();
    }

    public long flpMinArScreenOnHighAccuracyIntervalMs() {
        return ((Long) flpMinArScreenOnHighAccuracyIntervalMs.c()).longValue();
    }

    public long flpMinIntervalToPulseGpsMs() {
        return ((Long) flpMinIntervalToPulseGpsMs.c()).longValue();
    }

    public boolean flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled() {
        return ((Boolean) flpParticleFusionDisablePassiveProviderControllerWhenLocationDisabled.c()).booleanValue();
    }

    public boolean flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled() {
        return ((Boolean) flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled.c()).booleanValue();
    }

    public boolean flpScreenOnHighAccuracyModeEnabled() {
        return ((Boolean) flpScreenOnHighAccuracyModeEnabled.c()).booleanValue();
    }

    public boolean flpUsePdr() {
        return ((Boolean) flpUsePdr.c()).booleanValue();
    }

    public boolean g2kRolloverCorrection() {
        return ((Boolean) g2kRolloverCorrection.c()).booleanValue();
    }

    public long locationModeBufferDelayMs() {
        return ((Long) locationModeBufferDelayMs.c()).longValue();
    }

    public boolean logSensorFusionOutputPosition() {
        return ((Boolean) logSensorFusionOutputPosition.c()).booleanValue();
    }

    public long minSdkForRemovalCallback() {
        return ((Long) minSdkForRemovalCallback.c()).longValue();
    }

    public boolean removeGacUsage() {
        return ((Boolean) removeGacUsage.c()).booleanValue();
    }

    public boolean removeIndoorLevelAndFloor() {
        return ((Boolean) removeIndoorLevelAndFloor.c()).booleanValue();
    }

    public boolean sendCallbackOnRemoval() {
        return ((Boolean) sendCallbackOnRemoval.c()).booleanValue();
    }

    public long sensorFusionOutputPositionLogMaxBufferSize() {
        return ((Long) sensorFusionOutputPositionLogMaxBufferSize.c()).longValue();
    }

    public long sensorFusionOutputPositionLogTimeWindowSec() {
        return ((Long) sensorFusionOutputPositionLogTimeWindowSec.c()).longValue();
    }

    public boolean setWearableRequestModuleId() {
        return ((Boolean) setWearableRequestModuleId.c()).booleanValue();
    }

    public boolean supportMaxLocationAge() {
        return ((Boolean) supportMaxLocationAge.c()).booleanValue();
    }

    public boolean uploadLocationPermission() {
        return ((Boolean) uploadLocationPermission.c()).booleanValue();
    }

    public boolean useAaeLocationCaching() {
        return ((Boolean) useAaeLocationCaching.c()).booleanValue();
    }

    public boolean useFullLocationForCoarse() {
        return ((Boolean) useFullLocationForCoarse.c()).booleanValue();
    }

    public boolean useGnssStatus() {
        return ((Boolean) useGnssStatus.c()).booleanValue();
    }

    public boolean useNewSettingsListeners() {
        return ((Boolean) useNewSettingsListeners.c()).booleanValue();
    }

    public boolean useReflectedSystemApis() {
        return ((Boolean) useReflectedSystemApis.c()).booleanValue();
    }
}
