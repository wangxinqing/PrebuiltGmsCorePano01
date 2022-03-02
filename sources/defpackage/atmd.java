package defpackage;

/* renamed from: atmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atmd implements auco {
    UNKNOWN_TIME_FENCE_TRIGGER_TYPE(0),
    ABSOLUTE_INTERVAL(1),
    DAILY_INTERVAL(2),
    WEEKEND_INTERVAL(3),
    WEEKDAY_INTERVAL(4),
    SUNDAY_INTERVAL(5),
    MONDAY_INTERVAL(6),
    TUESDAY_INTERVAL(7),
    WEDNESDAY_INTERVAL(8),
    THURSDAY_INTERVAL(9),
    FRIDAY_INTERVAL(10),
    SATURDAY_INTERVAL(11),
    AFTER_LOCAL_TIME(12);
    
    public final int n;

    private atmd(int i) {
        this.n = i;
    }

    public static atmd a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
            case 1:
                return ABSOLUTE_INTERVAL;
            case 2:
                return DAILY_INTERVAL;
            case 3:
                return WEEKEND_INTERVAL;
            case 4:
                return WEEKDAY_INTERVAL;
            case 5:
                return SUNDAY_INTERVAL;
            case 6:
                return MONDAY_INTERVAL;
            case 7:
                return TUESDAY_INTERVAL;
            case 8:
                return WEDNESDAY_INTERVAL;
            case 9:
                return THURSDAY_INTERVAL;
            case 10:
                return FRIDAY_INTERVAL;
            case 11:
                return SATURDAY_INTERVAL;
            case 12:
                return AFTER_LOCAL_TIME;
            default:
                return null;
        }
    }

    public static aucq b() {
        return atmc.a;
    }

    public final int a() {
        return this.n;
    }

    public final String toString() {
        return Integer.toString(this.n);
    }
}
