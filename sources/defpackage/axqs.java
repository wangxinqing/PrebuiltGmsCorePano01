package defpackage;

/* renamed from: axqs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axqs implements axqr {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__check_null_app_package_name_before_override", false);
        b = agvx.a(a2, "AndroidGoogleHelp__set_highlighted_text_color_for_chat_messages", false);
        c = agvx.a(a2, "AndroidGoogleHelp__use_app_package_name_override_for_configs", false);
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
