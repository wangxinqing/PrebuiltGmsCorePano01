package defpackage;

/* renamed from: atsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atsr implements auco {
    UNKNOWN_DAY_TYPE(0),
    WEEKDAY(1),
    WEEKEND(2),
    HOLIDAY(3);
    
    private final int e;

    private atsr(int i) {
        this.e = i;
    }

    public static atsr a(int i) {
        if (i == 0) {
            return UNKNOWN_DAY_TYPE;
        }
        if (i == 1) {
            return WEEKDAY;
        }
        if (i == 2) {
            return WEEKEND;
        }
        if (i != 3) {
            return null;
        }
        return HOLIDAY;
    }

    public static aucq b() {
        return atsq.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
