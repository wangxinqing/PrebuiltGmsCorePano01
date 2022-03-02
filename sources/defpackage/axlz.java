package defpackage;

/* renamed from: axlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axlz implements axly {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.gcm"));
        a = agvx.a(agvw, "nts.enable_reachability_observer", false);
        b = agvx.a(agvw, "nts.reachability_clearcut_counters_enabled", false);
        c = agvx.a(agvw, "nts.reachability_failed_retry_intervals_seconds", "10,20,30,60,120,240,480,900,1800,3600,7200,14400,28800,57600,86400");
        d = agvx.a(agvw, "nts.reachability_failure_threshold", 9);
        e = agvx.a(agvw, "nts.reachability_hostname_whitelist", ".google.com,.googleapis.com,.gstatic.com");
        f = agvx.a(agvw, "nts.reachability_scheme_whitelist", "ping,tcp");
        g = agvx.a(agvw, "nts.reachability_success_retry_interval_seconds", 3600);
        h = agvx.a(agvw, "nts.use_required_uris_column", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final String e() {
        return (String) e.c();
    }

    public final String f() {
        return (String) f.c();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }
}
