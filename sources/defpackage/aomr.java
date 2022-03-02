package defpackage;

/* renamed from: aomr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aomr implements auco {
    UNDEFINED(0),
    AUTHENTICATED(1),
    IO_EXCEPTION(2),
    AUTH_EXCEPTION(3),
    USER_RECOVERABLE_AUTH_EXCEPTION(4),
    NETWORK_ERROR(5),
    BAD_AUTHENTICATION(6),
    AUTH_INTERNAL_ERROR(7),
    UNRECOGNIZED(-1);
    
    private final int j;

    private aomr(int i) {
        this.j = i;
    }

    public static aomr a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return AUTHENTICATED;
            case 2:
                return IO_EXCEPTION;
            case 3:
                return AUTH_EXCEPTION;
            case 4:
                return USER_RECOVERABLE_AUTH_EXCEPTION;
            case 5:
                return NETWORK_ERROR;
            case 6:
                return BAD_AUTHENTICATION;
            case 7:
                return AUTH_INTERNAL_ERROR;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aomq.a;
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
