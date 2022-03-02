package defpackage;

/* renamed from: ayed  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ayed implements ayec {
    public static final agvx passiveCollectorEnableCellChangeUpload;
    public static final agvx passiveCollectorEnableGpsChangeUpload;
    public static final agvx passiveCollectorEnableMovedTooFarChangeUpload;
    public static final agvx passiveCollectorEnableWifiChangeUpload;

    static {
        agvw a = new agvw(agvj.a("com.google.android.location")).a("location:");
        passiveCollectorEnableCellChangeUpload = agvx.a(a, "passive_collector_enable_cell_change_upload", true);
        passiveCollectorEnableGpsChangeUpload = agvx.a(a, "passive_collector_enable_gps_change_upload", true);
        passiveCollectorEnableMovedTooFarChangeUpload = agvx.a(a, "passive_collector_enable_moved_too_far_change_upload", true);
        passiveCollectorEnableWifiChangeUpload = agvx.a(a, "passive_collector_enable_wifi_change_upload", true);
    }

    public boolean compiled() {
        return true;
    }

    public boolean passiveCollectorEnableCellChangeUpload() {
        return ((Boolean) passiveCollectorEnableCellChangeUpload.c()).booleanValue();
    }

    public boolean passiveCollectorEnableGpsChangeUpload() {
        return ((Boolean) passiveCollectorEnableGpsChangeUpload.c()).booleanValue();
    }

    public boolean passiveCollectorEnableMovedTooFarChangeUpload() {
        return ((Boolean) passiveCollectorEnableMovedTooFarChangeUpload.c()).booleanValue();
    }

    public boolean passiveCollectorEnableWifiChangeUpload() {
        return ((Boolean) passiveCollectorEnableWifiChangeUpload.c()).booleanValue();
    }
}
