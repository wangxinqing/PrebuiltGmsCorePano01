package defpackage;

/* renamed from: awhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awhq implements awhp {
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
        agvw agvw = new agvw(agvj.a("com.google.android.gms.analytics"));
        a = agvx.a(agvw, "analytics.batch_retry_interval.seconds.k", 3600);
        b = agvx.a(agvw, "analytics.batching_endpoint", "/batch");
        c = agvx.a(agvw, "analytics.batching_strategy.k", "BATCH_BY_BRUTE_FORCE");
        d = agvx.a(agvw, "analytics.campaigns.time_limit", 86400000);
        e = agvx.a(agvw, "analytics.compression_strategy.k", "GZIP");
        f = agvx.a(agvw, "analytics.dispatch_alarm_millis", 7200000);
        g = agvx.a(agvw, "analytics.gcm_task_service", false);
        h = agvx.a(agvw, "analytics.fallback_responses.k", "404,502");
        i = agvx.a(agvw, "analytics.first_party_experiment_id", "");
        j = agvx.a(agvw, "analytics.first_party_experiment_variant", 0);
        k = agvx.a(agvw, "analytics.http_connection.connect_timeout_millis", 60000);
        l = agvx.a(agvw, "analytics.http_connection.read_timeout_millis", 61000);
        m = agvx.a(agvw, "analytics.initial_local_dispatch_millis", 5000);
        n = agvx.a(agvw, "analytics.initialization_warning_threshold", 5000);
        o = agvx.a(agvw, "analytics.insecure_host", "http://www.google-analytics.com");
        p = agvx.a(agvw, "analytics.local_dispatch_millis", 120000);
        q = agvx.a(agvw, "analytics.log_tag", "GAv4-SVC");
        r = agvx.a(agvw, "analytics.max_batch_post_length", 8192);
        s = agvx.a(agvw, "analytics.max_dispatch_alarm_millis", 32400000);
        t = agvx.a(agvw, "analytics.max_get_length", 2036);
        u = agvx.a(agvw, "analytics.max_hit_length.k", 8192);
        v = agvx.a(agvw, "analytics.max_hits_per_batch", 20);
        w = agvx.a(agvw, "analytics.max_hits_per_dispatch", 20);
        x = agvx.a(agvw, "analytics.max_hits_per_request.k", 20);
        y = agvx.a(agvw, "analytics.max_local_dispatch_millis", 7200000);
        z = agvx.a(agvw, "analytics.max_post_length.k", 8192);
        A = agvx.a(agvw, "analytics.max_stored_hits", 20000);
        B = agvx.a(agvw, "analytics.max_stored_hits_per_app", 2000);
        C = agvx.a(agvw, "analytics.max_stored_properties_per_app", 100);
        D = agvx.a(agvw, "analytics.max_tokens", 60);
        E = agvx.a(agvw, "analytics.min_local_dispatch_millis", 120000);
        F = agvx.a(agvw, "analytics.monitoring.sample_period_millis", 86400000);
        G = agvx.a(agvw, "analytics.secure_host", "https://ssl.google-analytics.com");
        H = agvx.a(agvw, "analytics.service_client_enabled", true);
        I = agvx.a(agvw, "analytics.service_client.connect_timeout_millis", 5000);
        J = agvx.a(agvw, "analytics.service_enabled", true);
        K = agvx.a(agvw, "analytics.service_client.idle_disconnect_millis", 10000);
        L = agvx.a(agvw, "analytics.service_monitor_interval", 86400000);
        M = agvx.a(agvw, "analytics.service_client.reconnect_throttle_millis", 1800000);
        N = agvx.a(agvw, "analytics.service_client.second_connect_delay_millis", 5000);
        O = agvx.a(agvw, "analytics.service_client.unexpected_reconnect_millis", 60000);
        P = agvx.a(agvw, "analytics.simple_endpoint", "/collect");
        Q = agvx.a(agvw, "analytics.tokens_per_sec", 0.5d);
    }

    public final long A() {
        return ((Long) A.c()).longValue();
    }

    public final long B() {
        return ((Long) B.c()).longValue();
    }

    public final long C() {
        return ((Long) C.c()).longValue();
    }

    public final long D() {
        return ((Long) D.c()).longValue();
    }

    public final long E() {
        return ((Long) E.c()).longValue();
    }

    public final long F() {
        return ((Long) F.c()).longValue();
    }

    public final String G() {
        return (String) G.c();
    }

    public final boolean H() {
        return ((Boolean) H.c()).booleanValue();
    }

    public final long I() {
        return ((Long) I.c()).longValue();
    }

    public final boolean J() {
        return ((Boolean) J.c()).booleanValue();
    }

    public final long K() {
        return ((Long) K.c()).longValue();
    }

    public final long L() {
        return ((Long) L.c()).longValue();
    }

    public final long M() {
        return ((Long) M.c()).longValue();
    }

    public final long N() {
        return ((Long) N.c()).longValue();
    }

    public final long O() {
        return ((Long) O.c()).longValue();
    }

    public final String P() {
        return (String) P.c();
    }

    public final double Q() {
        return ((Double) Q.c()).doubleValue();
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final String b() {
        return (String) b.c();
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

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final boolean g() {
        return ((Boolean) g.c()).booleanValue();
    }

    public final String h() {
        return (String) h.c();
    }

    public final String i() {
        return (String) i.c();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
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

    public final String o() {
        return (String) o.c();
    }

    public final long p() {
        return ((Long) p.c()).longValue();
    }

    public final String q() {
        return (String) q.c();
    }

    public final long r() {
        return ((Long) r.c()).longValue();
    }

    public final long s() {
        return ((Long) s.c()).longValue();
    }

    public final long t() {
        return ((Long) t.c()).longValue();
    }

    public final long u() {
        return ((Long) u.c()).longValue();
    }

    public final long v() {
        return ((Long) v.c()).longValue();
    }

    public final long w() {
        return ((Long) w.c()).longValue();
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
