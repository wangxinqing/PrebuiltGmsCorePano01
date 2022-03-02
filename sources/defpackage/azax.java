package defpackage;

/* renamed from: azax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class azax implements azaw {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw agvw = new agvw(agvj.a("com.google.android.gms.places"));
        a = agvx.a(agvw, "ble_batch_interval_millis", 3000);
        b = agvx.a(agvw, "ble_scan_mode", 2);
        c = agvx.a(agvw, "enable_ble_scanning", true);
        d = agvx.a(agvw, "enable_opportunistic_ble_scanning", true);
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
