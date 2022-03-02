package defpackage;

/* renamed from: awzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awzw implements awzv {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms"));
        a = agvx.a(agvw, "Grpc__enable_android_channel_builder", false);
        b = agvx.a(agvw, "Grpc__enable_android_channel_network_monitoring", false);
        c = agvx.a(agvw, "Grpc__enable_clear_thread_stats_after_execute", false);
        d = agvx.a(agvw, "Grpc__grpc_idle_timeout_ms", 1800000);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
