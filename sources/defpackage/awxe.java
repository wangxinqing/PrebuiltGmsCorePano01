package defpackage;

/* renamed from: awxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awxe implements awxd {
    public static final agvx a;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        agvx.a(a2, "ApiCounter__collect_gcore_dimensions", false);
        a = agvx.a(a2, "ApiCounter__enable_api_counter", false);
        agvx.a(a2, "ApiCounter__sampling_rate", 1.0d);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }
}
