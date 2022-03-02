package defpackage;

/* renamed from: axxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxl implements axxk {
    public static final agvx minBatchIntervalMs;
    public static final agvx minIntervalMs;
    public static final agvx minPriority;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        minBatchIntervalMs = agvx.a(a, "flp_low_power_mode_min_batch_interval_ms", 300000);
        minIntervalMs = agvx.a(a, "flp_low_power_mode_min_interval_ms", 300000);
        minPriority = agvx.a(a, "flp_low_power_mode_min_priority", 102);
    }

    public boolean compiled() {
        return true;
    }

    public long minBatchIntervalMs() {
        return ((Long) minBatchIntervalMs.c()).longValue();
    }

    public long minIntervalMs() {
        return ((Long) minIntervalMs.c()).longValue();
    }

    public long minPriority() {
        return ((Long) minPriority.c()).longValue();
    }
}
