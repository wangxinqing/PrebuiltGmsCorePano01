package defpackage;

/* renamed from: axhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axhg implements axhf {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.feedback")).a();
        a = agvx.a(a2, "AndroidFeedback__enable_experiment_token_collection", true);
        b = agvx.a(a2, "AndroidFeedback__token_retrieval_timeout", 10000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
