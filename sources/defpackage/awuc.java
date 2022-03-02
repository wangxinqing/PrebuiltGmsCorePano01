package defpackage;

/* renamed from: awuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awuc implements awub {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:uploader:");
        a = agvx.a(a2, "batch_oversize_logs", true);
        b = agvx.a(a2, "batch_qos_tiers", false);
        c = agvx.a(a2, "max_log_requests_batched", 100);
        agvx.a(a2, "use_batched_log_request", true);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
