package defpackage;

/* renamed from: axfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axfq implements axfp {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.family"));
        agvx.a(agvw, "BugFix__contact_method_switch_when_full", false);
        a = agvx.a(agvw, "BugFix__disable_griffin_member_removal", false);
        agvx.a(agvw, "BugFix__disable_screen_rotation_send_invitations", false);
        b = agvx.a(agvw, "BugFix__enable_manage_supervised_member_intent", false);
        c = agvx.a(agvw, "BugFix__fix_deprecated_context_client_constructor", false);
        agvx.a(agvw, "BugFix__fix_rotation_display", true);
        d = agvx.a(agvw, "BugFix__pass_client_type_and_version_in_get_people_request", true);
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
