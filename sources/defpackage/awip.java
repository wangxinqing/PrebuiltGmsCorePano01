package defpackage;

/* renamed from: awip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awip implements awio {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.audit")).a();
        a = agvx.a(a2, "ConfigFeature__upload_grpc_host", "auditrecording-pa.googleapis.com");
        b = agvx.a(a2, "ConfigFeature__upload_grpc_port", 443);
        c = agvx.a(a2, "ConfigFeature__upload_grpc_timeout", 10000);
        d = agvx.a(a2, "ConfigFeature__upload_task_records_per_run_count", 10);
        e = agvx.a(a2, "ConfigFeature__upload_task_window_maximum", 8640000);
        f = agvx.a(a2, "ConfigFeature__upload_task_window_minimum", 60);
        agvx.a(a2, "Upload__use_new_grpc_logic", true);
    }

    public final String a() {
        return (String) a.c();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final long d() {
        return ((Long) d.c()).longValue();
    }

    public final long e() {
        return ((Long) e.c()).longValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }
}
