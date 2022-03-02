package defpackage;

/* renamed from: axhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axhp implements axho {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.feedback")).a();
        a = agvx.a(a2, "AndroidFeedback__fix_suggested_article_crash", false);
        b = agvx.a(a2, "AndroidFeedback__select_last_chosen_account_in_email_spinner", false);
        c = agvx.a(a2, "AndroidFeedback__throw_on_set_screenshot_but_no_pii_allowed", true);
        agvx.a(a2, "AndroidFeedback__trim_feedback_submission", false);
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
}
