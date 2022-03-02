package defpackage;

import android.os.SystemProperties;

/* renamed from: abdl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abdl {
    public static final agvx a;
    public static final agvx b = agvx.a(h, "enable_new_consent_flow", false);
    public static final agvx c = agvx.a(h, "valid_consent_url_pattern", String.format("^https:\\/\\/(accounts|gaiastaging)[\\w\\.\\-]*\\.(google\\.com|%s)\\/[\\d\\w\\/]+[\\/\\?]?", new Object[]{SystemProperties.get("gms.auth.sw_domain", "google.com").replace(".", "\\.")}));
    public static final agvx d = agvx.a(h, "client_auth_config_host", "clientauthconfig.googleapis.com");
    public static final agvx e = agvx.a(h, "client_auth_config_port", 443);
    public static final agvx f = agvx.a(h, "continue_with_account_picker_when_errors_encountered", true);
    public static final agvx g = agvx.a(h, "browser_consent_show_page_after_js_bridge_callback", true);
    private static final agvw h;

    static {
        agvw a2 = new agvw(yef.a("com.google.android.gms.signin")).a("google_sign_in_");
        h = a2;
        a = agvx.a(a2, "account_chip_disallowed_build_types", "");
    }
}
