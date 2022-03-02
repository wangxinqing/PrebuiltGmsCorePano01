package defpackage;

/* renamed from: azbv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azbv implements azbu {
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
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "fencing_apis_require_background_permission", false);
        b = agvx.a(agvw, "placefencing_allow_personalized_placefences", true);
        c = agvx.a(agvw, "placefencing_max_rank_balanced_recall_precision", 5);
        d = agvx.a(agvw, "placefencing_max_rank_high_precision", 3);
        e = agvx.a(agvw, "placefencing_max_rank_high_recall", 20);
        f = agvx.a(agvw, "placefencing_max_rank_highest_precision", 1);
        g = agvx.a(agvw, "placefencing_minimum_likelihood_balanced_recall_precision", 0.05d);
        h = agvx.a(agvw, "placefencing_minimum_likelihood_high_precision", 0.2d);
        i = agvx.a(agvw, "placefencing_minimum_likelihood_high_recall", 0.01d);
        j = agvx.a(agvw, "placefencing_minimum_likelihood_highest_precision", 0.5d);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final double g() {
        return ((Double) g.c()).doubleValue();
    }

    public final double h() {
        return ((Double) h.c()).doubleValue();
    }

    public final double i() {
        return ((Double) i.c()).doubleValue();
    }

    public final double j() {
        return ((Double) j.c()).doubleValue();
    }
}
