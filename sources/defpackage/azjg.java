package defpackage;

/* renamed from: azjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azjg implements azjf {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw b2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).b();
        a = agvx.a(b2, "smart_profile.blocked_learn_more_url", "https://support.google.com/accounts?p=block_list");
        b = agvx.a(b2, "smart_profile.edit_in_about_me_url", "https://aboutme.google.com/");
        c = agvx.a(b2, "smart_profile.snackbar_active_ms", 60000);
        d = agvx.a(b2, "smart_profile.view_all_google_plus_photos_intent_format_url", "https://get.google.com/albumarchive/%s");
        e = agvx.a(b2, "smart_profile.view_google_plus_profile_intent_format_url", "https://plus.google.com/%s");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final String e() {
        return (String) e.c();
    }
}
