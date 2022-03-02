package defpackage;

/* renamed from: awyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awyj implements awyi {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:common:analytics:");
        a = agvx.a(a2, "CommonAnalytics__system_health_log_post_chimera_update_enabled", true);
        b = agvx.a(a2, "CommonAnalytics__system_health_log_post_gms_core_update_enabled", true);
        c = agvx.a(a2, "CommonAnalytics__system_health_log_post_gservice_update_enabled", true);
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
