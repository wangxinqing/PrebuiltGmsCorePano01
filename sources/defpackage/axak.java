package defpackage;

/* renamed from: axak  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axak implements axaj {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;
    public static final agvx i;

    static {
        agvw a2 = new agvw("phenotype__com.google.android.gms").a();
        a = agvx.a(a2, "PeriodicRestarts__enable_periodic_restart_lock_v2", false);
        b = agvx.a(a2, "PeriodicRestarts__enable_periodic_restarts_on_gms_process", false);
        c = agvx.a(a2, "PeriodicRestarts__enable_periodic_restarts_on_persistent_process", false);
        d = agvx.a(a2, "PeriodicRestarts__initial_post_delay_in_millis", 60000);
        e = agvx.a(a2, "PeriodicRestarts__is_enabled", false);
        f = agvx.a(a2, "PeriodicRestarts__max_wait_for_writer_lock_in_seconds", 7200);
        g = agvx.a(a2, "PeriodicRestarts__scheduled_restart_fixer_log_sampling_rate", 1.0E-5d);
        h = agvx.a(a2, "PeriodicRestarts__scheduled_restart_task_end_delay_in_seconds", 172800);
        i = agvx.a(a2, "PeriodicRestarts__scheduled_restart_task_start_delay_in_seconds", 86400);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final double g() {
        return ((Double) g.c()).doubleValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }
}
