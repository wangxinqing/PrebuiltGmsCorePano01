package defpackage;

/* renamed from: axbq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axbq implements axbp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        agvx.a(agvw, "SchedulerClearcutLogging__enable_logging_wakeup_events", true);
        a = agvx.a(agvw, "SchedulerClearcutLogging__enable_logs", false);
        b = agvx.a(agvw, "SchedulerClearcutLogging__enable_unmetered_or_daily_for_logging", false);
        c = agvx.a(agvw, "SchedulerClearcutLogging__exec_finished_sample_rate", 1.0d);
        d = agvx.a(agvw, "SchedulerClearcutLogging__init_finished_sample_rate", 1.0d);
        e = agvx.a(agvw, "SchedulerClearcutLogging__sample_rate", 0.0d);
        f = agvx.a(agvw, "SchedulerClearcutLogging__use_checkbox_only_logger", false);
        g = agvx.a(agvw, "SchedulerClearcutLogging__use_statistics_tracker_verification", false);
        h = agvx.a(agvw, "SchedulerClearcutLogging__wakeup_sample_rate", 1.0d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final double c() {
        return ((Double) c.c()).doubleValue();
    }

    public final double d() {
        return ((Double) d.c()).doubleValue();
    }

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final double h() {
        return ((Double) h.c()).doubleValue();
    }
}
