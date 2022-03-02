package defpackage;

/* renamed from: azcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azcn implements azcm {
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
        a = agvx.a(agvw, "placesserver.api_path", "/placesandroid/v1/");
        b = agvx.a(agvw, "placesserver.apiary_trace", "");
        c = agvx.a(agvw, "placesserver.auth_scope", "https://www.googleapis.com/auth/placesserver");
        d = agvx.a(agvw, "placesserver.backend_override", "");
        e = agvx.a(agvw, "placesserver.cache_enabled", false);
        f = agvx.a(agvw, "placesserver_timeout_millis", 10000);
        g = agvx.a(agvw, "placesserver.url", "https://www.googleapis.com");
        h = agvx.a(agvw, "placesserver.verbose_logging", true);
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final String g() {
        return (String) g.c();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
