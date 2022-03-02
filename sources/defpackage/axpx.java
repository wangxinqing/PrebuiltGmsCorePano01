package defpackage;

/* renamed from: axpx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpx implements axpw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        agvx.a(a2, "AndroidGoogleHelp__background_open_helprtc_activity_on_notification", false);
        agvx.a(a2, "AndroidGoogleHelp__cache_and_read_help_content_considering_theme", false);
        a = agvx.a(a2, "AndroidGoogleHelp__inject_correct_chat_survey_javascript", false);
        agvx.a(a2, "AndroidGoogleHelp__pass_extra_open_to_contact_option_to_ocarina", false);
        b = agvx.a(a2, "AndroidGoogleHelp__save_and_restore_chat_message_input_text", false);
        c = agvx.a(a2, "AndroidGoogleHelp__use_smart_journey_js_bridge", false);
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
