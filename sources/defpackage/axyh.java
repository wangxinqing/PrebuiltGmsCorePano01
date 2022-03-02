package defpackage;

/* renamed from: axyh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyh implements axyg {
    public static final agvx chreCcPingIntervalMillis;
    public static final agvx chreCcSupported;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        chreCcPingIntervalMillis = agvx.a(a, "chre_cc_ping_interval_millis", 900000);
        chreCcSupported = agvx.a(a, "chre_cc_supported", false);
    }

    public long chreCcPingIntervalMillis() {
        return ((Long) chreCcPingIntervalMillis.c()).longValue();
    }

    public boolean chreCcSupported() {
        return ((Boolean) chreCcSupported.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
