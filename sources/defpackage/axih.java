package defpackage;

/* renamed from: axih  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axih implements axig {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.firebase.auth"));
        a = agvx.a(agvw, "MultiFactorAuthFeature__enable_multi_factor_auth", true);
        b = agvx.a(agvw, "multi_factor_auth_base_url", "https://identitytoolkit.googleapis.com/v2/accounts");
        c = agvx.a(agvw, "multi_factor_auth_min_sdk_version", "19.3.0");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
