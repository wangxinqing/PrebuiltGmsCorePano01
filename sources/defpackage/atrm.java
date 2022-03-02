package defpackage;

/* renamed from: atrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atrm implements auco {
    UNKNOWN(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3),
    MORNING(4),
    AFTERNOON(5),
    EVENING(6),
    NIGHT(7);
    
    public final int i;

    private atrm(int i2) {
        this.i = i2;
    }

    public static atrm a(int i2) {
        switch (i2) {
            case 0:
                return UNKNOWN;
            case 1:
                return WEEKDAY;
            case 2:
                return WEEKEND;
            case 3:
                return HOLIDAY;
            case 4:
                return MORNING;
            case 5:
                return AFTERNOON;
            case 6:
                return EVENING;
            case 7:
                return NIGHT;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atrl.a;
    }

    public final int a() {
        return this.i;
    }

    public final String toString() {
        return Integer.toString(this.i);
    }
}
