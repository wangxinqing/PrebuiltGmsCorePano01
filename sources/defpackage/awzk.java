package defpackage;

/* renamed from: awzk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzk implements awzj {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:chimera:");
        a = agvx.a(a2, "GmsApiService__enable_deferred_binder", true);
        b = agvx.a(a2, "GmsApiService__missing_api_action_blacklist", "");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
