package defpackage;

/* renamed from: axdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axdi implements axdh {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        a = agvx.a(a2, "enable_uncertified_device_check", true);
        b = agvx.a(a2, "UncertifiedDevice__generate_notification_in_preprocessor", false);
        c = agvx.a(a2, "uncertified_exceptions_whitelist", "130,151");
        d = agvx.a(a2, "uncertified_feature_exceptions_whitelist", "googlecertificates");
        e = agvx.a(a2, "uncertified_logging_sample_percentage", 0.01d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
    }

    public final String d() {
        return (String) d.c();
    }

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }
}
