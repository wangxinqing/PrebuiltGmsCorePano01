package defpackage;

/* renamed from: asey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asey implements auco {
    BLE_BACKGROUND_SCAN_STRATEGY_UNKNOWN(0),
    BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS(1),
    BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON(2);
    
    public final int d;

    private asey(int i) {
        this.d = i;
    }

    public static asey a(int i) {
        if (i == 0) {
            return BLE_BACKGROUND_SCAN_STRATEGY_UNKNOWN;
        }
        if (i == 1) {
            return BLE_BACKGROUND_SCAN_STRATEGY_SCREEN_ON_EVENTS;
        }
        if (i != 2) {
            return null;
        }
        return BLE_BACKGROUND_SCAN_STRATEGY_ALWAYS_ON;
    }

    public static aucq b() {
        return asex.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
