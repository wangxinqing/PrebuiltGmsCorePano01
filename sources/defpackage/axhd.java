package defpackage;

/* renamed from: axhd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axhd implements axhc {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.feedback")).a();
        agvx.a(a2, "AndroidFeedback__enable_feedback_submission_cronet", true);
        agvx.a(a2, "AndroidFeedback__enable_suggestion_help_cronet", true);
        a = agvx.a(a2, "AndroidFeedback__feedback_submission_priority_cronet", "medium");
        b = agvx.a(a2, "AndroidFeedback__suggestion_help_priority_cronet", "medium");
        c = agvx.a(a2, "AndroidFeedback__unified_rendering_api_suggestion_priority_cronet", "medium");
    }

    public final String a() {
        return (String) a.c();
    }

    public final String b() {
        return (String) b.c();
    }

    public final String c() {
        return (String) c.c();
    }
}
