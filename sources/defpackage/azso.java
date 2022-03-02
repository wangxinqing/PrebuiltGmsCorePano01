package defpackage;

/* renamed from: azso  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azso implements azsn {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.ulr"));
        a = agvx.a(agvw, "Ulr__enable_step_counts_collection", false);
        b = agvx.a(agvw, "Ulr__set_step_counts_reporting_period_second", 120);
        c = agvx.a(agvw, "Ulr__set_step_counts_sampling_period_second", 5);
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }
}
