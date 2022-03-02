package defpackage;

/* renamed from: ayey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayey implements ayex {
    public static final agvx flpLocationStalenessThresholdMillis;
    public static final agvx flpMinimumScreenOnLocationRequestTimeDeltaMillis;
    public static final agvx flpScreenOnLocationEnabled;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        flpLocationStalenessThresholdMillis = agvx.a(a, "flp_location_staleness_threshold_millis", 600000);
        flpMinimumScreenOnLocationRequestTimeDeltaMillis = agvx.a(a, "flp_minimum_screen_on_location_request_time_delta_millis", 60000);
        flpScreenOnLocationEnabled = agvx.a(a, "flp_screen_on_location_enabled", false);
    }

    public boolean compiled() {
        return true;
    }

    public long flpLocationStalenessThresholdMillis() {
        return ((Long) flpLocationStalenessThresholdMillis.c()).longValue();
    }

    public long flpMinimumScreenOnLocationRequestTimeDeltaMillis() {
        return ((Long) flpMinimumScreenOnLocationRequestTimeDeltaMillis.c()).longValue();
    }

    public boolean flpScreenOnLocationEnabled() {
        return ((Boolean) flpScreenOnLocationEnabled.c()).booleanValue();
    }
}
