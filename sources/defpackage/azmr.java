package defpackage;

/* renamed from: azmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azmr implements azmq {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "connectionless_timeout_seconds", 15);
        agvx.a(a2, "disable_create_gac", false);
        b = agvx.a(a2, "drop_logs_on_api_failure", false);
        agvx.a(a2, "use_connectionless", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
