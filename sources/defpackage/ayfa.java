package defpackage;

/* renamed from: ayfa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface ayfa {
    boolean forceSensorCollectionUpload();

    boolean isSensorCollectionEnabled();

    boolean isSensorCollectionSizeLimited();

    long maxSensorTraceSizeBytes();

    String sensorCollectionSizeLimitedPackages();

    long sensorCollectionWifiScanDelayMs();
}
