package defpackage;

/* renamed from: azhq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azhq implements azhp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).a();
        a = agvx.a(a2, "BugFixesV28Feature__enable_calendar_title_npe_fix", false);
        agvx.a(a2, "BugFixesV28Feature__enable_fix_background_color_jb_kk", true);
        b = agvx.a(a2, "BugFixesV28Feature__enable_fix_color_accent_jb_kk", true);
        c = agvx.a(a2, "BugFixesV28Feature__enable_fix_talkback_sms_button_no_description", true);
        d = agvx.a(a2, "BugFixesV28Feature__enable_remove_space_beneath_card_container", true);
        e = agvx.a(a2, "BugFixesV28Feature__enable_self_hangout_fix", true);
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
