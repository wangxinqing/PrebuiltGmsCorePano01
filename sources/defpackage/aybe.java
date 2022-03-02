package defpackage;

/* renamed from: aybe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aybe implements aybd {
    public static final agvx elevationDeltaPhoneFromFloorM;
    public static final agvx elevationFromWifiEnabled;
    public static final agvx elevationFromWifiMinRssiDbm;
    public static final agvx elevationFromWifiOutlierThresholdM;
    public static final agvx elevationMaxVerticalAccuracyMeters;
    public static final agvx enableFrewleFloorEstimator;
    public static final agvx enableGlocRequestReducedDownloadThreshold;
    public static final agvx enableRnnFrewleEngine;
    public static final agvx frewleBuildingIdsCacheMaxSize;
    public static final agvx frewleDefaultMaxNumApEntriesForDownload;
    public static final agvx frewleFloorModelsCacheMaxSize;
    public static final agvx frewleMacEntryLruCacheMaxSize;
    public static final agvx frewleSeenMacAddressLruCacheMaxSize;
    public static final agvx overwriteRttZAxisInfoWithFrewle;
    public static final agvx proksConfig;
    public static final agvx throwIllegalArgExceptionOnUnsupportedEncoding;
    public static final agvx useFrewleTileCacheManagerV2;
    public static final agvx usePartialGlsFix142179343;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        elevationDeltaPhoneFromFloorM = agvx.a(a, "elevation_delta_phone_from_floor_m", 1.1d);
        elevationFromWifiEnabled = agvx.a(a, "elevation_from_wifi_enabled", true);
        elevationFromWifiMinRssiDbm = agvx.a(a, "elevation_from_wifi_min_rssi_dbm", -86);
        elevationFromWifiOutlierThresholdM = agvx.a(a, "elevation_from_wifi_outlier_threshold_m", 55.0d);
        elevationMaxVerticalAccuracyMeters = agvx.a(a, "elevation_max_vertical_accuracy_meters", 200.0d);
        enableFrewleFloorEstimator = agvx.a(a, "enable_frewle_floor_estimator", false);
        enableGlocRequestReducedDownloadThreshold = agvx.a(a, "enable_gloc_request_reduced_download_threshold", true);
        enableRnnFrewleEngine = agvx.a(a, "enable_rnn_frewle_engine", false);
        frewleBuildingIdsCacheMaxSize = agvx.a(a, "frewle_building_ids_cache_max_size", 200);
        frewleDefaultMaxNumApEntriesForDownload = agvx.a(a, "frewle_default_max_num_ap_entries_for_download", 6);
        frewleFloorModelsCacheMaxSize = agvx.a(a, "frewle_floor_models_cache_max_size", 1000);
        frewleMacEntryLruCacheMaxSize = agvx.a(a, "frewle_mac_entry_lru_cache_max_size", 10000);
        frewleSeenMacAddressLruCacheMaxSize = agvx.a(a, "frewle_seen_mac_address_lru_cache_max_size", 10000);
        overwriteRttZAxisInfoWithFrewle = agvx.a(a, "overwrite_rtt_z_axis_info_with_frewle", true);
        proksConfig = agvx.a(a, "proks_config", 0);
        throwIllegalArgExceptionOnUnsupportedEncoding = agvx.a(a, "throw_illegal_arg_exception_on_unsupported_encoding", true);
        useFrewleTileCacheManagerV2 = agvx.a(a, "use_frewle_tile_cache_manager_v2", false);
        usePartialGlsFix142179343 = agvx.a(a, "Frewle__use_partial_gls_fix_142179343", false);
    }

    public boolean compiled() {
        return true;
    }

    public double elevationDeltaPhoneFromFloorM() {
        return ((Double) elevationDeltaPhoneFromFloorM.c()).doubleValue();
    }

    public boolean elevationFromWifiEnabled() {
        return ((Boolean) elevationFromWifiEnabled.c()).booleanValue();
    }

    public long elevationFromWifiMinRssiDbm() {
        return ((Long) elevationFromWifiMinRssiDbm.c()).longValue();
    }

    public double elevationFromWifiOutlierThresholdM() {
        return ((Double) elevationFromWifiOutlierThresholdM.c()).doubleValue();
    }

    public double elevationMaxVerticalAccuracyMeters() {
        return ((Double) elevationMaxVerticalAccuracyMeters.c()).doubleValue();
    }

    public boolean enableFrewleFloorEstimator() {
        return ((Boolean) enableFrewleFloorEstimator.c()).booleanValue();
    }

    public boolean enableGlocRequestReducedDownloadThreshold() {
        return ((Boolean) enableGlocRequestReducedDownloadThreshold.c()).booleanValue();
    }

    public boolean enableRnnFrewleEngine() {
        return ((Boolean) enableRnnFrewleEngine.c()).booleanValue();
    }

    public long frewleBuildingIdsCacheMaxSize() {
        return ((Long) frewleBuildingIdsCacheMaxSize.c()).longValue();
    }

    public long frewleDefaultMaxNumApEntriesForDownload() {
        return ((Long) frewleDefaultMaxNumApEntriesForDownload.c()).longValue();
    }

    public long frewleFloorModelsCacheMaxSize() {
        return ((Long) frewleFloorModelsCacheMaxSize.c()).longValue();
    }

    public long frewleMacEntryLruCacheMaxSize() {
        return ((Long) frewleMacEntryLruCacheMaxSize.c()).longValue();
    }

    public long frewleSeenMacAddressLruCacheMaxSize() {
        return ((Long) frewleSeenMacAddressLruCacheMaxSize.c()).longValue();
    }

    public boolean overwriteRttZAxisInfoWithFrewle() {
        return ((Boolean) overwriteRttZAxisInfoWithFrewle.c()).booleanValue();
    }

    public long proksConfig() {
        return ((Long) proksConfig.c()).longValue();
    }

    public boolean throwIllegalArgExceptionOnUnsupportedEncoding() {
        return ((Boolean) throwIllegalArgExceptionOnUnsupportedEncoding.c()).booleanValue();
    }

    public boolean useFrewleTileCacheManagerV2() {
        return ((Boolean) useFrewleTileCacheManagerV2.c()).booleanValue();
    }

    public boolean usePartialGlsFix142179343() {
        return ((Boolean) usePartialGlsFix142179343.c()).booleanValue();
    }
}
