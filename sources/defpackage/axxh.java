package defpackage;

/* renamed from: axxh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public interface axxh {
    boolean backgroundThrottle();

    long flpBackgroundBatchRequestMinIntervalMs();

    long flpBackgroundBatchRequestMinWaitMs();

    long flpBackgroundRequestMinIntervalMs();

    String flpBackgroundThrottleWhiteListApps();

    String flpBackgroundWhitelistGcoreModules();

    String flpForcedBackgroundApps();

    String flpForcedBackgroundExceptHighAccuracyApps();

    boolean flpWifiConnectionThrottleEnabled();

    long geofenceMinimumRadiusMeters();

    long geofenceMinimumResponsivenessMillis();

    long throttledGeofenceLocationIntervalSeconds();
}
