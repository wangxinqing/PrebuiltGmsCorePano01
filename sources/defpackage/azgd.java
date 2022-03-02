package defpackage;

/* renamed from: azgd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azgd implements azgc {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.signin"));
        a = agvx.a(agvw, "AccountPickerFirstPartyPpAndTosUrls__privacyPolicyURLValue", "https://policies.google.com/privacy");
        b = agvx.a(agvw, "AccountPickerFirstPartyPpAndTosUrls__termsOfServiceURLValue", "https://policies.google.com/terms");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }
}
