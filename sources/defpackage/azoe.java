package defpackage;

/* renamed from: azoe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azoe implements azod {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.metrics"));
        a = agvx.a(agvw, "ProcStats__enable_metric_filter", true);
        b = agvx.a(agvw, "ProcStats__black_list_metrics", "PROC_ALL,PKG_SVC_ALL,SYS_MEM_ALL");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final String b() {
        return (String) b.c();
    }
}
