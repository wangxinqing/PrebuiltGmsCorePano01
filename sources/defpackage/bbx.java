package defpackage;

/* renamed from: bbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum bbx implements auco {
    UNKNOWN_PERIOD(0),
    EVERY_24_HOURS(5),
    EVERY_4_HOURS(1),
    EVERY_1_HOUR(2),
    EVERY_30_MINUTES(3),
    EVERY_10_MINUTES(4);
    
    public final int g;

    private bbx(int i) {
        this.g = i;
    }

    public static bbx a(int i) {
        if (i == 0) {
            return UNKNOWN_PERIOD;
        }
        if (i == 1) {
            return EVERY_4_HOURS;
        }
        if (i == 2) {
            return EVERY_1_HOUR;
        }
        if (i == 3) {
            return EVERY_30_MINUTES;
        }
        if (i == 4) {
            return EVERY_10_MINUTES;
        }
        if (i != 5) {
            return null;
        }
        return EVERY_24_HOURS;
    }

    public static aucq b() {
        return bbw.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
