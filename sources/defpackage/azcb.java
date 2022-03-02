package defpackage;

/* renamed from: azcb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azcb implements azca {
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

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "enable_hierarchical_scoring", true);
        b = agvx.a(agvw, "force_new_segment_after_seconds", -1);
        c = agvx.a(agvw, "max_activity_staleness_time_millis", 120000);
        d = agvx.a(agvw, "max_probable_clusters", 5);
        e = agvx.a(agvw, "max_speed_for_at_place_meters_per_second", 2.0d);
        f = agvx.a(agvw, "maximum_cluster_radius_meters", 18.0d);
        g = agvx.a(agvw, "maximum_segmentation_signal_staleness_millis", 300000);
        h = agvx.a(agvw, "min_duration_since_at_place_to_be_in_transit_millis", 120000);
        i = agvx.a(agvw, "min_time_spent_in_cluster_to_be_at_place_millis", 180000);
        j = agvx.a(agvw, "num_candidates_for_second_pass", 100);
        k = agvx.a(agvw, "place_inference_at_place_only", false);
        l = agvx.a(agvw, "place_inference_module_black_list", "");
        m = agvx.a(agvw, "place_inference_result_update_should_always_trigger", false);
        n = agvx.a(agvw, "enable_personalized_inference", true);
        o = agvx.a(agvw, "include_place_inference_debug_data", false);
        p = agvx.a(agvw, "report_check_ins_to_server", false);
        q = agvx.a(agvw, "send_check_in_inferences", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }

    public final double f() {
        return ((Double) f.c()).doubleValue();
    }

    public final long g() {
        return ((Long) g.c()).longValue();
    }

    public final long h() {
        return ((Long) h.c()).longValue();
    }

    public final long i() {
        return ((Long) i.c()).longValue();
    }

    public final long j() {
        return ((Long) j.c()).longValue();
    }

    public final boolean k() {
        return ((Boolean) k.c()).booleanValue();
    }

    public final String l() {
        return (String) l.c();
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
}
