package defpackage;

/* renamed from: azao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azao implements azan {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        a = agvx.a(a2, "UsePackageConfig__enable_auto_subpackage", true);
        b = agvx.a(a2, "UsePackageConfig__enable_experiment_injection", true);
        c = agvx.a(a2, "UsePackageConfig__enable_logging_config", true);
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
}
