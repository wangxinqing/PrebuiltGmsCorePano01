package defpackage;

/* renamed from: ayzy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayzy implements ayzw {
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

    static {
        agvw b2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:").b();
        a = agvx.a(b2, "clear_reset_blacklist", "");
        b = agvx.a(b2, "configurator:auth_token_service", "oauth2:https://www.googleapis.com/auth/experimentsandconfigs");
        c = agvx.a(b2, "configurator:service_url", "https://www.googleapis.com/experimentsandconfigs/v1/getExperimentsAndConfigs");
        d = agvx.a(b2, "debug_allow_http", false);
        e = agvx.a(b2, "debug_clear_heterodyne_tag", false);
        f = agvx.a(b2, "PhenotypeFeature__enable_broadcast_logging", false);
        g = agvx.a(b2, "PhenotypeFeature__enable_committed_version_logging", true);
        h = agvx.a(b2, "enableDebugService", false);
        i = agvx.a(b2, "enable_flag_deltas", true);
        j = agvx.a(b2, "enable_verbose_syncer_logging", false);
        agvx.a(b2, "gcm_sender_id", "336839458163");
        agvx.a(b2, "gcm_subscription_smear_ms", 172800000);
        k = agvx.a(b2, "interval_flex_seconds", 1800);
        l = agvx.a(b2, "max_users_to_sync", 20);
        m = agvx.a(b2, "phenotype_api_wait_ms", 2000);
        n = agvx.a(b2, "retry_after_max_seconds", 86400);
        o = agvx.a(b2, "retry_after_min_seconds", 60);
        p = agvx.a(b2, "PhenotypeFeature__return_server_token_when_overrides_present", true);
        q = agvx.a(b2, "sync_retry_delay_seconds", 3600);
        r = agvx.a(b2, "vacuum_change_count_mod", 1000);
        try {
            s = agvx.a(b2, "whitelisted_apps_for_flag_overrides", (auib) aucj.a((aucj) auib.b, new byte[]{10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 112, 108, 97, 121, 46, 103, 97, 109, 101, 115}), ayzx.a);
        } catch (auda e2) {
            throw new AssertionError("Could not parse proto flag \"whitelisted_apps_for_flag_overrides\"");
        }
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
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

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final long k() {
        return ((Long) k.c()).longValue();
    }

    public final long l() {
        return ((Long) l.c()).longValue();
    }

    public final long m() {
        return ((Long) m.c()).longValue();
    }

    public final long n() {
        return ((Long) n.c()).longValue();
    }

    public final long o() {
        return ((Long) o.c()).longValue();
    }

    public final boolean p() {
        return ((Boolean) p.c()).booleanValue();
    }

    public final long q() {
        return ((Long) q.c()).longValue();
    }

    public final long r() {
        return ((Long) r.c()).longValue();
    }

    public final auib s() {
        return (auib) s.c();
    }
}
