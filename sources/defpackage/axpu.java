package defpackage;

/* renamed from: axpu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpu implements axpt {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        a = agvx.a(a2, "AndroidGoogleHelp__enable_day_night_functionality", false);
        b = agvx.a(a2, "AndroidGoogleHelp__enable_open_to_smart_journey_step_3", false);
        c = agvx.a(a2, "AndroidGoogleHelp__open_to_smart_journey_step_3_whitelist", "com.google.android.libraries.inapphelp.testapp,com.google.android.gms.test.googlehelp.googlehelpapp,com.google.android.gms.feedback.testapp");
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
}
