package defpackage;

/* renamed from: azbg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azbg implements azbf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;
    public static final agvx j;
    public static final agvx k;
    public static final agvx l;
    public static final agvx m;
    public static final agvx n;
    public static final agvx o;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "enable_security_exception_fix", true);
        b = agvx.a(agvw, "autocomplete_query_logging_fraction", 0.0d);
        c = agvx.a(agvw, "log_api_calls", true);
        d = agvx.a(agvw, "enable_clearcut_logging_for_places_rpc", true);
        e = agvx.a(agvw, "enable_implicit_logging_location", false);
        f = agvx.a(agvw, "log_to_playlog", true);
        g = agvx.a(agvw, "enable_implicit_logging_wifi", true);
        h = agvx.a(agvw, "get_by_lat_lng_max_results", 20);
        i = agvx.a(agvw, "get_by_location_max_results", 30);
        j = agvx.a(agvw, "get_by_location_white_list", "com.tencent.mm,com.whatsapp");
        k = agvx.a(agvw, "get_location_deadline_msec", 60000);
        l = agvx.a(agvw, "get_location_retry_interval_msec", 10000);
        m = agvx.a(agvw, "log_place_picker", true);
        n = agvx.a(agvw, "num_platform_key_io_errors_before_nuke", 10);
        o = agvx.a(agvw, "search_query_logging_fraction", 0.01d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final String j() {
        return (String) j.c();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final long l() {
        return ((Long) l.c()).longValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }

    public final long n() {
        return ((Long) n.c()).longValue();
    }

    public final double o() {
        return ((Double) o.c()).doubleValue();
    }
}
