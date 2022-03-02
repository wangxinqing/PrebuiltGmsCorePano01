package defpackage;

/* renamed from: ayfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfb implements ayfa {
    public static final agvx forceSensorCollectionUpload;
    public static final agvx isSensorCollectionEnabled;
    public static final agvx isSensorCollectionSizeLimited;
    public static final agvx maxSensorTraceSizeBytes;
    public static final agvx sensorCollectionSizeLimitedPackages;
    public static final agvx sensorCollectionWifiScanDelayMs;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        forceSensorCollectionUpload = agvx.a(a, "force_sensor_collection_upload", true);
        isSensorCollectionEnabled = agvx.a(a, "is_sensor_collection_enabled", true);
        isSensorCollectionSizeLimited = agvx.a(a, "is_sensor_collection_size_limited", true);
        maxSensorTraceSizeBytes = agvx.a(a, "max_sensor_trace_size_bytes", 10000000);
        sensorCollectionSizeLimitedPackages = agvx.a(a, "sensor_collection_size_limited_packages", "com.google.android.gms");
        sensorCollectionWifiScanDelayMs = agvx.a(a, "sensor_collection_wifi_scan_delay_ms", 2000);
    }

    public boolean compiled() {
        return true;
    }

    public boolean forceSensorCollectionUpload() {
        return ((Boolean) forceSensorCollectionUpload.c()).booleanValue();
    }

    public boolean isSensorCollectionEnabled() {
        return ((Boolean) isSensorCollectionEnabled.c()).booleanValue();
    }

    public boolean isSensorCollectionSizeLimited() {
        return ((Boolean) isSensorCollectionSizeLimited.c()).booleanValue();
    }

    public long maxSensorTraceSizeBytes() {
        return ((Long) maxSensorTraceSizeBytes.c()).longValue();
    }

    public String sensorCollectionSizeLimitedPackages() {
        return (String) sensorCollectionSizeLimitedPackages.c();
    }

    public long sensorCollectionWifiScanDelayMs() {
        return ((Long) sensorCollectionWifiScanDelayMs.c()).longValue();
    }
}
