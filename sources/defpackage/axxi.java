package defpackage;

/* renamed from: axxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axxi implements axxh {
    public static final agvx backgroundThrottle;
    public static final agvx flpBackgroundBatchRequestMinIntervalMs;
    public static final agvx flpBackgroundBatchRequestMinWaitMs;
    public static final agvx flpBackgroundRequestMinIntervalMs;
    public static final agvx flpBackgroundThrottleWhiteListApps;
    public static final agvx flpBackgroundWhitelistGcoreModules;
    public static final agvx flpForcedBackgroundApps;
    public static final agvx flpForcedBackgroundExceptHighAccuracyApps;
    public static final agvx flpWifiConnectionThrottleEnabled;
    public static final agvx geofenceMinimumRadiusMeters;
    public static final agvx geofenceMinimumResponsivenessMillis;
    public static final agvx throttledGeofenceLocationIntervalSeconds;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        backgroundThrottle = agvx.a(a, "background_throttle", false);
        flpBackgroundBatchRequestMinIntervalMs = agvx.a(a, "flp_background_batch_request_min_interval_ms", 0);
        flpBackgroundBatchRequestMinWaitMs = agvx.a(a, "flp_background_batch_request_min_wait_ms", 0);
        flpBackgroundRequestMinIntervalMs = agvx.a(a, "flp_background_request_min_interval_ms", 0);
        flpBackgroundThrottleWhiteListApps = agvx.a(a, "flp_background_whitelist_apps", "");
        flpBackgroundWhitelistGcoreModules = agvx.a(a, "flp_background_whitelist_gcore_modules", "com.google.android.gms.location,com.google.android.gms.location.geofencing,com.google.android.gms.location__nonwearable,com.google.android.gms.location__wearable,com.google.android.gms.places,com.google.android.gms.thunderbird,com.google.android.gms.security,com.google.android.gms.tapandpay");
        flpForcedBackgroundApps = agvx.a(a, "flp_forced_background_apps", "com.google.android.gms");
        flpForcedBackgroundExceptHighAccuracyApps = agvx.a(a, "flp_forced_background_except_high_accuracy_apps", "com.google.android.googlequicksearchbox");
        flpWifiConnectionThrottleEnabled = agvx.a(a, "flp_wifi_connection_throttle_enabled", false);
        geofenceMinimumRadiusMeters = agvx.a(a, "geofence_mininum_radius", 80);
        geofenceMinimumResponsivenessMillis = agvx.a(a, "geofence_mininum_responsiveness", 300);
        throttledGeofenceLocationIntervalSeconds = agvx.a(a, "throttled_geofence_location_interval", 300);
    }

    public boolean backgroundThrottle() {
        return ((Boolean) backgroundThrottle.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public long flpBackgroundBatchRequestMinIntervalMs() {
        return ((Long) flpBackgroundBatchRequestMinIntervalMs.c()).longValue();
    }

    public long flpBackgroundBatchRequestMinWaitMs() {
        return ((Long) flpBackgroundBatchRequestMinWaitMs.c()).longValue();
    }

    public long flpBackgroundRequestMinIntervalMs() {
        return ((Long) flpBackgroundRequestMinIntervalMs.c()).longValue();
    }

    public String flpBackgroundThrottleWhiteListApps() {
        return (String) flpBackgroundThrottleWhiteListApps.c();
    }

    public String flpBackgroundWhitelistGcoreModules() {
        return (String) flpBackgroundWhitelistGcoreModules.c();
    }

    public String flpForcedBackgroundApps() {
        return (String) flpForcedBackgroundApps.c();
    }

    public String flpForcedBackgroundExceptHighAccuracyApps() {
        return (String) flpForcedBackgroundExceptHighAccuracyApps.c();
    }

    public boolean flpWifiConnectionThrottleEnabled() {
        return ((Boolean) flpWifiConnectionThrottleEnabled.c()).booleanValue();
    }

    public long geofenceMinimumRadiusMeters() {
        return ((Long) geofenceMinimumRadiusMeters.c()).longValue();
    }

    public long geofenceMinimumResponsivenessMillis() {
        return ((Long) geofenceMinimumResponsivenessMillis.c()).longValue();
    }

    public long throttledGeofenceLocationIntervalSeconds() {
        return ((Long) throttledGeofenceLocationIntervalSeconds.c()).longValue();
    }
}
