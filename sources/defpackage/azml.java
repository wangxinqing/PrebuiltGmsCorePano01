package defpackage;

/* renamed from: azml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azml implements azmk {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;
    public static final agvx e;
    public static final agvx f;
    public static final agvx g;
    public static final agvx h;

    static {
        agvw a2 = new agvw("com.google.android.metrics").a("gms:stats:");
        a = agvx.a(a2, "BatteryStats__filters", ",hsp,&,h,");
        b = agvx.a(a2, "BatteryStats__package_manager", true);
        c = agvx.a(a2, "BatteryStats__qos", 2);
        d = agvx.a(a2, "BatteryStats__record_flags", "--charged -c");
        e = agvx.a(a2, "BatteryStats__require_charging", false);
        f = agvx.a(a2, "BatteryStats__reset_timestamp_group_index", 3);
        g = agvx.a(a2, "BatteryStats__summary_format", "(l,bt,\\d+,)(\\d+,){4}(\\d+)(,\\d+){2}");
        h = agvx.a(a2, "BatteryStats__summary_line", ",l,bt,");
    }

    public final String a() {
        return (String) a.c();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }

    public final long c() {
        return ((Long) c.c()).longValue();
    }

    public final String d() {
        return (String) d.c();
    }

    public final boolean e() {
        return ((Boolean) e.c()).booleanValue();
    }

    public final long f() {
        return ((Long) f.c()).longValue();
    }

    public final String g() {
        return (String) g.c();
    }

    public final String h() {
        return (String) h.c();
    }
}
