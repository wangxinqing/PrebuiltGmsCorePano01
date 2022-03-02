package defpackage;

/* renamed from: axfe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axfe implements axfd {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "droidguard_enable_local_apk_signature_verification_in_client", true);
        b = agvx.a(agvw, "droidguard_enable_local_apk_signature_verification_in_module", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
