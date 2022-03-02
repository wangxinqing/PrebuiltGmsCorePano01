package defpackage;

/* renamed from: aysb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aysb implements aysa {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "FsaBugFixesY2019w24__always_log_network_stats_enabled", true);
        b = agvx.a(agvw, "FsaBugFixesY2019w24__check_synced_columns_only_for_phone_number_exact_match", false);
        c = agvx.a(agvw, "FsaBugFixesY2019w24__disallow_metered_network_sync_cancellation_retry", false);
        d = agvx.a(agvw, "FsaBugFixesY2019w24__mismatch_after_sync_metrics_fix_enabled", true);
        e = agvx.a(agvw, "FsaBugFixesY2019w24__num_of_retries_when_sync_cancelled", 3);
        f = agvx.a(agvw, "FsaBugFixesY2019w24__pulse_during_contacts_download_enabled", true);
        g = agvx.a(agvw, "FsaBugFixesY2019w24__pulse_during_groups_download_enabled", true);
        h = agvx.a(agvw, "FsaBugFixesY2019w24__require_charging_for_sync_cancellation_retry", false);
        i = agvx.a(agvw, "FsaBugFixesY2019w24__retry_cancelled_proxy_initiated_sync_enabled", true);
        j = agvx.a(agvw, "FsaBugFixesY2019w24__seconds_to_pulse_during_download", 10);
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

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final boolean f() {
        return ((Boolean) f.c()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) h.c()).booleanValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
    }
}
