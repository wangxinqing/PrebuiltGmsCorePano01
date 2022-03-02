package defpackage;

/* renamed from: awmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awmm implements awml {
    public static final agvx a;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.auth_account")).a();
        agvx.a(a2, "auth_lookup_account_state_url", "https://android.clients.google.com/auth/lookup/account_state?rt=b");
        agvx.a(a2, "auth_checkname_servlet_path", "https://android.clients.google.com/setup/checkname");
        agvx.a(a2, "auth_factory_reset_protection_validation_url", "https://android.clients.google.com/auth/frp/validation");
        a = agvx.a(a2, "auth_fetch_managing_app_for_user_url", "https://android.clients.google.com/auth/enterprise/fetch_managing_app_for_user?rt=b");
        agvx.a(a2, "auth_reauth_settings_url", "https://android.clients.google.com/auth/reauthsettings");
        agvx.a(a2, "auth_servlet_path", "https://android.clients.google.com/auth");
        agvx.a(a2, "auth_setup_servlet_path", "https://android.clients.google.com/setup");
        agvx.a(a2, "auth_verify_pin_url", "https://android.clients.google.com/auth/verifypin");
    }

    public final String a() {
        return (String) a.c();
    }
}
