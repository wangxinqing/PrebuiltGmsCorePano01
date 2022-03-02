package defpackage;

/* renamed from: awze  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awze implements awzd {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw("direct_boot:gms_chimera_phenotype_flags").a("gms:common:");
        a = agvx.a(a2, "FilePermission__reset_non_whitelisted_global_dirs_permission", false);
        b = agvx.a(a2, "FilePermission__whitelisted_global_dirs", "shared_prefs");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
