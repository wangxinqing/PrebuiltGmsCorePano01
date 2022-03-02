package defpackage;

/* renamed from: atfc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atfc implements auco {
    LM_UNKNOWN(0),
    LM_LOCATION_MODE_OFF(1),
    LM_LOCATION_MODE_BATTERY_SAVING(2),
    LM_LOCATION_MODE_SENSORS_ONLY(3),
    LM_LOCATION_MODE_HIGH_ACCURACY(4);
    
    public final int f;

    private atfc(int i) {
        this.f = i;
    }

    public static atfc a(int i) {
        if (i == 0) {
            return LM_UNKNOWN;
        }
        if (i == 1) {
            return LM_LOCATION_MODE_OFF;
        }
        if (i == 2) {
            return LM_LOCATION_MODE_BATTERY_SAVING;
        }
        if (i == 3) {
            return LM_LOCATION_MODE_SENSORS_ONLY;
        }
        if (i != 4) {
            return null;
        }
        return LM_LOCATION_MODE_HIGH_ACCURACY;
    }

    public static aucq b() {
        return atfb.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
