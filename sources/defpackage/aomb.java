package defpackage;

/* renamed from: aomb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aomb implements auco {
    UNKNOWN(0),
    PERIODIC(1),
    ONE_OFF(2),
    DEBUG_UI(3),
    ONE_OFF_REASON_INSTALL(4),
    ONE_OFF_REASON_REBUILD(5),
    DEBUG_UI_REASON_REFRESH(6),
    DEBUG_UI_REASON_REBUILD(7),
    UNRECOGNIZED(-1);
    
    private final int j;

    private aomb(int i) {
        this.j = i;
    }

    public static aomb a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PERIODIC;
            case 2:
                return ONE_OFF;
            case 3:
                return DEBUG_UI;
            case 4:
                return ONE_OFF_REASON_INSTALL;
            case 5:
                return ONE_OFF_REASON_REBUILD;
            case 6:
                return DEBUG_UI_REASON_REFRESH;
            case 7:
                return DEBUG_UI_REASON_REBUILD;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aoma.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.j;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
