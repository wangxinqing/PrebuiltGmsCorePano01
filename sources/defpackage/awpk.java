package defpackage;

/* renamed from: awpk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpk implements awpj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        a = agvx.a(agvw, "auth_enable_policy_compliance_check_for_gmail", false);
        agvx.a(agvw, "auth_enable_policy_compliance_check_for_third_party", false);
        b = agvx.a(agvw, "auth_enable_security_exception_mitigation", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
