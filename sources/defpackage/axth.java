package defpackage;

/* renamed from: axth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axth implements axtg {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.icing.mdd"));
        a = agvx.a(agvw, "cellular_charging_gcm_task_period", 21600);
        b = agvx.a(agvw, "charging_gcm_task_period", 21600);
        c = agvx.a(agvw, "maintenance_gcm_task_period", 86400);
        d = agvx.a(agvw, "wifi_charging_gcm_task_period", 21600);
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

    public final long d() {
        return ((Long) d.c()).longValue();
    }
}
