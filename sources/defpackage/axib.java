package defpackage;

/* renamed from: axib  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axib implements axia {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.firebase.auth"));
        a = agvx.a(agvw, "GenericIdpErrorFeature__return_idp_credential_on_error", true);
        b = agvx.a(agvw, "return_idp_credential_on_error_min_sdk_version", "16.2.1");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
