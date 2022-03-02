package defpackage;

/* renamed from: asaa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asaa implements auco {
    UNKNOWN_MEDIUM(0),
    MDNS(1),
    BLUETOOTH(2),
    WIFI_HOTSPOT(3),
    BLE(4),
    WIFI_LAN(5),
    WIFI_AWARE(6),
    NFC(7),
    WIFI_DIRECT(8),
    WEB_RTC(9);
    
    public final int k;

    private asaa(int i) {
        this.k = i;
    }

    public static asaa a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_MEDIUM;
            case 1:
                return MDNS;
            case 2:
                return BLUETOOTH;
            case 3:
                return WIFI_HOTSPOT;
            case 4:
                return BLE;
            case 5:
                return WIFI_LAN;
            case 6:
                return WIFI_AWARE;
            case 7:
                return NFC;
            case 8:
                return WIFI_DIRECT;
            case 9:
                return WEB_RTC;
            default:
                return null;
        }
    }

    public static aucq b() {
        return arzz.a;
    }

    public final int a() {
        return this.k;
    }

    public final String toString() {
        return Integer.toString(this.k);
    }
}
