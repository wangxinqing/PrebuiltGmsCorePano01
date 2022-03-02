package defpackage;

/* renamed from: axob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axob implements axoa {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__enable_minimal_help_response_for_unified_rendering_api_request", true);
        agvx.a(a2, "AndroidGoogleHelp__enable_rendering_api_email_form", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_rendering_api_email_form_whitelist", "");
        b = agvx.a(a2, "AndroidGoogleHelp__enable_rendering_api_search_results", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_rendering_api_search_results_blacklist", "com.google.android.libraries.inapphelp.testapp,com.google.android.apps.subscriptions.red");
        agvx.a(a2, "AndroidGoogleHelp__enable_rendering_api_search_results_whitelist", "");
        agvx.a(a2, "AndroidGoogleHelp__enable_unified_rendering_api_request", true);
        c = agvx.a(a2, "AndroidGoogleHelp__rendering_api_click_to_call_form_enabled", false);
        d = agvx.a(a2, "AndroidGoogleHelp__rendering_api_click_to_call_package_whitelist", "");
        e = agvx.a(a2, "AndroidGoogleHelp__rendering_api_overall_request_timeout_seconds", 40);
        agvx.a(a2, "AndroidGoogleHelp__rendering_api_search_results_whitelist", "");
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

    public final String d() {
        return (String) d.c();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }
}
