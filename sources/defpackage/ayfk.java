package defpackage;

/* renamed from: ayfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayfk implements ayfj {
    public static final agvx addRttToWifiScan;
    public static final agvx useWifiScanObjectForFlpApi;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        addRttToWifiScan = agvx.a(a, "rttulr", false);
        useWifiScanObjectForFlpApi = agvx.a(a, "wifiscanapi", false);
    }

    public boolean addRttToWifiScan() {
        return ((Boolean) addRttToWifiScan.c()).booleanValue();
    }

    public boolean compiled() {
        return true;
    }

    public boolean useWifiScanObjectForFlpApi() {
        return ((Boolean) useWifiScanObjectForFlpApi.c()).booleanValue();
    }
}
