package defpackage;

/* renamed from: axyw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axyw implements axyv {
    public static final agvx bugFixUnloadFromChreWhenNlpTurnsOff;
    public static final agvx enableChreGeofencing;
    public static final agvx onDemandWifiScan;
    public static final agvx useGmscoreAlarmListener;
    public static final agvx wifiConnectionStatusSync;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        bugFixUnloadFromChreWhenNlpTurnsOff = agvx.a(a, "ChreGeofence__bug_fix_unload_from_chre_when_nlp_turns_off", false);
        enableChreGeofencing = agvx.a(a, "enable_chre_geofencing", false);
        onDemandWifiScan = agvx.a(a, "enable_on_demand_wifi_scan_chre", false);
        useGmscoreAlarmListener = agvx.a(a, "ChreGeofence__use_gmscore_alarm_listener", false);
        wifiConnectionStatusSync = agvx.a(a, "enable_wifi_connection_status_sync_chre", false);
    }

    public boolean bugFixUnloadFromChreWhenNlpTurnsOff() {
        return ((Boolean) bugFixUnloadFromChreWhenNlpTurnsOff.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableChreGeofencing() {
        return ((Boolean) enableChreGeofencing.c()).booleanValue();
    }

    public boolean onDemandWifiScan() {
        return ((Boolean) onDemandWifiScan.c()).booleanValue();
    }

    public boolean useGmscoreAlarmListener() {
        return ((Boolean) useGmscoreAlarmListener.c()).booleanValue();
    }

    public boolean wifiConnectionStatusSync() {
        return ((Boolean) wifiConnectionStatusSync.c()).booleanValue();
    }
}
