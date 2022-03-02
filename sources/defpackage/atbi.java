package defpackage;

/* renamed from: atbi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atbi implements auco {
    UNKNOWN(0),
    UNSUPPORTED_OS(1),
    DEFERRING_TO_GMM(2),
    UNSUPPORTED_GEO(3),
    LOCATION_DISABLED_FOR_GOOGLE_APPS(4),
    INVALID_ACCOUNT(5),
    REPORTING_NOT_ENABLED(6),
    ACCOUNT_RESTRICTION(7),
    AUTH_ERROR(10),
    RESTRICTED_PROFILE(11),
    LOCATION_DISABLED(12),
    INDETERMINATE(99);
    
    public final int m;

    private atbi(int i) {
        this.m = i;
    }

    public static atbi a(int i) {
        if (i == 99) {
            return INDETERMINATE;
        }
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return UNSUPPORTED_OS;
            case 2:
                return DEFERRING_TO_GMM;
            case 3:
                return UNSUPPORTED_GEO;
            case 4:
                return LOCATION_DISABLED_FOR_GOOGLE_APPS;
            case 5:
                return INVALID_ACCOUNT;
            case 6:
                return REPORTING_NOT_ENABLED;
            case 7:
                return ACCOUNT_RESTRICTION;
            default:
                switch (i) {
                    case 10:
                        return AUTH_ERROR;
                    case 11:
                        return RESTRICTED_PROFILE;
                    case 12:
                        return LOCATION_DISABLED;
                    default:
                        return null;
                }
        }
    }

    public static aucq b() {
        return atbh.a;
    }

    public final int a() {
        return this.m;
    }

    public final String toString() {
        return Integer.toString(this.m);
    }
}
