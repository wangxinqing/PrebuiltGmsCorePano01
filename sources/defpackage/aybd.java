package defpackage;

/* renamed from: aybd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface aybd {
    double elevationDeltaPhoneFromFloorM();

    boolean elevationFromWifiEnabled();

    long elevationFromWifiMinRssiDbm();

    double elevationFromWifiOutlierThresholdM();

    double elevationMaxVerticalAccuracyMeters();

    boolean enableFrewleFloorEstimator();

    boolean enableGlocRequestReducedDownloadThreshold();

    boolean enableRnnFrewleEngine();

    long frewleBuildingIdsCacheMaxSize();

    long frewleDefaultMaxNumApEntriesForDownload();

    long frewleFloorModelsCacheMaxSize();

    long frewleMacEntryLruCacheMaxSize();

    long frewleSeenMacAddressLruCacheMaxSize();

    boolean overwriteRttZAxisInfoWithFrewle();

    long proksConfig();

    boolean throwIllegalArgExceptionOnUnsupportedEncoding();

    boolean useFrewleTileCacheManagerV2();

    boolean usePartialGlsFix142179343();
}
