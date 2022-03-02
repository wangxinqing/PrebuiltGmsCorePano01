package defpackage;

/* renamed from: awzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzq implements awzp {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a();
        a = agvx.a(a2, "GoogleCertificatesFlags__enable_debug_certificates", false);
        b = agvx.a(a2, "GoogleCertificatesFlags__remove_ia_supervisor_from_1p_apps", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
