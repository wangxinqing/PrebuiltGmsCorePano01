package defpackage;

/* renamed from: avvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avvh implements auco {
    UNKNOWN(0),
    ALARM(1),
    ERROR_REPORTED(2),
    CHARGING(3),
    DISCHARGING(4),
    SCREEN_ON(5),
    SCREEN_OFF(6),
    ERROR_ALARM(7);
    
    public final int i;

    private avvh(int i2) {
        this.i = i2;
    }

    public static avvh a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return ALARM;
            case 2:
                return ERROR_REPORTED;
            case 3:
                return CHARGING;
            case 4:
                return DISCHARGING;
            case 5:
                return SCREEN_ON;
            case 6:
                return SCREEN_OFF;
            case 7:
                return ERROR_ALARM;
            default:
                return null;
        }
    }

    public static aucq b() {
        return avvg.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
