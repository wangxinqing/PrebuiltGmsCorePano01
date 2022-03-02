package defpackage;

/* renamed from: axoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axoq implements axop {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__do_not_reset_toolbar_scroll_flags_on_help_action_click", false);
        b = agvx.a(a2, "AndroidGoogleHelp__fix_chat_persistence_util_npe", false);
        agvx.a(a2, "AndroidGoogleHelp__fix_cronet_no_data_npe", false);
        c = agvx.a(a2, "AndroidGoogleHelp__fix_open_to_search_results_back_button", false);
        agvx.a(a2, "AndroidGoogleHelp__make_setting_action_dialog_scrollable", false);
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
