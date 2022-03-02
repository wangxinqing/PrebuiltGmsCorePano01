package defpackage;

/* renamed from: azce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azce implements azcd {
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
        a = agvx.a(agvw, "autocomplete_widget_num_results_to_request", 10);
        b = agvx.a(agvw, "place_picker_my_location_deadline", 10000);
        c = agvx.a(agvw, "place_autocomplete_error_delay_msec", 2000);
        d = agvx.a(agvw, "place_picker_max_results", 20);
        agvx.a(agvw, "place_picker_places_place_updates_expiration", 30000);
        agvx.a(agvw, "place_picker_places_place_updates_interval", 10000);
        e = agvx.a(agvw, "place_picker_redirect_to_autocomplete", "com.google.android.keep");
        f = agvx.a(agvw, "place_picker_places_server_deadline", 10000);
        g = agvx.a(agvw, "place_picker_reverse_geocoding_deadline", 1000);
        h = agvx.a(agvw, "place_picker_use_autocomplete_adapter", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final String e() {
        return (String) e.c();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
