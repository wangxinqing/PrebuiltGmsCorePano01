package defpackage;

/* renamed from: azal  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azal implements azag {
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
    public static final agvx z;

    static {
        agvw b2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:").b();
        a = agvx.a(b2, "adaptive_window_start_seconds", 14400);
        b = agvx.a(b2, "Sync__cleanup_developer_db", false);
        c = agvx.a(b2, "connection_timeout_millis", 60000);
        d = agvx.a(b2, "Sync__detect_flag_corruption4", false);
        agvx.a(b2, "enable_adaptive_poller", true);
        e = agvx.a(b2, "Sync__enable_device_based_sync", false);
        f = agvx.a(b2, "Sync__enable_improved_heterodyne_exception", true);
        g = agvx.a(b2, "Sync__enable_pseudonymous_id_compare_and_set", true);
        agvx.a(b2, "enable_schedule_on_register_delta", true);
        h = agvx.a(b2, "enable_task_reachability", false);
        try {
            i = agvx.a(b2, "Sync__garbage_collection_fetch_reasons", (auhz) aucj.a((aucj) auhz.b, new byte[0]), azah.a);
            j = agvx.a(b2, "Sync__guard_against_same_tokens_tag", true);
            k = agvx.a(b2, "Sync__include_client_type", true);
            l = agvx.a(b2, "interval_seconds", 14400);
            m = agvx.a(b2, "Sync__log_http_error_code", true);
            n = agvx.a(b2, "Sync__read_timeout_millis", 60000);
            o = agvx.a(b2, "Sync__rebroadcast_min_interval_seconds", -1);
            p = agvx.a(b2, "Sync__remove_old_config_packages", false);
            q = agvx.a(b2, "Sync__remove_request_config_tag", false);
            r = agvx.a(b2, "Sync__stop_sync_on_pseudonymous_api_error", true);
            s = agvx.a(b2, "Sync__sync_on_checkin", false);
            try {
                t = agvx.a(b2, "Sync__sync_on_delta_blacklist", (auib) aucj.a((aucj) auib.b, new byte[0]), azai.a);
                u = agvx.a(b2, "Sync__sync_on_flag_corruption", true);
                try {
                    v = agvx.a(b2, "Sync__sync_on_nonsync_params_delta_blacklist", (auib) aucj.a((aucj) auib.b, new byte[]{10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 111, 111, 103, 108, 101, 113, 117, 105, 99, 107, 115, 101, 97, 114, 99, 104, 98, 111, 120}), azaj.a);
                    w = agvx.a(b2, "sync_on_params_delta_blacklist", "com.google.android.gms.phenotype,com.google.android.contacts,com.google.android.apps.links#com.google.android.apps.cerebra.links,com.google.android.apps.links#com.google.android.apps.cerebra.links.dogfood,com.google.android.gms.people");
                    try {
                        x = agvx.a(b2, "Sync__unregister_config_packages", (auib) aucj.a((aucj) auib.b, new byte[0]), azak.a);
                        y = agvx.a(b2, "Sync__update_config_hash", true);
                        z = agvx.a(b2, "use_http_url_connection", false);
                    } catch (auda e2) {
                        throw new AssertionError("Could not parse proto flag \"Sync__unregister_config_packages\"");
                    }
                } catch (auda e3) {
                    throw new AssertionError("Could not parse proto flag \"Sync__sync_on_nonsync_params_delta_blacklist\"");
                }
            } catch (auda e4) {
                throw new AssertionError("Could not parse proto flag \"Sync__sync_on_delta_blacklist\"");
            }
        } catch (auda e5) {
            throw new AssertionError("Could not parse proto flag \"Sync__garbage_collection_fetch_reasons\"");
        }
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
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

    public final auhz i() {
        return (auhz) i.c();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }

    public final long l() {
        return ((Long) l.c()).longValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
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

    public final boolean q() {
        return ((Boolean) q.c()).booleanValue();
    }

    public final boolean r() {
        return ((Boolean) r.c()).booleanValue();
    }

    public final boolean s() {
        return ((Boolean) s.c()).booleanValue();
    }

    public final auib t() {
        return (auib) t.c();
    }

    public final boolean u() {
        return ((Boolean) u.c()).booleanValue();
    }

    public final auib v() {
        return (auib) v.c();
    }

    public final String w() {
        return (String) w.c();
    }

    public final auib x() {
        return (auib) x.c();
    }

    public final boolean y() {
        return ((Boolean) y.c()).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) z.c()).booleanValue();
    }
}
