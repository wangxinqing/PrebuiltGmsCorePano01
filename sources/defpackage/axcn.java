package defpackage;

/* renamed from: axcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axcn implements axcm {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a();
        a = agvx.a(a2, "ServiceVisibility__checkbox_only", false);
        b = agvx.a(a2, "ServiceVisibility__enable_dark_launch", false);
        c = agvx.a(a2, "ServiceVisibility__enable_full_launch", true);
        d = agvx.a(a2, "ServiceVisibility__packages_common_dark_launch", "");
        e = agvx.a(a2, "ServiceVisibility__sample_rate", 0.0d);
        f = agvx.a(a2, "ServiceVisibility__service_ids_common_full_launch", "124,29,130,167,38,139,28,50,25,43");
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

    public final double e() {
        return ((Double) e.c()).doubleValue();
    }

    public final String f() {
        return (String) f.c();
    }
}
