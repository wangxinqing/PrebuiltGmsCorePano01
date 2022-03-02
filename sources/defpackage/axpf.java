package defpackage;

/* renamed from: axpf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axpf implements axpe {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.googlehelp")).a();
        agvx.a(a2, "AndroidGoogleHelp__v26_enable_case_insensitive_content_type", true);
        a = agvx.a(a2, "AndroidGoogleHelp__v26_enable_report_batched_metrics_cronet", false);
        b = agvx.a(a2, "AndroidGoogleHelp__v26_report_batched_metrics_priority_cronet", "medium");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
