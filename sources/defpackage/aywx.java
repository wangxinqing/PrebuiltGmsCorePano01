package defpackage;

/* renamed from: aywx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aywx implements ayww {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.people"));
        a = agvx.a(agvw, "MenagerieSystemAccountFinder__deprecate_caching_system_account_finder", false);
        b = agvx.a(agvw, "MenagerieSystemAccountFinder__deprecate_caching_system_account_finder_for_period_sync", false);
        c = agvx.a(agvw, "MenagerieSystemAccountFinder__log_system_account_finder_usage", false);
        d = agvx.a(agvw, "MenagerieSystemAccountFinder__log_system_account_finder_usage_sample_rate", 0.01d);
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

    public final double d() {
        return ((Double) d.c()).doubleValue();
    }
}
