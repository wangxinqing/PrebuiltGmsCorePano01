package defpackage;

/* renamed from: ayny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayny implements aynx {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.notifications"));
        a = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__api_server_url", "https://notifications-pa.googleapis.com");
        b = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__apiary_trace", "");
        c = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__base_api_path", "/v1/gmscore/legacy");
        d = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__enable_caching", false);
        e = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__enable_one_platform_api", false);
        f = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__enable_one_platform_tracing", false);
        g = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__enable_verbose_logging", false);
        h = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__fetch_by_identifier_path", "/fetchbyidentifier?alt=proto");
        i = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__oauth_scopes", "https://www.googleapis.com/auth/notifications");
        j = agvx.a(agvw, "NotificationsUseOnePlatformApiFeature__set_read_states_path", "/setreadstates?alt=proto");
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

    public final String h() {
        return (String) h.c();
    }

    public final String i() {
        return (String) i.c();
    }

    public final String j() {
        return (String) j.c();
    }
}
