package defpackage;

/* renamed from: ayci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayci implements aych {
    public static final agvx enableHardwareGeofencing;
    public static final agvx flpGeofenceEnableHalDebugMode;
    public static final agvx forceHardwareGeofenceWhenAvailable;
    public static final agvx preserveGeofencesWhenNetworkLocationTurnsOff;
    public static final agvx useHardwareGeofenceWhenUnavailable;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        enableHardwareGeofencing = agvx.a(a, "enable_hardware_geofencing_olivet", true);
        flpGeofenceEnableHalDebugMode = agvx.a(a, "flp_geofence_enable_hal_debug", false);
        forceHardwareGeofenceWhenAvailable = agvx.a(a, "force_hardware_geofence_when_available", false);
        preserveGeofencesWhenNetworkLocationTurnsOff = agvx.a(a, "Geofencing__preserve_geofences_when_network_location_turns_off", true);
        useHardwareGeofenceWhenUnavailable = agvx.a(a, "use_hardware_geofence_when_unavailable", false);
    }

    public boolean compiled() {
        return true;
    }

    public boolean enableHardwareGeofencing() {
        return ((Boolean) enableHardwareGeofencing.c()).booleanValue();
    }

    public boolean flpGeofenceEnableHalDebugMode() {
        return ((Boolean) flpGeofenceEnableHalDebugMode.c()).booleanValue();
    }

    public boolean forceHardwareGeofenceWhenAvailable() {
        return ((Boolean) forceHardwareGeofenceWhenAvailable.c()).booleanValue();
    }

    public boolean preserveGeofencesWhenNetworkLocationTurnsOff() {
        return ((Boolean) preserveGeofencesWhenNetworkLocationTurnsOff.c()).booleanValue();
    }

    public boolean useHardwareGeofenceWhenUnavailable() {
        return ((Boolean) useHardwareGeofenceWhenUnavailable.c()).booleanValue();
    }
}
