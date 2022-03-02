package defpackage;

/* renamed from: axwq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwq implements axwp {
    public static final agvx inVehicleOffBodyCountThreshold;
    public static final agvx inVehicleOffBodyCountThresholdForBatching;
    public static final agvx offBodyDetectionAngularThreshold;
    public static final agvx offBodyDetectionEnergyThreshold;
    public static final agvx offBodyDetectionLowerAngularThreshold;
    public static final agvx offBodyDetectionUpperAngularThreshold;
    public static final agvx offBodyEligibleApps;
    public static final agvx watchHardwareOffBodyEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        inVehicleOffBodyCountThreshold = agvx.a(a, "in_vehicle_off_body_count_threshold", 1);
        inVehicleOffBodyCountThresholdForBatching = agvx.a(a, "in_vehicle_off_body_count_threshold_for_batching", 3);
        offBodyDetectionAngularThreshold = agvx.a(a, "off_body_detection_angular_threshold", 0.075d);
        offBodyDetectionEnergyThreshold = agvx.a(a, "off_body_detection_energy_threshold", 50.0d);
        offBodyDetectionLowerAngularThreshold = agvx.a(a, "off_body_detection_lower_angular_threshold", 0.075d);
        offBodyDetectionUpperAngularThreshold = agvx.a(a, "off_body_detection_upper_angular_threshold", 0.075d);
        offBodyEligibleApps = agvx.a(a, "off_body_eligible_apps", "com.google.android.wearable.app,com.google.android.wearable.ambient,com.google.android.apps.wearable.settings");
        watchHardwareOffBodyEnabled = agvx.a(a, "watch_hardware_off_body_enabled", true);
    }

    public boolean compiled() {
        return true;
    }

    public long inVehicleOffBodyCountThreshold() {
        return ((Long) inVehicleOffBodyCountThreshold.c()).longValue();
    }

    public long inVehicleOffBodyCountThresholdForBatching() {
        return ((Long) inVehicleOffBodyCountThresholdForBatching.c()).longValue();
    }

    public double offBodyDetectionAngularThreshold() {
        return ((Double) offBodyDetectionAngularThreshold.c()).doubleValue();
    }

    public double offBodyDetectionEnergyThreshold() {
        return ((Double) offBodyDetectionEnergyThreshold.c()).doubleValue();
    }

    public double offBodyDetectionLowerAngularThreshold() {
        return ((Double) offBodyDetectionLowerAngularThreshold.c()).doubleValue();
    }

    public double offBodyDetectionUpperAngularThreshold() {
        return ((Double) offBodyDetectionUpperAngularThreshold.c()).doubleValue();
    }

    public String offBodyEligibleApps() {
        return (String) offBodyEligibleApps.c();
    }

    public boolean watchHardwareOffBodyEnabled() {
        return ((Boolean) watchHardwareOffBodyEnabled.c()).booleanValue();
    }
}
