package defpackage;

/* renamed from: ayzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayzu implements ayzs {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw b2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:").b();
        agvx.a(b2, "PackageUpdateOptimization__allow_sending_broadcasts_to_not_running_apps", false);
        a = agvx.a(b2, "PackageUpdateOptimization__do_not_wake_up_unless_idle_and_charging", false);
        agvx.a(b2, "PackageUpdateOptimization__enable_optimization", true);
        b = agvx.a(b2, "PackageUpdateOptimization__include_stopped_packages_in_broadcast", true);
        c = agvx.a(b2, "PackageUpdateOptimization__may_notify_base_package", true);
        d = agvx.a(b2, "PackageUpdateOptimization__min_timeout_seconds", 14400);
        e = agvx.a(b2, "PackageUpdateOptimization__notify_all_uncommitted_timeout_seconds", 86400);
        try {
            f = agvx.a(b2, "PackageUpdateOptimization__update_now_app_whitelist", (auib) aucj.a((aucj) auib.b, new byte[]{10, 22, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 99, 97, 114, 114, 105, 101, 114}), ayzt.a);
            agvx.a(b2, "PackageUpdateOptimization__update_now_bucket_upper_bound", 10);
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"PackageUpdateOptimization__update_now_app_whitelist\"");
        }
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final auib f() {
        return (auib) f.c();
    }
}
