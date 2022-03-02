package defpackage;

/* renamed from: awlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awlo implements awln {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.auth_account")).b();
        a = agvx.a(b2, "auth_do_commit_to_configurations", false);
        b = agvx.a(b2, "auth_pre_add_account_phenotype_timeout", 10000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
