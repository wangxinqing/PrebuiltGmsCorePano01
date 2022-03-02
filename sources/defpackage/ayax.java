package defpackage;

/* renamed from: ayax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayax {
    long flpSmdIntervalThresholdMs();

    double flpSmdSwitchIntervalFactor();

    long flpThrottleSmallestPriority();

    boolean flpThrottleWhenStill();

    long flpThrottleWhenStillIntervalMs();

    boolean ignoreSmdForThrottling();

    long minStillTimeMs();

    long minSyntheticSmdDeliveryMs();

    double minVehicleSpeedMps();

    long numStillLocationsThreshold();

    double sigmaScaleDistanceThreshold();

    long vehicleActivityTimeoutMs();
}
