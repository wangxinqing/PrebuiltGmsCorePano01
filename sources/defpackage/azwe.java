package defpackage;

/* renamed from: azwe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azwe implements azwd {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("com.google.android.westworld").a("gms:westworld:");
        a = agvx.a(a2, "data_poll_period_millis", 14400000);
        b = agvx.a(a2, "init_delay_millis", 3600000);
        c = agvx.a(a2, "metadata_poll_period_millis", 14400000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
