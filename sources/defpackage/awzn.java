package defpackage;

/* renamed from: awzn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzn implements awzm {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a();
        a = agvx.a(a2, "GmsCoreBackendCounters__enable", false);
        b = agvx.a(a2, "GmsCoreBackendCounters__immediate_logging", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
