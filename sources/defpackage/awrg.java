package defpackage;

/* renamed from: awrg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awrg implements awrf {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.checkin"));
        a = agvx.a(agvw, "mininimum_scheduling_delay_ms", 10000);
        b = agvx.a(agvw, "scheduling_delay_buffer", 1000);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }
}
