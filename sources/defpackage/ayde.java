package defpackage;

/* renamed from: ayde  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayde implements aydd {
    public static final agvx disableFastestIntervalFactorWhenFastestIntervalExplicitlySet;
    public static final agvx locationRequestFastestIntervalFactor;
    public static final agvx noPowerMinFastestIntervalMillis;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        disableFastestIntervalFactorWhenFastestIntervalExplicitlySet = agvx.a(a, "disable_fastest_interval_factor_when_fastest_interval_explicitly_set", false);
        locationRequestFastestIntervalFactor = agvx.a(a, "location_request_fastest_interval_factor", 0.0d);
        noPowerMinFastestIntervalMillis = agvx.a(a, "no_power_min_fastest_interval_millis", 0);
    }

    public boolean compiled() {
        return true;
    }

    public boolean disableFastestIntervalFactorWhenFastestIntervalExplicitlySet() {
        return ((Boolean) disableFastestIntervalFactorWhenFastestIntervalExplicitlySet.c()).booleanValue();
    }

    public double locationRequestFastestIntervalFactor() {
        return ((Double) locationRequestFastestIntervalFactor.c()).doubleValue();
    }

    public long noPowerMinFastestIntervalMillis() {
        return ((Long) noPowerMinFastestIntervalMillis.c()).longValue();
    }
}
