package defpackage;

/* renamed from: axya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axya implements axxz {
    public static final agvx burstCollectionTriggerMinBatteryLevel;
    public static final agvx burstCollectorBurstMeasurementInterval;
    public static final agvx burstCollectorMaxBurstTimeMillis;
    public static final agvx burstCollectorMinBatteryLevel;
    public static final agvx burstCollectorMinIdleTimeOnBatteryMillis;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        burstCollectionTriggerMinBatteryLevel = agvx.a(a, "burst_collection_trigger_min_battery_level", 0.6d);
        burstCollectorBurstMeasurementInterval = agvx.a(a, "burst_collector_burst_measurement_interval", 12000);
        burstCollectorMaxBurstTimeMillis = agvx.a(a, "burst_collector_max_burst_time_millis", 140000);
        burstCollectorMinBatteryLevel = agvx.a(a, "burst_collector_min_battery_level", 0.2d);
        burstCollectorMinIdleTimeOnBatteryMillis = agvx.a(a, "burst_collector_min_idle_time_on_battery_millis", 18000000);
    }

    public double burstCollectionTriggerMinBatteryLevel() {
        return ((Double) burstCollectionTriggerMinBatteryLevel.c()).doubleValue();
    }

    public long burstCollectorBurstMeasurementInterval() {
        return ((Long) burstCollectorBurstMeasurementInterval.c()).longValue();
    }

    public long burstCollectorMaxBurstTimeMillis() {
        return ((Long) burstCollectorMaxBurstTimeMillis.c()).longValue();
    }

    public double burstCollectorMinBatteryLevel() {
        return ((Double) burstCollectorMinBatteryLevel.c()).doubleValue();
    }

    public long burstCollectorMinIdleTimeOnBatteryMillis() {
        return ((Long) burstCollectorMinIdleTimeOnBatteryMillis.c()).longValue();
    }

    public boolean compiled() {
        return true;
    }
}
