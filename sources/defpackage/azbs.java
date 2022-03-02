package defpackage;

/* renamed from: azbs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azbs implements azbr {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "mdh_disable_requires_charging", false);
        b = agvx.a(agvw, "mdh_disable_requires_unmetered", false);
        c = agvx.a(agvw, "mdh_push_policy_id", 1);
        d = agvx.a(agvw, "mdh_read_throttling_seconds", 86400);
        agvx.a(agvw, "use_mdh_broadcast_client", false);
        e = agvx.a(agvw, "use_mdh_personal_place_info_source", false);
        f = agvx.a(agvw, "use_mdh_push_notifications", false);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }
}
