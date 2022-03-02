package defpackage;

/* renamed from: fdj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fdj {
    public static final agvx a;
    public static final agvx b = agvx.a(g, "server_path", "/credentials/v1");
    public static final agvx c = agvx.a(g, "apiary_trace", "");
    public static final agvx d = agvx.a(g, "server_scope", "https://www.googleapis.com/auth/login_manager");
    public static final agvx e = agvx.a(g, "help_url", "https://support.google.com/accounts/?p=smartlock");
    public static final agvx f = agvx.a(g, "log_ui_events", false);
    private static final agvw g;

    static {
        agvw a2 = new agvw(yef.a("com.google.android.gms.auth.api.credentials")).a("auth_credentials_api_");
        g = a2;
        a = agvx.a(a2, "server_url", "https://www.googleapis.com");
    }
}
