package defpackage;

/* renamed from: awsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awsz implements awsy {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw("direct_boot:com.google.android.gms.playlog.uploader");
        a = agvx.a(agvw, "ClearcutFunnel__buffer_size", 40960);
        b = agvx.a(agvw, "ClearcutFunnel__discern_bad_request", false);
        c = agvx.a(agvw, "ClearcutFunnel__enabled", false);
        d = agvx.a(agvw, "ClearcutFunnel__max_retries", 48);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
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
