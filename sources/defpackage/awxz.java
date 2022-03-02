package defpackage;

/* renamed from: awxz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awxz implements awxv {
    public static final agvx A;
    public static final agvx B;
    public static final agvx C;
    public static final agvx D;
    public static final agvx E;
    public static final agvx F;
    public static final agvx G;
    public static final agvx H;
    public static final agvx I;
    public static final agvx J;
    public static final agvx K;
    public static final agvx L;
    public static final agvx M;
    public static final agvx N;
    public static final agvx O;
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
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:chimera:");
        a = agvx.a(a2, "Chimera__allow_module_downloads_to_be_restaged_if_incomplete", true);
        b = agvx.a(a2, "Chimera__allow_shared_apks", false);
        c = agvx.a(a2, "Chimera__blacklist_intent_operation_on_exception", false);
        d = agvx.a(a2, "Chimera__blacklisted_zapp_diff_base_modules", "AdsFdrDynamite.integ:20290*,AdsFdrDynamite.integ:20300*,AdsFdrDynamite.integ:20461*,AdsFdrDynamite.integ:21001*");
        try {
            e = agvx.a(a2, "Chimera__blocked_features", (bod) aucj.a((aucj) bod.b, new byte[0]), awxw.a);
            f = agvx.a(a2, "Chimera__blocked_system_image_optional_features", "");
            g = agvx.a(a2, "Chimera__check_permit_metered_network", false);
            h = agvx.a(a2, "Chimera__chimera_download_stats_sampling_rate", 10);
            i = agvx.a(a2, "Chimera__chimera_update_requires_device_idle", false);
            j = agvx.a(a2, "Chimera__config_checkin_enabled", false);
            k = agvx.a(a2, "Chimera__cull_duplicate_modulesets", true);
            agvx.a(a2, "Chimera__delay_between_module_downloads", 100);
            l = agvx.a(a2, "ChimeraCriticalPath__disable_container_features_for_pending_module_set", true);
            m = agvx.a(a2, "Chimera__disable_container_optional_module_download", true);
            n = agvx.a(a2, "Chimera__downloader_max_threads", 3);
            o = agvx.a(a2, "Chimera__enable_aggressive_zapp_ingestion_retry", true);
            agvx.a(a2, "Chimera__enable_checkin_logging", false);
            p = agvx.a(a2, "Chimera__enable_chimera_clearcut_logger", false);
            q = agvx.a(a2, "Chimera__enable_chimera_download_stats_logging", false);
            agvx.a(a2, "Chimera__enable_chimera_test_param", false);
            r = agvx.a(a2, "Chimera__enable_dynamite_module_runtime_bitness_logging", false);
            s = agvx.a(a2, "Chimera__enable_fast_new_modules_retry", true);
            t = agvx.a(a2, "Chimera__enable_finsky_app_module_dependency_service", false);
            agvx.a(a2, "Chimera__enable_independent_modulesets", true);
            u = agvx.a(a2, "Chimera__enable_resume_failed_download", true);
            v = agvx.a(a2, "Chimera__enable_system_image_optional_features", false);
            w = agvx.a(a2, "Chimera__enable_zapp_diff_downloading", true);
            x = agvx.a(a2, "Chimera__finsky_app_module_dependency_request_timeout_millis", 30000);
            y = agvx.a(a2, "Chimera__max_download_restart_times", 10);
            z = agvx.a(a2, "Chimera__max_module_set_history_len", 2);
            try {
                agvx.a(a2, "Chimera__module_set_list", (hfh) aucj.a((aucj) hfh.b, new byte[0]), awxx.a);
                A = agvx.a(a2, "Chimera__override_default_fragment_transitions", true);
                B = agvx.a(a2, "Chimera__propagate_module_download_errors", true);
                try {
                    agvx.a(a2, "Chimera__required_features", (bod) aucj.a((aucj) bod.b, new byte[0]), awxy.a);
                    C = agvx.a(a2, "Chimera__restart_interrupted_downloads", false);
                    D = agvx.a(a2, "Chimera__retain_pending_module_sets_based_on_running_version", true);
                    E = agvx.a(a2, "Chimera__share_apks_with_all_users", false);
                    F = agvx.a(a2, "Chimera__show_chimera_settings", false);
                    G = agvx.a(a2, "Chimera__use_container_activity_class_name_to_fetch_metadata", true);
                    H = agvx.a(a2, "Chimera__use_new_lifecycle_management_in_intent_operation_service", false);
                    I = agvx.a(a2, "Chimera__use_processing_thread_in_intent_operation_service", false);
                    J = agvx.a(a2, "Chimera__wait_for_all_downloads_to_complete_timeout_seconds", 300);
                    K = agvx.a(a2, "Chimera__wait_for_phenotype_sync_timeout_seconds", 30);
                    L = agvx.a(a2, "Chimera__whitelisted_app_module_dep_packages", "");
                    M = agvx.a(a2, "Chimera__write_direct_boot_gservices", true);
                    N = agvx.a(a2, "Chimera__zapp_diff_base_installed_packages", "");
                    O = agvx.a(a2, "Chimera__zapp_minimum_play_store_version", 80700000);
                } catch (auda e2) {
                    throw new AssertionError("Could not parse proto flag \"Chimera__required_features\"");
                }
            } catch (auda e3) {
                throw new AssertionError("Could not parse proto flag \"Chimera__module_set_list\"");
            }
        } catch (auda e4) {
            throw new AssertionError("Could not parse proto flag \"Chimera__blocked_features\"");
        }
    }

    public final boolean A() {
        return ((Boolean) A.c()).booleanValue();
    }

    public final boolean B() {
        return ((Boolean) B.c()).booleanValue();
    }

    public final boolean C() {
        return ((Boolean) C.c()).booleanValue();
    }

    public final boolean D() {
        return ((Boolean) D.c()).booleanValue();
    }

    public final boolean E() {
        return ((Boolean) E.c()).booleanValue();
    }

    public final boolean F() {
        return ((Boolean) F.c()).booleanValue();
    }

    public final boolean G() {
        return ((Boolean) G.c()).booleanValue();
    }

    public final boolean H() {
        return ((Boolean) H.c()).booleanValue();
    }

    public final boolean I() {
        return ((Boolean) I.c()).booleanValue();
    }

    public final long J() {
        return ((Long) J.c()).longValue();
    }

    public final long K() {
        return ((Long) K.c()).longValue();
    }

    public final String L() {
        return (String) L.c();
    }

    public final boolean M() {
        return ((Boolean) M.c()).booleanValue();
    }

    public final String N() {
        return (String) N.c();
    }

    public final long O() {
        return ((Long) O.c()).longValue();
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

    public final String d() {
        return (String) d.c();
    }

    public final bod e() {
        return (bod) e.c();
    }

    public final String f() {
        return (String) f.c();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final boolean i() {
        return ((Boolean) i.c()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) j.c()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) l.c()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
    }

    public final long n() {
        return ((Long) n.c()).longValue();
    }

    public final boolean o() {
        return ((Boolean) o.c()).booleanValue();
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

    public final boolean t() {
        return ((Boolean) t.c()).booleanValue();
    }

    public final boolean u() {
        return ((Boolean) u.c()).booleanValue();
    }

    public final boolean v() {
        return ((Boolean) v.c()).booleanValue();
    }

    public final boolean w() {
        return ((Boolean) w.c()).booleanValue();
    }

    public final long x() {
        return ((Long) x.c()).longValue();
    }

    public final long y() {
        return ((Long) y.c()).longValue();
    }

    public final long z() {
        return ((Long) z.c()).longValue();
    }
}
