package defpackage;

/* renamed from: azhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azhz implements azhy {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.smart_profile")).a();
        a = agvx.a(a2, "BugFixesW39Feature__enable_calendar_time_zone_id", true);
        b = agvx.a(a2, "BugFixesW39Feature__enable_header_bg_color_change", true);
        c = agvx.a(a2, "BugFixesW39Feature__enable_talkback_snackbar_without_timeout", true);
        d = agvx.a(a2, "BugFixesW39Feature__enable_wrap_text_quick_actions_fix", true);
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
}
