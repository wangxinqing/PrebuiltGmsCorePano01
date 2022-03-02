package defpackage;

/* renamed from: axpr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpr implements axpq {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        agvx.a(a2, "AndroidGoogleHelp__clear_help_config_ongoing_session_article_data", false);
        a = agvx.a(a2, "AndroidGoogleHelp__enable_browse_all_articles_view", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_promoted_content_v2_view", false);
        b = agvx.a(a2, "AndroidGoogleHelp__enable_unified_rendering_api_for_content_url", true);
        c = agvx.a(a2, "AndroidGoogleHelp__fix_toolbar_scroll_flags_npe", false);
        agvx.a(a2, "AndroidGoogleHelp__ignore_empty_psd_value", false);
        d = agvx.a(a2, "AndroidGoogleHelp__refactor_smart_journey_to_use_in_article_webview", true);
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

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
