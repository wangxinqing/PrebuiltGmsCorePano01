package defpackage;

/* renamed from: atev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atev implements auco {
    AC_UNKNOWN(0),
    AC_GET_REPORTING_STATE_SAFE(1),
    AC_TRY_OPT_IN(2),
    AC_TRY_OPT_IN_REQUEST(3),
    AC_REQUEST_UPLOAD(4),
    AC_CANCEL_UPLOAD(5),
    AC_REPORT_PLACE(6),
    AC_SEND_DATA(7),
    AC_INCOGNITO_MODE_TOGGLE_ON(8),
    AC_INCOGNITO_MODE_TOGGLE_OFF(9),
    AC_PRIVATE_MODE_TOGGLE_ON(10),
    AC_PRIVATE_MODE_TOGGLE_OFF(11);
    
    public final int m;

    private atev(int i) {
        this.m = i;
    }

    public static atev a(int i) {
        switch (i) {
            case 0:
                return AC_UNKNOWN;
            case 1:
                return AC_GET_REPORTING_STATE_SAFE;
            case 2:
                return AC_TRY_OPT_IN;
            case 3:
                return AC_TRY_OPT_IN_REQUEST;
            case 4:
                return AC_REQUEST_UPLOAD;
            case 5:
                return AC_CANCEL_UPLOAD;
            case 6:
                return AC_REPORT_PLACE;
            case 7:
                return AC_SEND_DATA;
            case 8:
                return AC_INCOGNITO_MODE_TOGGLE_ON;
            case 9:
                return AC_INCOGNITO_MODE_TOGGLE_OFF;
            case 10:
                return AC_PRIVATE_MODE_TOGGLE_ON;
            case 11:
                return AC_PRIVATE_MODE_TOGGLE_OFF;
            default:
                return null;
        }
    }

    public static aucq b() {
        return ateu.a;
    }

    public final int a() {
        return this.m;
    }

    public final String toString() {
        return Integer.toString(this.m);
    }
}
