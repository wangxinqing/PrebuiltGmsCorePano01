package defpackage;

/* renamed from: azdp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azdp implements azdo {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.recaptcha")).a();
        agvx.a(a2, "enable_recaptcha_v3", false);
        a = agvx.a(a2, "enable_recaptcha_v3_tv", false);
        b = agvx.a(a2, "enable_verify_with_recaptcha_v2_internal", false);
        agvx.a(a2, "use_alternative_api_for_26", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
