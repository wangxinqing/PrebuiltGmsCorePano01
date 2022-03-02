package defpackage;

/* renamed from: axwt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axwt implements axws {
    public static final agvx arRoadAndRailTransitionEnabled;
    public static final agvx arRoadRailVehicleEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        arRoadAndRailTransitionEnabled = agvx.a(a, "ar_road_and_rail_transition_enabled", false);
        arRoadRailVehicleEnabled = agvx.a(a, "ar_road_rail_vehicle_enabled", true);
    }

    public boolean arRoadAndRailTransitionEnabled() {
        return ((Boolean) arRoadAndRailTransitionEnabled.c()).booleanValue();
    }

    public boolean arRoadRailVehicleEnabled() {
        return ((Boolean) arRoadRailVehicleEnabled.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }
}
