package defpackage;

/* renamed from: ajku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ajku implements ajnc {
    First,
    ChargingInVehicle,
    Moving,
    Stationary,
    WifiTriggered;

    public final String a() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 4 ? "Normal" : "Wifi triggered" : "Charging in vehicle" : "First upload";
    }

    public final String a(boolean z) {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 3 ? ordinal != 4 ? "default" : "wifiTriggered" : "stationary" : "chargingInVehicle" : "firstUpload";
    }

    public final String b() {
        return "internal";
    }

    public final String c() {
        return null;
    }
}
