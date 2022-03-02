package defpackage;

/* renamed from: axnt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axnt implements axns {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__share_help_articles", true);
        b = agvx.a(a2, "AndroidGoogleHelp__share_help_articles_blacklist", "");
        c = agvx.a(a2, "AndroidGoogleHelp__share_help_articles_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
