package defpackage;

/* renamed from: fvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fvx {
    public static final agvx a;
    public static final agvx b = agvx.a(f, "plus.oauth_server_api_path", "/o/oauth2");
    public static final agvx c = agvx.a(f, "google_sign_in_events", true);
    public static final agvx d = agvx.a(f, "auth_google_sign_in_api_silent_signin_time_out_in_seconds", 10);
    public static final agvx e = agvx.a(f, "gms:google_sign_in_enable_games_scope_swapping", true);
    private static final agvw f;

    static {
        agvw agvw = new agvw(yef.a("com.google.android.gms.auth.api.signin"));
        f = agvw;
        a = agvx.a(agvw, "plus.oauth_server_url", "https://accounts.google.com");
        agvx.a(f, "auth_google_sign_in_api_save_to_yolo_explicit_sign_in", false);
        agvx.a(f, "auth_google_sign_in_api_save_to_yolo_silent_sign_in", false);
        agvx.a(f, "auth_google_sign_in_api_save_credentials_connection_time_out_in_seconds", 1);
        agvx.a(f, "auth_google_sign_in_api_save_credentials_save_time_out_in_seconds", 10);
        agvx.a(f, "gms:google_sign_in_enable_setting_games_greeting", true);
    }
}
