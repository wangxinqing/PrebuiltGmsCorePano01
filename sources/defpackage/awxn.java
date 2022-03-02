package defpackage;

/* renamed from: awxn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awxn implements awxm {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw b2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:bug116753498:").b();
        a = agvx.a(b2, "Bug116753498__generic_suppress_enabled", true);
        b = agvx.a(b2, "Bug116753498__nlp_suppress_enabled", true);
        agvx.a(b2, "Bug116753498__suppressEnabled", false);
        c = agvx.a(b2, "Bug116753498__suppress_crash_probability", 1.0d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final double c() {
        return ((Double) c.c()).doubleValue();
    }
}
