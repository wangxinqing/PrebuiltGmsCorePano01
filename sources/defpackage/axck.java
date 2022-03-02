package defpackage;

/* renamed from: axck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axck implements axcj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a();
        a = agvx.a(a2, "ServiceConnection__enable_logging", false);
        b = agvx.a(a2, "ServiceConnection__sampling_rate", 1.0d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }
}
