package defpackage;

/* renamed from: axwk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwk implements axwj {
    public static final agvx floorChangeAccelFifoRequired;
    public static final agvx floorChangeBaroFifoRequired;
    public static final agvx floorChangeDetectionEnabled;
    public static final agvx floorChangeFakeEvent;
    public static final agvx hardwareFloorChangeDetectionEnabled;
    public static final agvx hardwareFloorChangeReportLatencyMillis;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        floorChangeAccelFifoRequired = agvx.a(a, "floor_change_accel_fifo_required", 3000);
        floorChangeBaroFifoRequired = agvx.a(a, "floor_change_baro_fifo_required", 300);
        floorChangeDetectionEnabled = agvx.a(a, "floor_change_detection_enabled", true);
        floorChangeFakeEvent = agvx.a(a, "floor_change_fake_event", "");
        hardwareFloorChangeDetectionEnabled = agvx.a(a, "hardware_floor_change_detection_enabled", false);
        hardwareFloorChangeReportLatencyMillis = agvx.a(a, "hardware_floor_change_report_latency_millis", 2147483647L);
    }

    public boolean compiled() {
        return true;
    }

    public long floorChangeAccelFifoRequired() {
        return ((Long) floorChangeAccelFifoRequired.c()).longValue();
    }

    public long floorChangeBaroFifoRequired() {
        return ((Long) floorChangeBaroFifoRequired.c()).longValue();
    }

    public boolean floorChangeDetectionEnabled() {
        return ((Boolean) floorChangeDetectionEnabled.c()).booleanValue();
    }

    public String floorChangeFakeEvent() {
        return (String) floorChangeFakeEvent.c();
    }

    public boolean hardwareFloorChangeDetectionEnabled() {
        return ((Boolean) hardwareFloorChangeDetectionEnabled.c()).booleanValue();
    }

    public long hardwareFloorChangeReportLatencyMillis() {
        return ((Long) hardwareFloorChangeReportLatencyMillis.c()).longValue();
    }
}
