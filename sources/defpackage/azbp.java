package defpackage;

/* renamed from: azbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azbp implements azbo {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "personalized_places_user_data_black_list", "");
        b = agvx.a(agvw, "personalized_places_user_data_gcore_black_list", "");
        c = agvx.a(agvw, "personalized_places_user_data_gcore_white_list", "");
        d = agvx.a(agvw, "personalized_places_user_data_white_list", "");
        e = agvx.a(agvw, "personalized_places_inference_black_list", "");
        f = agvx.a(agvw, "personalized_places_inference_gcore_black_list", "");
        g = agvx.a(agvw, "personalized_places_inference_gcore_white_list", "LEGACY_PLACES_MODULE");
        h = agvx.a(agvw, "personalized_places_inference_white_list", "");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }

    public final String d() {
        return (String) d.c();
    }

    public final String e() {
        return (String) e.c();
    }

    public final String f() {
        return (String) f.c();
    }

    public final String g() {
        return (String) g.c();
    }

    public final String h() {
        return (String) h.c();
    }
}
