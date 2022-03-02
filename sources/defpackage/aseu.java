package defpackage;

/* renamed from: aseu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aseu implements auco {
    BLE_ADVERTISE_DATA_TYPE_UNKNOWN(0),
    BLE_ADVERTISE_SERVICE_DATA(1),
    BLE_ADVERTISE_MANUFACTURER_DATA(2),
    BLE_ADVERTISE_SCAN_RECORD(3);
    
    public final int e;

    private aseu(int i) {
        this.e = i;
    }

    public static aseu a(int i) {
        if (i == 0) {
            return BLE_ADVERTISE_DATA_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return BLE_ADVERTISE_SERVICE_DATA;
        }
        if (i == 2) {
            return BLE_ADVERTISE_MANUFACTURER_DATA;
        }
        if (i != 3) {
            return null;
        }
        return BLE_ADVERTISE_SCAN_RECORD;
    }

    public static aucq b() {
        return aset.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
