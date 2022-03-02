package defpackage;

/* renamed from: awms  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awms implements awmr {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_account"));
        a = agvx.a(agvw, "enable_supervised_account_intent_operation", false);
        b = agvx.a(agvw, "enable_token_refresh_on_container_update", false);
        c = agvx.a(agvw, "supervised_account_on_install_whitelist", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
    }
}
