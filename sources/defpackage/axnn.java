package defpackage;

/* renamed from: axnn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axnn implements axnm {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__prefetch_offline_help_content_app_package_name_white_list", "");
        b = agvx.a(a2, "AndroidGoogleHelp__should_prefetch_offline_help_content_periodically", false);
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
