package defpackage;

/* renamed from: awyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awyy implements awyx {
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
    public static final agvx P;
    public static final agvx Q;
    public static final agvx R;
    public static final agvx S;
    public static final agvx T;
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
        agvw b2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:devicedoctor:").b();
        a = agvx.a(b2, "DeviceDoctor__delete_files_enabled", true);
        b = agvx.a(b2, "DeviceDoctor__deletefiles_blacklist", "");
        c = agvx.a(b2, "DeviceDoctor__deletefiles_list", "");
        d = agvx.a(b2, "DeviceDoctor__devicedoctor_enabled", true);
        e = agvx.a(b2, "DeviceDoctor__disable_modules_enabled", true);
        f = agvx.a(b2, "DeviceDoctor__disabled_modules_list", "");
        agvx.a(b2, "DeviceDoctor__early_update_auth_rollback_enabled", false);
        g = agvx.a(b2, "DeviceDoctor__enable_fixer_log_sampling", false);
        h = agvx.a(b2, "DeviceDoctor__enable_process_stable_feature_flag_read", false);
        i = agvx.a(b2, "DeviceDoctor__enable_set_phenotype_context", true);
        j = agvx.a(b2, "DeviceDoctor__fixer_framework_enabled", true);
        k = agvx.a(b2, "DeviceDoctor__fixer_framework_mendel_packages", "com.google.android.gms");
        l = agvx.a(b2, "DeviceDoctor__fixer_framework_on_phenotype_committed_enabled", true);
        m = agvx.a(b2, "DeviceDoctor__fixer_framework_seconds_non_complete_fix_is_valid", 3600);
        n = agvx.a(b2, "DeviceDoctor__log_empty_fixes", false);
        o = agvx.a(b2, "DeviceDoctor__log_fixes", true);
        p = agvx.a(b2, "DeviceDoctor__log_open_file_descriptors_on_crash", false);
        q = agvx.a(b2, "DeviceDoctor__max_deleteFiles", 100);
        r = agvx.a(b2, "DeviceDoctor__max_deleteFilesRecursion", 20);
        s = agvx.a(b2, "DeviceDoctor__max_fixer_sampling_rate", 1.0d);
        t = agvx.a(b2, "DeviceDoctor__phenotype_fallback_blacklist", "com.google.android.gms");
        agvx.a(b2, "DeviceDoctor__phenotype_fallback_crash_threshold", 3);
        u = agvx.a(b2, "DeviceDoctor__phenotype_fallback_dryrun", true);
        v = agvx.a(b2, "DeviceDoctor__phenotype_fallback_enabled", false);
        w = agvx.a(b2, "DeviceDoctor__process_results_already_done_fixes_enabled", false);
        x = agvx.a(b2, "DeviceDoctor__process_stable_checkin_log_sampling_rate", 1.0E-5d);
        y = agvx.a(b2, "DeviceDoctor__register_core_fixers_once", false);
        agvx.a(b2, "DeviceDoctor__report_as_crash_and_restart_fix_enabled", true);
        agvx.a(b2, "DeviceDoctor__report_as_crash_and_restart_fix_seconds_fix_valid", 3600);
        z = agvx.a(b2, "DeviceDoctor__report_crash_fix_enabled", true);
        A = agvx.a(b2, "DeviceDoctor__report_crash_fix_seconds_fix_valid", 600);
        B = agvx.a(b2, "DeviceDoctor__restart_process_fix_enabled", true);
        C = agvx.a(b2, "DeviceDoctor__restart_process_fix_seconds_fix_valid", 3600);
        D = agvx.a(b2, "DeviceDoctor__restart_process_when_requested_by_fix", false);
        E = agvx.a(b2, "DeviceDoctor__restart_timeout_seconds", 600);
        F = agvx.a(b2, "DeviceDoctor__safeboot_checkin_server_url", "https://android.clients.google.com/checkin");
        G = agvx.a(b2, "DeviceDoctor__safeboot_clearcut_sos_connection_timeout_millis", 60000);
        H = agvx.a(b2, "DeviceDoctor__safeboot_clearcut_sos_debug_allow_http", false);
        I = agvx.a(b2, "DeviceDoctor__safeboot_clearcut_sos_read_timeout_millis", 60000);
        J = agvx.a(b2, "DeviceDoctor__safeboot_clearcut_sos_server_url", "https://play.googleapis.com/log");
        K = agvx.a(b2, "DeviceDoctor__safeboot_crash_loop_frequency_per_hour", 10.0d);
        L = agvx.a(b2, "DeviceDoctor__safeboot_crash_threshold", 5);
        M = agvx.a(b2, "DeviceDoctor__safeboot_timeout_millis", 540000);
        N = agvx.a(b2, "DeviceDoctor__shush_crash_force_popup_probability", 0.0d);
        O = agvx.a(b2, "DeviceDoctor__shush_crash_whitelist", "");
        P = agvx.a(b2, "DeviceDoctor__shush_enabled", true);
        Q = agvx.a(b2, "DeviceDoctor__teledoctor_NoFix", 0);
        R = agvx.a(b2, "DeviceDoctor__teledoctor_deleteFiles", 0);
        S = agvx.a(b2, "DeviceDoctor__teledoctor_disableModules", 0);
        T = agvx.a(b2, "DeviceDoctor__teledoctor_phenotype_fallback", 0);
    }

    public final long A() {
        return ((Long) A.c()).longValue();
    }

    public final boolean B() {
        return ((Boolean) B.c()).booleanValue();
    }

    public final long C() {
        return ((Long) C.c()).longValue();
    }

    public final boolean D() {
        return ((Boolean) D.c()).booleanValue();
    }

    public final long E() {
        return ((Long) E.c()).longValue();
    }

    public final String F() {
        return (String) F.c();
    }

    public final long G() {
        return ((Long) G.c()).longValue();
    }

    public final boolean H() {
        return ((Boolean) H.c()).booleanValue();
    }

    public final long I() {
        return ((Long) I.c()).longValue();
    }

    public final String J() {
        return (String) J.c();
    }

    public final double K() {
        return ((Double) K.c()).doubleValue();
    }

    public final long L() {
        return ((Long) L.c()).longValue();
    }

    public final long M() {
        return ((Long) M.c()).longValue();
    }

    public final double N() {
        return ((Double) N.c()).doubleValue();
    }

    public final String O() {
        return (String) O.c();
    }

    public final boolean P() {
        return ((Boolean) P.c()).booleanValue();
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
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

    public final String f() {
        return (String) f.c();
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

    public final String k() {
        return (String) k.c();
    }

    public final boolean l() {
        return ((Boolean) l.c()).booleanValue();
    }

    public final long m() {
        return ((Long) m.c()).longValue();
    }

    public final boolean n() {
        return ((Boolean) n.c()).booleanValue();
    }

    public final boolean o() {
        return ((Boolean) o.c()).booleanValue();
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

    public final double s() {
        return ((Double) s.c()).doubleValue();
    }

    public final String t() {
        return (String) t.c();
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

    public final double x() {
        return ((Double) x.c()).doubleValue();
    }

    public final boolean y() {
        return ((Boolean) y.c()).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) z.c()).booleanValue();
    }
}
