package defpackage;

/* renamed from: axxo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxo implements axxn {
    public static final agvx autoStopCollectEnabled;
    public static final agvx autoStopCollectSecs;
    public static final agvx clearcutLoggingExtensionEnabled;
    public static final agvx clearcutSamplingRate;
    public static final agvx conveyGatingOffHysteresisEnabled;
    public static final agvx deliverFopDataNotStartedOnFopReset;
    public static final agvx flpBluePixelBatchMaxTimeDeltaForLocationElementNanos;
    public static final agvx flpBluePixelBatchMinBearingElements;
    public static final agvx flpBluePixelBatchMinDurationNs;
    public static final agvx flpBluePixelBatchMinLocationElements;
    public static final agvx flpBluePixelBatchMinStepElements;
    public static final agvx flpBluePixelBatchQueueMaxSize;
    public static final agvx flpBluePixelClearcutLoggingEnabled;
    public static final agvx flpBluePixelEarliestSupportedVersion;
    public static final agvx flpBluePixelIgnorePreProdVersions;
    public static final agvx flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs;
    public static final agvx flpBluePixelNanoAppActivityGated;
    public static final agvx flpBluePixelNanoAppGnssBatchIntervalMs;
    public static final agvx flpBluePixelNanoAppGnssStreamIntervalMs;
    public static final agvx flpBluePixelNanoAppMaxBatchingNs;
    public static final agvx flpBluePixelNanoAppWifiBatchIntervalMs;
    public static final agvx flpBluePixelNanoAppWifiStreamIntervalMs;
    public static final agvx flpBluePixelOverruleIntervalNanos;
    public static final agvx flpBluePixelProcessorTimeoutWindowNlpCallbackNs;
    public static final agvx flpEnableBluePixel;
    public static final agvx fopEnableBluePixel;
    public static final agvx fopIaGcoreConfigIndex;
    public static final agvx fopIaUseGcoreConfig;
    public static final agvx gatingOffHysteresisNanos;
    public static final agvx maximumStartedMinutes;
    public static final agvx nlpEnableComputeWifiLocations;
    public static final agvx requestQueueMaxSize;
    public static final agvx requestQueueTimeoutMs;
    public static final agvx restrictClearcutToCheckboxConsent;
    public static final agvx useGeoMagneticField;
    public static final agvx windowStartedHrs;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        autoStopCollectEnabled = agvx.a(a, "BluePixel__auto_stop_collect_enabled", true);
        autoStopCollectSecs = agvx.a(a, "BluePixel__auto_stop_collect_secs", 43200);
        clearcutLoggingExtensionEnabled = agvx.a(a, "BluePixel__clearcut_logging_extension_enabled", false);
        clearcutSamplingRate = agvx.a(a, "BluePixel__clearcut_sampling_rate", 1.0d);
        conveyGatingOffHysteresisEnabled = agvx.a(a, "BluePixel__convey_gating_off_hysteresis_enabled", false);
        deliverFopDataNotStartedOnFopReset = agvx.a(a, "BluePixel__deliver_fop_data_not_started_on_fop_reset", false);
        flpBluePixelBatchMaxTimeDeltaForLocationElementNanos = agvx.a(a, "BluePixel__flp_blue_pixel_batch_max_time_delta_for_location_element_nanos", 12000000000L);
        flpBluePixelBatchMinBearingElements = agvx.a(a, "BluePixel__flp_blue_pixel_batch_min_bearing_elements", 2);
        flpBluePixelBatchMinDurationNs = agvx.a(a, "BluePixel__flp_blue_pixel_batch_min_duration_ns", 6000000000L);
        flpBluePixelBatchMinLocationElements = agvx.a(a, "BluePixel__flp_blue_pixel_batch_min_location_elements", 1);
        flpBluePixelBatchMinStepElements = agvx.a(a, "BluePixel__flp_blue_pixel_batch_min_step_elements", 1);
        flpBluePixelBatchQueueMaxSize = agvx.a(a, "BluePixel__flp_blue_pixel_batch_queue_max_size", 500);
        flpBluePixelClearcutLoggingEnabled = agvx.a(a, "BluePixel__flp_blue_pixel_clearcut_logging_enabled", true);
        flpBluePixelEarliestSupportedVersion = agvx.a(a, "BluePixel__flp_blue_pixel_earliest_supported_version", 14);
        flpBluePixelIgnorePreProdVersions = agvx.a(a, "BluePixel__flp_blue_pixel_ignore_pre_prod_versions", true);
        flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs = agvx.a(a, "BluePixel__flp_blue_pixel_instant_location_delivery_max_time_delta_ns", 1000000000);
        flpBluePixelNanoAppActivityGated = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_activity_gated", true);
        flpBluePixelNanoAppGnssBatchIntervalMs = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_gnss_batch_interval_ms", 8000);
        flpBluePixelNanoAppGnssStreamIntervalMs = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_gnss_stream_interval_ms", 1000);
        flpBluePixelNanoAppMaxBatchingNs = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_max_batching_ns", 30000000000L);
        flpBluePixelNanoAppWifiBatchIntervalMs = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_wifi_batch_interval_ms", 7500);
        flpBluePixelNanoAppWifiStreamIntervalMs = agvx.a(a, "BluePixel__flp_blue_pixel_nano_app_wifi_stream_interval_ms", 5000);
        flpBluePixelOverruleIntervalNanos = agvx.a(a, "BluePixel__flp_blue_pixel_overrule_interval_nanos", 10000000000L);
        flpBluePixelProcessorTimeoutWindowNlpCallbackNs = agvx.a(a, "BluePixel__flp_blue_pixel_processor_timeout_window_nlp_callback_ns", 200000000);
        flpEnableBluePixel = agvx.a(a, "BluePixel__flp_enable_blue_pixel", false);
        fopEnableBluePixel = agvx.a(a, "BluePixel__fop_enable_blue_pixel", false);
        fopIaGcoreConfigIndex = agvx.a(a, "BluePixel__fop_ia_gcore_config_index", 6);
        fopIaUseGcoreConfig = agvx.a(a, "BluePixel__fop_ia_use_gcore_config", false);
        gatingOffHysteresisNanos = agvx.a(a, "BluePixel__gating_off_hysteresis_nanos", 20000000000L);
        maximumStartedMinutes = agvx.a(a, "BluePixel__maximum_started_minutes", 150);
        nlpEnableComputeWifiLocations = agvx.a(a, "BluePixel__nlp_enable_compute_wifi_locations", false);
        requestQueueMaxSize = agvx.a(a, "BluePixel__request_queue_max_size", 100);
        requestQueueTimeoutMs = agvx.a(a, "BluePixel__request_queue_timeout_ms", 10000);
        restrictClearcutToCheckboxConsent = agvx.a(a, "BluePixel__restrict_clearcut_to_checkbox_consent", false);
        useGeoMagneticField = agvx.a(a, "BluePixel__use_geo_magnetic_field", false);
        windowStartedHrs = agvx.a(a, "BluePixel__window_started_hrs", 24);
    }

    public boolean autoStopCollectEnabled() {
        return ((Boolean) autoStopCollectEnabled.c()).booleanValue();
    }

    public long autoStopCollectSecs() {
        return ((Long) autoStopCollectSecs.c()).longValue();
    }

    public boolean clearcutLoggingExtensionEnabled() {
        return ((Boolean) clearcutLoggingExtensionEnabled.c()).booleanValue();
    }

    public double clearcutSamplingRate() {
        return ((Double) clearcutSamplingRate.c()).doubleValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean conveyGatingOffHysteresisEnabled() {
        return ((Boolean) conveyGatingOffHysteresisEnabled.c()).booleanValue();
    }

    public boolean deliverFopDataNotStartedOnFopReset() {
        return ((Boolean) deliverFopDataNotStartedOnFopReset.c()).booleanValue();
    }

    public long flpBluePixelBatchMaxTimeDeltaForLocationElementNanos() {
        return ((Long) flpBluePixelBatchMaxTimeDeltaForLocationElementNanos.c()).longValue();
    }

    public long flpBluePixelBatchMinBearingElements() {
        return ((Long) flpBluePixelBatchMinBearingElements.c()).longValue();
    }

    public long flpBluePixelBatchMinDurationNs() {
        return ((Long) flpBluePixelBatchMinDurationNs.c()).longValue();
    }

    public long flpBluePixelBatchMinLocationElements() {
        return ((Long) flpBluePixelBatchMinLocationElements.c()).longValue();
    }

    public long flpBluePixelBatchMinStepElements() {
        return ((Long) flpBluePixelBatchMinStepElements.c()).longValue();
    }

    public long flpBluePixelBatchQueueMaxSize() {
        return ((Long) flpBluePixelBatchQueueMaxSize.c()).longValue();
    }

    public boolean flpBluePixelClearcutLoggingEnabled() {
        return ((Boolean) flpBluePixelClearcutLoggingEnabled.c()).booleanValue();
    }

    public long flpBluePixelEarliestSupportedVersion() {
        return ((Long) flpBluePixelEarliestSupportedVersion.c()).longValue();
    }

    public boolean flpBluePixelIgnorePreProdVersions() {
        return ((Boolean) flpBluePixelIgnorePreProdVersions.c()).booleanValue();
    }

    public long flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs() {
        return ((Long) flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs.c()).longValue();
    }

    public boolean flpBluePixelNanoAppActivityGated() {
        return ((Boolean) flpBluePixelNanoAppActivityGated.c()).booleanValue();
    }

    public long flpBluePixelNanoAppGnssBatchIntervalMs() {
        return ((Long) flpBluePixelNanoAppGnssBatchIntervalMs.c()).longValue();
    }

    public long flpBluePixelNanoAppGnssStreamIntervalMs() {
        return ((Long) flpBluePixelNanoAppGnssStreamIntervalMs.c()).longValue();
    }

    public long flpBluePixelNanoAppMaxBatchingNs() {
        return ((Long) flpBluePixelNanoAppMaxBatchingNs.c()).longValue();
    }

    public long flpBluePixelNanoAppWifiBatchIntervalMs() {
        return ((Long) flpBluePixelNanoAppWifiBatchIntervalMs.c()).longValue();
    }

    public long flpBluePixelNanoAppWifiStreamIntervalMs() {
        return ((Long) flpBluePixelNanoAppWifiStreamIntervalMs.c()).longValue();
    }

    public long flpBluePixelOverruleIntervalNanos() {
        return ((Long) flpBluePixelOverruleIntervalNanos.c()).longValue();
    }

    public long flpBluePixelProcessorTimeoutWindowNlpCallbackNs() {
        return ((Long) flpBluePixelProcessorTimeoutWindowNlpCallbackNs.c()).longValue();
    }

    public boolean flpEnableBluePixel() {
        return ((Boolean) flpEnableBluePixel.c()).booleanValue();
    }

    public boolean fopEnableBluePixel() {
        return ((Boolean) fopEnableBluePixel.c()).booleanValue();
    }

    public long fopIaGcoreConfigIndex() {
        return ((Long) fopIaGcoreConfigIndex.c()).longValue();
    }

    public boolean fopIaUseGcoreConfig() {
        return ((Boolean) fopIaUseGcoreConfig.c()).booleanValue();
    }

    public long gatingOffHysteresisNanos() {
        return ((Long) gatingOffHysteresisNanos.c()).longValue();
    }

    public long maximumStartedMinutes() {
        return ((Long) maximumStartedMinutes.c()).longValue();
    }

    public boolean nlpEnableComputeWifiLocations() {
        return ((Boolean) nlpEnableComputeWifiLocations.c()).booleanValue();
    }

    public long requestQueueMaxSize() {
        return ((Long) requestQueueMaxSize.c()).longValue();
    }

    public long requestQueueTimeoutMs() {
        return ((Long) requestQueueTimeoutMs.c()).longValue();
    }

    public boolean restrictClearcutToCheckboxConsent() {
        return ((Boolean) restrictClearcutToCheckboxConsent.c()).booleanValue();
    }

    public boolean useGeoMagneticField() {
        return ((Boolean) useGeoMagneticField.c()).booleanValue();
    }

    public long windowStartedHrs() {
        return ((Long) windowStartedHrs.c()).longValue();
    }
}
