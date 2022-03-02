package defpackage;

/* renamed from: axdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdo implements axdn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw("direct_boot:gms_chimera_phenotype_flags");
        a = agvx.a(agvw, "WakelockMetrics__base_sample_rate", 2.0E-6d);
        b = agvx.a(agvw, "WakelockMetrics__deadline_multiplier", 100.0d);
        c = agvx.a(agvw, "WakelockMetrics__enable_metrics", true);
        agvx.a(agvw, "WakelockMetrics__install_config_in_module_initializer", false);
        d = agvx.a(agvw, "WakelockMetrics__log_unmetered_only", false);
        e = agvx.a(agvw, "WakelockMetrics__manual_multiplier", 1.0d);
        f = agvx.a(agvw, "WakelockMetrics__max_samples_per_day", 3);
        g = agvx.a(agvw, "WakelockMetrics__report_idle_state", true);
        h = agvx.a(agvw, "WakelockMetrics__timeout_multiplier", 10.0d);
    }

    public final double a() {
        return ((Double) a.c()).doubleValue();
    }

    public final double b() {
        return ((Double) b.c()).doubleValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final double h() {
        return ((Double) h.c()).doubleValue();
    }
}
