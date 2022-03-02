package defpackage;

/* renamed from: ayaq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayaq {
    boolean analyticsEnabled();

    String analyticsTrackingId();

    boolean bugfixLsdAlwaysOk();

    boolean bugfixLsdReadProvider();

    boolean bugfixReleaseClientResource();

    boolean catchSecurityException();

    long eventLogSize();

    boolean fixGlsConsentAtv();

    long flpAllowedDeliveryAgeMs();

    boolean flpEnableDebugLogging();

    boolean flpEnablePdrOnlyWhenScreenIsOn();

    boolean flpEnableSensorfusionLogs();

    long flpFusionGpsRequestTimePeriodSec();

    long flpFusionNearIndoorGpsSnrThreshold();

    long flpFusionWifiRequestTimePeriodSec();

    long flpHighPowerGpsPulseMs();

    long flpMinArScreenOfOrNoHighAccuracyIntervalMs();

    long flpMinArScreenOnHighAccuracyIntervalMs();

    boolean flpParticleFusionDisableStepAndArProviderControllerWhenLocationDisabled();

    boolean flpScreenOnHighAccuracyModeEnabled();

    boolean flpUsePdr();

    boolean g2kRolloverCorrection();

    long locationModeBufferDelayMs();

    boolean logSensorFusionOutputPosition();

    long minSdkForRemovalCallback();

    boolean removeGacUsage();

    boolean removeIndoorLevelAndFloor();

    boolean sendCallbackOnRemoval();

    long sensorFusionOutputPositionLogMaxBufferSize();

    long sensorFusionOutputPositionLogTimeWindowSec();

    boolean setWearableRequestModuleId();

    boolean supportMaxLocationAge();

    boolean uploadLocationPermission();

    boolean useFullLocationForCoarse();

    boolean useGnssStatus();

    boolean useNewSettingsListeners();

    boolean useReflectedSystemApis();
}
