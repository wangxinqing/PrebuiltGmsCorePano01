package defpackage;

/* renamed from: ayav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayav implements ayau {
    public static final agvx enabled;
    public static final agvx maxNetworkLocationAccuracy;
    public static final agvx timeoutMs;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enabled = agvx.a(a, "FlpLocationDeliveryThrottle__enabled", false);
        maxNetworkLocationAccuracy = agvx.a(a, "FlpLocationDeliveryThrottle__max_network_location_accuracy", 100);
        timeoutMs = agvx.a(a, "FlpLocationDeliveryThrottle__timeout_ms", 15000);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enabled() {
        return ((Boolean) enabled.c()).booleanValue();
    }

    public long maxNetworkLocationAccuracy() {
        return ((Long) maxNetworkLocationAccuracy.c()).longValue();
    }

    public long timeoutMs() {
        return ((Long) timeoutMs.c()).longValue();
    }
}
