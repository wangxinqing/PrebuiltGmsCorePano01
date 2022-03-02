package defpackage;

/* renamed from: axmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axmf implements axme {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        agvx.a(agvw, "nts.enable_doze_light_restrictions", true);
        a = agvx.a(agvw, "nts.enable_dynamic_network_observer_registration", false);
        b = agvx.a(agvw, "nts.enable_network_callback_observer", false);
        agvx.a(agvw, "nts.enable_network_validation", false);
        c = agvx.a(agvw, "nts.enable_power_saver_restrictions", true);
        d = agvx.a(agvw, "nts.enable_skipping_standalone_prewakeup_capacity_check", false);
        e = agvx.a(agvw, "nts.enable_wakeup_rate_limiting", false);
        f = agvx.a(agvw, "nts.max_gmscore_tasks_per_user", -1);
        g = agvx.a(agvw, "nts.max_gmscore_tasks_per_user_busy", -1);
        h = agvx.a(agvw, "nts.max_tasks_per_1p_package", 200);
        i = agvx.a(agvw, "nts.max_tasks_per_package", 100);
        j = agvx.a(agvw, "nts.max_tasks_per_user", 2);
        k = agvx.a(agvw, "nts.max_tasks_per_user_busy", 2);
        l = agvx.a(agvw, "nts.scheduler_active", true);
        m = agvx.a(agvw, "nts.strip_3p_details_from_clearcut", true);
        n = agvx.a(agvw, "nts.wakeup_rate_limiting_min_delay_secs", 5);
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final boolean l() {
        return ((Boolean) l.c()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }

    public final long n() {
        return ((Long) n.c()).longValue();
    }
}
