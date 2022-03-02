package defpackage;

/* renamed from: azwo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azwo implements azwm {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        a = agvx.a(a2, "default_pull_packages", "");
        try {
            b = agvx.a(a2, "pull_atom_packages_list", (bce) aucj.a((aucj) bce.b, new byte[0]), azwn.a);
            c = agvx.a(a2, "is_phenotype_flags", false);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"pull_atom_packages_list\"");
        }
    }

    public final String a() {
        return (String) a.c();
    }

    public final bce b() {
        return (bce) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }
}
