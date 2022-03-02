package defpackage;

/* renamed from: axrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axrx implements axrw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.icing")).a();
        a = agvx.a(a2, "gms_icing_mdh_channel_config_check_stats_sample_interval", 1000);
        b = agvx.a(a2, "gms_icing_mdh_channel_config_missing_refresh_max_delay_seconds", 300);
        c = agvx.a(a2, "gms_icing_mdh_channel_config_missing_refresh_min_delay_seconds", 60);
        d = agvx.a(a2, "gms_icing_mdh_channel_config_refresh_max_delay_seconds", 864000);
        e = agvx.a(a2, "gms_icing_mdh_channel_config_refresh_min_delay_seconds", 432000);
        f = agvx.a(a2, "gms_icing_mdh_fetch_channel_configs_stats_sample_interval", 100);
        g = agvx.a(a2, "gms_icing_mdh_channel_config_refresh_suppress_scheduling_seconds", 3600);
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
}
