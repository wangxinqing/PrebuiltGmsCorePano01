package defpackage;

/* renamed from: axau  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axau implements axas {
    public static final agvx a;
    public static final agvx b;
    public static final agvx c;
    public static final agvx d;

    static {
        agvw a2 = new agvw(agvj.a("com.google.android.gms")).a("gms:common:");
        a = agvx.a(a2, "Phenotype__checkin_interval_in_seconds", 86400);
        try {
            b = agvx.a(a2, "Phenotype__forced_global_broadcast_packages", (auib) aucj.a((aucj) auib.b, new byte[]{10, 27, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 108, 111, 99, 97, 116, 105, 111, 110, 10, 26, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 117, 108, 114, 10, 29, 99, 111, 109, 46, 103, 111, 111, 103, 108, 101, 46, 97, 110, 100, 114, 111, 105, 100, 46, 103, 109, 115, 46, 112, 108, 97, 99, 101, 115}), axat.a);
            c = agvx.a(a2, "Phenotype__include_device_provisioning_state_in_request", true);
            d = agvx.a(a2, "Phenotype__targeted_notifications_enabled", false);
        } catch (auda e) {
            throw new AssertionError("Could not parse proto flag \"Phenotype__forced_global_broadcast_packages\"");
        }
    }

    public final long a() {
        return ((Long) a.c()).longValue();
    }

    public final auib b() {
        return (auib) b.c();
    }

    public final boolean c() {
        return ((Boolean) c.c()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) d.c()).booleanValue();
    }
}
