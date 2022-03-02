package defpackage;

/* renamed from: azwu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azwu implements azwt {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        a = agvx.a(a2, "blacklisted_alarms", "");
        b = agvx.a(a2, "blacklisted_alerts", "");
        c = agvx.a(a2, "blacklisted_metrics", "");
        d = agvx.a(a2, "blacklisted_subscriptions", "");
        e = agvx.a(a2, "config_key", 175713051);
        f = agvx.a(a2, "config_prefix", "westworld_config_");
        g = agvx.a(a2, "disable_string_hashing", false);
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final String f() {
        return (String) f.c();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }
}
