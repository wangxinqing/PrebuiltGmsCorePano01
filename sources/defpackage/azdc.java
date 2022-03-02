package defpackage;

/* renamed from: azdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azdc implements azdb {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "sls_auth_scope", "https://www.googleapis.com/auth/semanticlocation.readonly");
        b = agvx.a(agvw, "sls_server_url", "semanticlocation-pa.googleapis.com");
        c = agvx.a(agvw, "sls_timeout_ms", 10000);
        d = agvx.a(agvw, "use_sls_for_get_place_by_lat_lng_operation", false);
        e = agvx.a(agvw, "use_sls_for_get_user_places_operation", false);
        f = agvx.a(agvw, "use_sls_for_nearby_alert_data_by_id", false);
        g = agvx.a(agvw, "use_sls_for_place_index", false);
        h = agvx.a(agvw, "use_sls_for_place_inference_model", false);
        i = agvx.a(agvw, "use_sls_for_search_by_beacon", false);
        j = agvx.a(agvw, "use_sls_for_search_by_chain", false);
        k = agvx.a(agvw, "use_sls_for_standard_alias_operation", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
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

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }
}
