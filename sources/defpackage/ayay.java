package defpackage;

/* renamed from: ayay  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayay implements ayax {
    public static final agvx flpMinDistanceMeters;
    public static final agvx flpSmdIntervalThresholdMs;
    public static final agvx flpSmdSwitchIntervalFactor;
    public static final agvx flpThrottleSmallestDisplacementMeters;
    public static final agvx flpThrottleSmallestPriority;
    public static final agvx flpThrottleWhenStill;
    public static final agvx flpThrottleWhenStillIntervalMs;
    public static final agvx ignoreSmdForThrottling;
    public static final agvx minStillTimeMs;
    public static final agvx minSyntheticSmdDeliveryMs;
    public static final agvx minVehicleSpeedMps;
    public static final agvx numStillLocationsThreshold;
    public static final agvx sigmaScaleDistanceThreshold;
    public static final agvx vehicleActivityTimeoutMs;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        flpMinDistanceMeters = agvx.a(a, "flp_min_distance_meters", 5.0d);
        flpSmdIntervalThresholdMs = agvx.a(a, "flp_smd_interval_threshold_ms", 360000);
        flpSmdSwitchIntervalFactor = agvx.a(a, "flp_smd_switch_interval_factor", 1.0d);
        flpThrottleSmallestDisplacementMeters = agvx.a(a, "flp_throttle_smallest_displacement_meters", 10.0d);
        flpThrottleSmallestPriority = agvx.a(a, "flp_throttle_smallest_priority", 102);
        flpThrottleWhenStill = agvx.a(a, "flp_throttle_when_still", true);
        flpThrottleWhenStillIntervalMs = agvx.a(a, "flp_throttle_when_still_interval_ms", 720000);
        ignoreSmdForThrottling = agvx.a(a, "ignore_smd_for_throttling", false);
        minStillTimeMs = agvx.a(a, "min_still_time_ms", 1200000);
        minSyntheticSmdDeliveryMs = agvx.a(a, "min_synthetic_smd_delivery", 5000);
        minVehicleSpeedMps = agvx.a(a, "min_vehicle_speed_mps", 12.0d);
        numStillLocationsThreshold = agvx.a(a, "num_still_locations_threshold", 2);
        sigmaScaleDistanceThreshold = agvx.a(a, "sigma_scale_distance_threshold", 0.5d);
        vehicleActivityTimeoutMs = agvx.a(a, "vehicle_activity_timeout_ms", 300000);
    }

    public boolean compiled() {
        return true;
    }

    public double flpMinDistanceMeters() {
        return ((Double) flpMinDistanceMeters.c()).doubleValue();
    }

    public long flpSmdIntervalThresholdMs() {
        return ((Long) flpSmdIntervalThresholdMs.c()).longValue();
    }

    public double flpSmdSwitchIntervalFactor() {
        return ((Double) flpSmdSwitchIntervalFactor.c()).doubleValue();
    }

    public double flpThrottleSmallestDisplacementMeters() {
        return ((Double) flpThrottleSmallestDisplacementMeters.c()).doubleValue();
    }

    public long flpThrottleSmallestPriority() {
        return ((Long) flpThrottleSmallestPriority.c()).longValue();
    }

    public boolean flpThrottleWhenStill() {
        return ((Boolean) flpThrottleWhenStill.c()).booleanValue();
    }

    public long flpThrottleWhenStillIntervalMs() {
        return ((Long) flpThrottleWhenStillIntervalMs.c()).longValue();
    }

    public boolean ignoreSmdForThrottling() {
        return ((Boolean) ignoreSmdForThrottling.c()).booleanValue();
    }

    public long minStillTimeMs() {
        return ((Long) minStillTimeMs.c()).longValue();
    }

    public long minSyntheticSmdDeliveryMs() {
        return ((Long) minSyntheticSmdDeliveryMs.c()).longValue();
    }

    public double minVehicleSpeedMps() {
        return ((Double) minVehicleSpeedMps.c()).doubleValue();
    }

    public long numStillLocationsThreshold() {
        return ((Long) numStillLocationsThreshold.c()).longValue();
    }

    public double sigmaScaleDistanceThreshold() {
        return ((Double) sigmaScaleDistanceThreshold.c()).doubleValue();
    }

    public long vehicleActivityTimeoutMs() {
        return ((Long) vehicleActivityTimeoutMs.c()).longValue();
    }
}
