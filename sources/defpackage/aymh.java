package defpackage;

/* renamed from: aymh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aymh implements aymg {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms.nearby")).a("nearbybootstrap:");
        a = agvx.a(a2, "enable_discoverer_ble_beacon", true);
        agvx.a(a2, "source_reconnect_limit_millis", 900000);
        b = agvx.a(a2, "target_connect_timeout_millis", 5000);
        c = agvx.a(a2, "wrong_token", "0000");
    }

    public final boolean a() {
        return ((Boolean) a.c()).booleanValue();
    }

    public final long b() {
        return ((Long) b.c()).longValue();
    }

    public final String c() {
        return (String) c.c();
    }
}
