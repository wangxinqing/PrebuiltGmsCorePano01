package defpackage;

/* renamed from: axpl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpl implements axpk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__ocarina_redirect_app_package_name_blacklist", "com.google.android.apps.enterprise.cpanel");
        b = agvx.a(a2, "AndroidGoogleHelp__ocarina_redirect_app_package_name_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
        c = agvx.a(a2, "AndroidGoogleHelp__enable_ocarina_redirect", true);
        agvx.a(a2, "AndroidGoogleHelp__include_ocarina_specific_metrics", true);
        d = agvx.a(a2, "AndroidGoogleHelp__ocarina_redirect_max_bytes_in_intent", 300000);
        e = agvx.a(a2, "AndroidGoogleHelp__ocarina_redirect_min_helprtc_version", 605);
        f = agvx.a(a2, "AndroidGoogleHelp__ocarina_app_package_name", "com.google.android.apps.helprtc");
        g = agvx.a(a2, "AndroidGoogleHelp__ocarina_launch_class_name", "com.google.android.apps.helprtc.help.activities.HelpActivity");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final String f() {
        return (String) f.c();
    }

    public final String g() {
        return (String) g.c();
    }
}
