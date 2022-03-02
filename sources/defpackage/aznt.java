package defpackage;

/* renamed from: aznt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aznt implements azns {
    public static final agvx a;
    public static final agvx b;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.metrics"));
        a = agvx.a(agvw, "Eastworld__eastworld_battery_interval", 14400000);
        b = agvx.a(agvw, "Eastworld__enable_eastworld_battery_processor", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final boolean b() {
        return ((Boolean) b.c()).booleanValue();
    }
}
