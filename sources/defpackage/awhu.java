package defpackage;

/* renamed from: awhu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awhu implements awht {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.appinvite")).a("gms:appinvite:");
        a = agvx.a(a2, "AppinviteBugFixFeature__enable_catch_shared_preferences_exception", true);
        b = agvx.a(a2, "AppinviteBugFixFeature__enable_exclude_non_gaia_contacts", false);
        c = agvx.a(a2, "AppinviteBugFixFeature__enable_hide_icon_via_method_types_api", false);
        d = agvx.a(a2, "AppinviteBugFixFeature__enable_toolbar_fix", true);
        e = agvx.a(a2, "AppinviteBugFixFeature__enable_utm_content_and_term_logging", false);
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

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }
}
