package defpackage;

/* renamed from: ayyn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayyn implements ayyl {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:");
        try {
            a = agvx.a(a2, "DirectBoot__direct_boot_aware_packages", (auib) aucj.a((aucj) auib.b, new byte[]{10, 32, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 104, 101, 110, 111, 116, 121, 112, 101, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 103, 99, 109, 10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 97, 112, 112, 115, 46, 115, 99, 111, 110, 101, 10, 38, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 99, 108, 101, 97, 114, 99, 117, 116, 46, 112, 117, 98, 108, 105, 99, 10, 39, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 108, 97, 121, 108, 111, 103, 46, 117, 112, 108, 111, 97, 100, 101, 114}), ayym.a);
            b = agvx.a(a2, "DirectBoot__enable_direct_boot", true);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"DirectBoot__direct_boot_aware_packages\"");
        }
    }

    public final auib a() {
        return (auib) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
