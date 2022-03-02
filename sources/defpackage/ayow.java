package defpackage;

/* renamed from: ayow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayow implements ayov {
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
    public static final agvx o;
    public static final agvx p;
    public static final agvx q;
    public static final agvx r;
    public static final agvx s;
    public static final agvx t;
    public static final agvx u;
    public static final agvx v;
    public static final agvx w;
    public static final agvx x;
    public static final agvx y;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.update")).a("update_download_").b();
        a = agvx.a(b2, "allow_aggressive_file_sync", false);
        b = agvx.a(b2, "allow_roaming", true);
        c = agvx.a(b2, "approval_check_frequency", 604800000);
        agvx.a(b2, "charging_only_backoff_delay", 3600000);
        d = agvx.a(b2, "connection_timeout", 120000);
        e = agvx.a(b2, "device_roaming_delay", 3600000);
        f = agvx.a(b2, "insufficient_space_retry_delay", 86400000);
        g = agvx.a(b2, "download_low_battery_delay", 3600000);
        h = agvx.a(b2, "min_cache_space", 104857600);
        i = agvx.a(b2, "min_data_space", 524288000);
        j = agvx.a(b2, "network_error_backoff_initial_delay", 60000);
        k = agvx.a(b2, "network_error_backoff_maximum_delay", 21600000);
        l = agvx.a(b2, "network_error_backoff_multiply_factor", 1.5d);
        m = agvx.a(b2, "normal_network_selection_timeout", 3000);
        agvx.a(b2, "notify_time", 0);
        n = agvx.a(b2, "offpeak_download_operator_mismatch_retry_frequency", 3600000);
        agvx.a(b2, "pause_resume_by_service_allowed", true);
        o = agvx.a(b2, "paused_by_user_check_frequency", 86400000);
        p = agvx.a(b2, "prefer_data", false);
        q = agvx.a(b2, "rate_limits", "10000,20000,40000,70000,120000,240000,480000,900000");
        r = agvx.a(b2, "read_timeout", 120000);
        s = agvx.a(b2, "redownload_backoff_initial_delay", 3600000);
        t = agvx.a(b2, "redownload_backoff_maximum_delay", 604800000);
        u = agvx.a(b2, "redownload_backoff_multiply_factor", 3.0d);
        v = agvx.a(b2, "redownload_retry_limit", 2147483647L);
        w = agvx.a(b2, "wifi_only_backoff_delay", 21600000);
        x = agvx.a(b2, "zero_rate_apn_selection_timeout", 20000);
        y = agvx.a(b2, "zero_rate_fallback_connection_allowed", false);
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
        return ((Long) j.c()).longValue();
    }

    public final long i() {
        return ((Long) k.c()).longValue();
    }

    public final double j() {
        return ((Double) l.c()).doubleValue();
    }

    public final long k() {
        return ((Long) m.c()).longValue();
    }

    public final long l() {
        return ((Long) n.c()).longValue();
    }

    public final long m() {
        return ((Long) o.c()).longValue();
    }

    public final boolean n() {
        return ((Boolean) p.c()).booleanValue();
    }

    public final String o() {
        return (String) q.c();
    }

    public final long p() {
        return ((Long) r.c()).longValue();
    }

    public final long q() {
        return ((Long) s.c()).longValue();
    }

    public final long r() {
        return ((Long) t.c()).longValue();
    }

    public final double s() {
        return ((Double) u.c()).doubleValue();
    }

    public final long t() {
        return ((Long) v.c()).longValue();
    }

    public final long u() {
        return ((Long) w.c()).longValue();
    }

    public final long v() {
        return ((Long) x.c()).longValue();
    }

    public final boolean w() {
        return ((Boolean) y.c()).booleanValue();
    }
}
