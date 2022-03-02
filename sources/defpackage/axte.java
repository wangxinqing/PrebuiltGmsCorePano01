package defpackage;

/* renamed from: axte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axte implements axtd {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing.mdd"));
        a = agvx.a(agvw, "api_logging_sample_interval", 100);
        agvx.a(agvw, "cleanup_log_logging_sample_interval", 1000);
        b = agvx.a(agvw, "group_stats_logging_sample_interval", 100);
        c = agvx.a(agvw, "mdd_default_sample_interval", 100);
        d = agvx.a(agvw, "mdd_download_events_sample_interval", 1);
        e = agvx.a(agvw, "mobstore_file_service_stats_sample_interval", 100);
        f = agvx.a(agvw, "network_stats_logging_sample_interval", 100);
        g = agvx.a(agvw, "silent_feedback_sample_interval", 100);
        h = agvx.a(agvw, "storage_stats_logging_sample_interval", 100);
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

    public final long e() {
        return ((Long) e.c()).longValue();
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
}
