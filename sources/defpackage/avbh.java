package defpackage;

/* renamed from: avbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avbh implements auco {
    ENTRY_POINT_UNKNOWN(0),
    BLUETOOTH_SETTINGS(1),
    GMS_SETTINGS(2),
    GOOGLE_APPS(3);
    
    public final int e;

    private avbh(int i) {
        this.e = i;
    }

    public static avbh a(int i) {
        if (i == 0) {
            return ENTRY_POINT_UNKNOWN;
        }
        if (i == 1) {
            return BLUETOOTH_SETTINGS;
        }
        if (i == 2) {
            return GMS_SETTINGS;
        }
        if (i != 3) {
            return null;
        }
        return GOOGLE_APPS;
    }

    public static aucq b() {
        return avbg.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
