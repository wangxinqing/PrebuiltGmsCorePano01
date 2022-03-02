package defpackage;

/* renamed from: awpt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awpt implements awps {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.auth_managed"));
        a = agvx.a(agvw, "auth_managed_enable_sync_auth_app_info", false);
        b = agvx.a(agvw, "auth_managed_enable_sync_auth_log_events", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
