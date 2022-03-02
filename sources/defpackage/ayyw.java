package defpackage;

/* renamed from: ayyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayyw implements ayyv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw b2 = new agvw("direct_boot:com.google.android.gms.phenotype").a("gms:phenotype:").b();
        a = agvx.a(b2, "MultiOauth__catch_all_auth_errors", true);
        b = agvx.a(b2, "MultiOauth__enable_keep_account_order", true);
        agvx.a(b2, "enable_multi_accounts_auth", false);
        c = agvx.a(b2, "MultiOauth__enable_request_batching", false);
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
