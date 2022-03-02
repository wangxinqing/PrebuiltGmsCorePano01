package defpackage;

/* renamed from: azmi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azmi implements azmh {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "BatteryStats__collect_dogfooder_battery_stats", false);
        b = agvx.a(a2, "BatteryStats__filter_history", true);
        c = agvx.a(a2, "BatteryStats__record_interval_secs", 7200);
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
