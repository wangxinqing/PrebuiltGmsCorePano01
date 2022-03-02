package defpackage;

/* renamed from: axwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwn implements axwm {
    public static final agvx alwaysReturnNullableHardwareArProviderService;
    public static final agvx hardwareActivityMinPeriodMillis;
    public static final agvx hardwareActivityRecognitionConfidence;
    public static final agvx hardwareActivityRecognitionEnabledV5;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        alwaysReturnNullableHardwareArProviderService = agvx.a(a, "null_hw_ar_ser", false);
        hardwareActivityMinPeriodMillis = agvx.a(a, "hardware_activity_min_period_millis", 16000);
        hardwareActivityRecognitionConfidence = agvx.a(a, "hardware_activity_recognition_confidence", 75);
        hardwareActivityRecognitionEnabledV5 = agvx.a(a, "hardware_activity_recognition_enabled_v5", true);
    }

    public boolean alwaysReturnNullableHardwareArProviderService() {
        return ((Boolean) alwaysReturnNullableHardwareArProviderService.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long hardwareActivityMinPeriodMillis() {
        return ((Long) hardwareActivityMinPeriodMillis.c()).longValue();
    }

    public long hardwareActivityRecognitionConfidence() {
        return ((Long) hardwareActivityRecognitionConfidence.c()).longValue();
    }

    public boolean hardwareActivityRecognitionEnabledV5() {
        return ((Boolean) hardwareActivityRecognitionEnabledV5.c()).booleanValue();
    }
}
