package defpackage;

/* renamed from: awst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awst implements awss {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw("direct_boot:com.google.android.gms.playlog.uploader");
        a = agvx.a(agvw, "ClearcutBootCount__enable_system_memory_cache", false);
        b = agvx.a(agvw, "ClearcutBootCount__time_out_on_cache_init_millis", 2000);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
