package defpackage;

/* renamed from: azpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azpo implements azpn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        agvx.a(a2, "client_connect_timeout_millis", 5000);
        a = agvx.a(a2, "collect_empty_content", true);
        b = agvx.a(a2, "collect_ulr", true);
        c = agvx.a(a2, "default_qos", 0);
        d = agvx.a(a2, "lockbox_logging", true);
        e = agvx.a(a2, "max_collection_exception_length", 20480);
        agvx.a(a2, "phenotype_register_timeout_millis", 5000);
        f = agvx.a(a2, "upload_collection_exception_to_clearcut", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }
}
