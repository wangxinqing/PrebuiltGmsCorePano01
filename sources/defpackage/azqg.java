package defpackage;

/* renamed from: azqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azqg implements azqf {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.tron.metrics"));
        a = agvx.a(agvw, "connectionless_timeout_seconds", 15);
        agvx.a(agvw, "disable_create_gac", false);
        b = agvx.a(agvw, "drop_api_failures", true);
        agvx.a(agvw, "use_connectionless", false);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
