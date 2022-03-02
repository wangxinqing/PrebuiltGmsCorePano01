package defpackage;

/* renamed from: ayot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayot implements ayos {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.update"));
        a = agvx.a(agvw, "config_delivery_service_host", "");
        b = agvx.a(agvw, "config_delivery_service_port", -1);
        c = agvx.a(agvw, "grpc_config_enabled", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
