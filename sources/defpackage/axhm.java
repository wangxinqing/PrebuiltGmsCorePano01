package defpackage;

/* renamed from: axhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axhm implements axhl {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.feedback")).a();
        a = agvx.a(a2, "AndroidFeedback__check_pii_checkbox_visibility", false);
        b = agvx.a(a2, "AndroidFeedback__clear_screenshot_references", false);
        agvx.a(a2, "AndroidFeedback__fix_feedback_submission_concurrency", false);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
