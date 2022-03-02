package defpackage;

/* renamed from: ayup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayup implements ayuo {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_catch_null_pointer_logging_enabled", true);
        b = agvx.a(agvw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_latency_logging_enabled", false);
        c = agvx.a(agvw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_silent_feedback_enabled", false);
        d = agvx.a(agvw, "MenagerieBaseBundleApisLogging__menagerie_base_bundle_silent_feedback_sample_rate", 1.0E-5d);
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

    public final double d() {
        return ((Double) d.c()).doubleValue();
    }
}
