package defpackage;

/* renamed from: axot  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axot implements axos {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        agvx.a(a2, "AndroidGoogleHelp__enable_app_package_name_override", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_app_package_name_override_whitelist", "com.google.android.libraries.googlehelp.googlehelpapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms,com.google.android.gms.common.uxtester,com.android.settings,com.google.android.wearable.app,com.google.android.googlequicksearchbox,com.google.android.apps.subscriptions.red,com.google.android.apps.nbu.paisa.user.dev,com.google.android.apps.nbu.paisa.user.teamfood,com.google.android.apps.nbu.paisa.user.teamfood2,com.google.android.apps.nbu.paisa.user.dogfood,com.google.android.apps.nbu.paisa.user.qa,com.google.android.apps.nbu.paisa.user");
        agvx.a(a2, "AndroidGoogleHelp__enable_experimental_autocomplete_client_name_config_entry", false);
        a = agvx.a(a2, "AndroidGoogleHelp__enable_material_2_search_view", true);
        agvx.a(a2, "AndroidGoogleHelp__enable_material_2_send_button_selector", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link", false);
        agvx.a(a2, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link_blacklist", "");
        agvx.a(a2, "AndroidGoogleHelp__enable_privacy_policy_redirect_in_article_link_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
        agvx.a(a2, "AndroidGoogleHelp__set_soft_input_mode_in_Material2_chat_request_form", true);
        b = agvx.a(a2, "AndroidGoogleHelp__use_c2c_form_id_from_mojo", false);
        c = agvx.a(a2, "AndroidGoogleHelp__valid_privacy_policy_url_languages", "af,am,ar,as,az,be,bg,bn,bs,ca,cs,da,de,el,en,en-GB,es,es-419,es-US,et,eu,fa,fi,fil,fr,fr-CA,gl,gu,hi,hr,hu,hy,id,in,is,it,iw,ja,ka,kk,km,kn,ko,ky,lo,lt,lv,mk,ml,mn,mr,ms,my,nb,ne,nl,no,or,pa,pl,pt,pt-BR,pt-PT,ro,ru,si,sk,sl,sq,sr,sr-Latn,sv,sw,ta,te,th,tl,tr,uk,ur,uz,vi,zh,zh-CN,zh-HK,zh-TW,zu");
        d = agvx.a(a2, "AndroidGoogleHelp__valid_privacy_policy_urls", "https://www.google.com/policies/privacy,https://www.google.com/policies/privacy/,https://policies.google.com/privacy,https://policies.google.com/privacy/embedded,https://myaccount.google.com/privacypolicy");
        e = agvx.a(a2, "AndroidGoogleHelp__valid_privacy_policy_urls_with_language", "https://families.google.com/intl/%1$s/familylink/privacy/child-policy/,https://gsuite.google.com/intl/%1$s/terms/education_privacy.html,https://www.google.com/intl/%1$s/policies/privacy/");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final String c() {
        return (String) c.c();
    }

    public final String d() {
        return (String) d.c();
    }

    public final String e() {
        return (String) e.c();
    }
}
