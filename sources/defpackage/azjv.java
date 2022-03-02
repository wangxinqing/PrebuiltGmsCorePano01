package defpackage;

/* renamed from: azjv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azjv implements azju {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.smartdevice"));
        a = agvx.a(agvw, "Deeplink__deeplink_timeout_bug_fix", true);
        b = agvx.a(agvw, "Deeplink__is_connect2_enabled", false);
        c = agvx.a(agvw, "Deeplink__is_enabled", false);
        d = agvx.a(agvw, "Deeplink__remove_device_from_bootstrap", false);
        e = agvx.a(agvw, "Deeplink__shortlink_url", "g.co/pair");
        f = agvx.a(agvw, "timeout_for_discovery", 20000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final String e() {
        return (String) e.c();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }
}
