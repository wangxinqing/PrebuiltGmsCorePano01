package defpackage;

/* renamed from: axxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface axxn {
    boolean autoStopCollectEnabled();

    long autoStopCollectSecs();

    boolean clearcutLoggingExtensionEnabled();

    double clearcutSamplingRate();

    boolean conveyGatingOffHysteresisEnabled();

    boolean deliverFopDataNotStartedOnFopReset();

    long flpBluePixelBatchMaxTimeDeltaForLocationElementNanos();

    long flpBluePixelBatchMinBearingElements();

    long flpBluePixelBatchMinDurationNs();

    long flpBluePixelBatchMinLocationElements();

    long flpBluePixelBatchMinStepElements();

    long flpBluePixelBatchQueueMaxSize();

    boolean flpBluePixelClearcutLoggingEnabled();

    long flpBluePixelEarliestSupportedVersion();

    boolean flpBluePixelIgnorePreProdVersions();

    long flpBluePixelInstantLocationDeliveryMaxTimeDeltaNs();

    boolean flpBluePixelNanoAppActivityGated();

    long flpBluePixelNanoAppGnssBatchIntervalMs();

    long flpBluePixelNanoAppGnssStreamIntervalMs();

    long flpBluePixelNanoAppMaxBatchingNs();

    long flpBluePixelNanoAppWifiBatchIntervalMs();

    long flpBluePixelNanoAppWifiStreamIntervalMs();

    long flpBluePixelOverruleIntervalNanos();

    long flpBluePixelProcessorTimeoutWindowNlpCallbackNs();

    boolean flpEnableBluePixel();

    boolean fopEnableBluePixel();

    long fopIaGcoreConfigIndex();

    boolean fopIaUseGcoreConfig();

    long gatingOffHysteresisNanos();

    long maximumStartedMinutes();

    boolean nlpEnableComputeWifiLocations();

    long requestQueueMaxSize();

    long requestQueueTimeoutMs();

    boolean restrictClearcutToCheckboxConsent();

    boolean useGeoMagneticField();

    long windowStartedHrs();
}
