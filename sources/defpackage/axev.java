package defpackage;

/* renamed from: axev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axev implements axeu {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.droidguard"));
        a = agvx.a(agvw, "enable_droidguard_based_widevine_provisioning", false);
        b = agvx.a(agvw, "enable_droidguard_fallback_widevine", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
