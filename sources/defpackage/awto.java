package defpackage;

/* renamed from: awto  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awto implements awtn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("direct_boot:com.google.android.gms.playlog.uploader").a("gms:playlog:service:");
        a = agvx.a(a2, "clearcut_collect_for_debug_duration_millis", 86400000);
        b = agvx.a(a2, "clearcut_collect_for_debug_upload_latency_millis", 10000);
        c = agvx.a(a2, "sidewinder_permissions", "");
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final String c() {
        return (String) c.c();
    }
}
