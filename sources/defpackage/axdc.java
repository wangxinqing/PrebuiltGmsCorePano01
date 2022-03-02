package defpackage;

/* renamed from: axdc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdc implements axdb {
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
    public static final agvx U;
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
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a();
        agvx.a(a2, "Tracing__aggregates_period_seconds", 600);
        agvx.a(a2, "Tracing__context_wrap_application_context", false);
        a = agvx.a(a2, "Tracing__context_wrap_chimera", false);
        b = agvx.a(a2, "Tracing__context_wrap_related", false);
        c = agvx.a(a2, "Tracing__cpu_sample_rate_per_thousand", 1);
        d = agvx.a(a2, "Tracing__disable_broadcast_support_propagation", true);
        agvx.a(a2, "Tracing__enable_aggregates_logging", false);
        e = agvx.a(a2, "Tracing__enable_backup_agent_tracing", true);
        f = agvx.a(a2, "Tracing__enable_bind_service_tracing", false);
        g = agvx.a(a2, "Tracing__enable_binder_wrapper_for_bound_service", true);
        agvx.a(a2, "Tracing__enable_calling_force_aggregates_logging", true);
        h = agvx.a(a2, "Tracing__enable_connection_callback_propagation", true);
        i = agvx.a(a2, "Tracing__enable_content_provider_attribution2", false);
        agvx.a(a2, "Tracing__enable_cross_process_attribution", false);
        j = agvx.a(a2, "Tracing__enable_cross_process_attribution_through_intents", false);
        k = agvx.a(a2, "Tracing__enable_implicit_cross_process", false);
        l = agvx.a(a2, "Tracing__enable_intent_operation_tracing", true);
        m = agvx.a(a2, "Tracing__enable_on_start_tracing", false);
        agvx.a(a2, "Tracing__enable_punch_clock_handler", true);
        agvx.a(a2, "Tracing__enable_punch_clock_handler_stash_bundle", true);
        n = agvx.a(a2, "Tracing__enable_runtime_receivers_use_intent_hash", true);
        o = agvx.a(a2, "Tracing__enable_sensor_event_listener_tracing", false);
        p = agvx.a(a2, "Tracing__enable_slice_provider_tracing", true);
        q = agvx.a(a2, "Tracing__enable_sqlite_open_helper", false);
        r = agvx.a(a2, "Tracing__enable_sqlite_open_helper_on_open", false);
        s = agvx.a(a2, "Tracing__enable_start_rate_reporting", true);
        t = agvx.a(a2, "Tracing__enable_task_propagation", true);
        u = agvx.a(a2, "Tracing__enable_throw_exception_when_double_bind", false);
        v = agvx.a(a2, "Tracing__enable_tracing", false);
        w = agvx.a(a2, "Tracing__enable_tracing_location_listener", true);
        x = agvx.a(a2, "Tracing__enable_tracing_service_connection_with_original_trace", false);
        y = agvx.a(a2, "Tracing__enable_tracing_uptime2", false);
        z = agvx.a(a2, "Tracing__enable_transaction_interceptor", true);
        A = agvx.a(a2, "Tracing__enable_volley_request_tracking", true);
        B = agvx.a(a2, "Tracing__enable_volley_tracing_propagation", true);
        C = agvx.a(a2, "Tracing__enable_wake_lock_spans", true);
        D = agvx.a(a2, "Tracing__expensive_trace_logging", false);
        E = agvx.a(a2, "Tracing__expensive_trace_warn_count", 1000);
        F = agvx.a(a2, "Tracing__expensive_trace_warn_cpu_ms", 10000);
        G = agvx.a(a2, "Tracing__gcore_client_cache_size", 50);
        H = agvx.a(a2, "Tracing__high_frequency_tracing_duration", 60);
        I = agvx.a(a2, "Tracing__include_intent_hash", false);
        J = agvx.a(a2, "Tracing__lightweight_monitor_enabled", false);
        K = agvx.a(a2, "Tracing__lightweight_sample_duration_ms", 5000);
        L = agvx.a(a2, "Tracing__lightweight_sample_quotient", 200);
        M = agvx.a(a2, "Tracing__lightweight_throttle_sec", 1);
        agvx.a(a2, "Tracing__log_missing_traces", false);
        N = agvx.a(a2, "Tracing__min_schedule_time_for_new_trace_ms", 1000);
        O = agvx.a(a2, "Tracing__monitor_device_state", false);
        P = agvx.a(a2, "Tracing__populate_gcore_dimensions", true);
        Q = agvx.a(a2, "Tracing__punch_clock_handler_recycling_pool_size", 50);
        R = agvx.a(a2, "Tracing__random_initialization_modulus", 1);
        S = agvx.a(a2, "Tracing__reserve_phantom_thread", false);
        T = agvx.a(a2, "Tracing__set_not_dominant_providence", true);
        agvx.a(a2, "Tracing__swallow_bundle_exceptions", false);
        U = agvx.a(a2, "Tracing__use_binder_wrapper_for_providence", true);
    }

    public final boolean A() {
        return ((Boolean) B.c()).booleanValue();
    }

    public final boolean B() {
        return ((Boolean) C.c()).booleanValue();
    }

    public final boolean C() {
        return ((Boolean) D.c()).booleanValue();
    }

    public final long D() {
        return ((Long) E.c()).longValue();
    }

    public final long E() {
        return ((Long) F.c()).longValue();
    }

    public final long F() {
        return ((Long) G.c()).longValue();
    }

    public final long G() {
        return ((Long) H.c()).longValue();
    }

    public final boolean H() {
        return ((Boolean) I.c()).booleanValue();
    }

    public final boolean I() {
        return ((Boolean) J.c()).booleanValue();
    }

    public final long J() {
        return ((Long) K.c()).longValue();
    }

    public final long K() {
        return ((Long) L.c()).longValue();
    }

    public final long L() {
        return ((Long) M.c()).longValue();
    }

    public final long M() {
        return ((Long) N.c()).longValue();
    }

    public final boolean N() {
        return ((Boolean) O.c()).booleanValue();
    }

    public final boolean O() {
        return ((Boolean) P.c()).booleanValue();
    }

    public final long P() {
        return ((Long) Q.c()).longValue();
    }

    public final long Q() {
        return ((Long) R.c()).longValue();
    }

    public final boolean R() {
        return ((Boolean) S.c()).booleanValue();
    }

    public final boolean S() {
        return ((Boolean) T.c()).booleanValue();
    }

    public final boolean T() {
        return ((Boolean) U.c()).booleanValue();
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

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }

    public final boolean l() {
        return ((Boolean) l.c()).booleanValue();
    }

    public final boolean m() {
        return ((Boolean) m.c()).booleanValue();
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
        return ((Boolean) x.c()).booleanValue();
    }

    public final boolean x() {
        return ((Boolean) y.c()).booleanValue();
    }

    public final boolean y() {
        return ((Boolean) z.c()).booleanValue();
    }

    public final boolean z() {
        return ((Boolean) A.c()).booleanValue();
    }
}
