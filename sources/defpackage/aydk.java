package defpackage;

/* renamed from: aydk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aydk implements aydj {
    public static final agvx freshPeriodThreshold;
    public static final agvx freshPeriodThresholdBackground;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        freshPeriodThreshold = agvx.a(a, "location_trigger_fresh_period_threshold", 0.4d);
        freshPeriodThresholdBackground = agvx.a(a, "location_trigger_fresh_period_threshold_background", 1.0d);
    }

    public boolean compiled() {
        return true;
    }

    public double freshPeriodThreshold() {
        return ((Double) freshPeriodThreshold.c()).doubleValue();
    }

    public double freshPeriodThresholdBackground() {
        return ((Double) freshPeriodThresholdBackground.c()).doubleValue();
    }
}
