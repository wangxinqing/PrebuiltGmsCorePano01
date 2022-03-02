package defpackage;

/* renamed from: avwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avwm implements auco {
    UNKNOWN_REQUEST_TYPE(0),
    ONE_OFF_SYNC(1),
    DAILY_SYNC(2),
    FREQUENT_SYNC(3),
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC(4),
    PERIODIC_FULL_DOMAIN_FILTER_SYNC(5),
    ONE_OFF_SYNC_CHARGING_UNMETERED(6),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER(7),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN(8),
    ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA(9),
    ONE_OFF_SYNC_AT_ACCOUNT_CHANGE(10),
    ONE_OFF_SYNC_AT_BOOT_COMPLETE(11),
    ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE(12),
    UNRECOGNIZED(-1);
    
    private final int o;

    private avwm(int i) {
        this.o = i;
    }

    public static avwm a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_REQUEST_TYPE;
            case 1:
                return ONE_OFF_SYNC;
            case 2:
                return DAILY_SYNC;
            case 3:
                return FREQUENT_SYNC;
            case 4:
                return ONE_OFF_FULL_DOMAIN_FILTER_SYNC;
            case 5:
                return PERIODIC_FULL_DOMAIN_FILTER_SYNC;
            case 6:
                return ONE_OFF_SYNC_CHARGING_UNMETERED;
            case 7:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_UPDATE_DOMAIN_FILTER;
            case 8:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_OPT_IN;
            case 9:
                return ONE_OFF_SYNC_AT_INSTANT_APPS_SERVICE_DELETE_ALL_DATA;
            case 10:
                return ONE_OFF_SYNC_AT_ACCOUNT_CHANGE;
            case 11:
                return ONE_OFF_SYNC_AT_BOOT_COMPLETE;
            case 12:
                return ONE_OFF_FULL_DOMAIN_FILTER_SYNC_AT_CONTENT_FILTER_CHANGE;
            default:
                return null;
        }
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
