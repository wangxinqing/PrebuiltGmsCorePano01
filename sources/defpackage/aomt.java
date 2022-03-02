package defpackage;

/* renamed from: aomt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aomt implements auco {
    UNDEFINED(0),
    SUCCESS(1),
    FAILURE(2),
    IO_EXCEPTION(3),
    UNKNOWN_HOST_EXCEPTION(4),
    UNAVAILABLE(5),
    DEADLINE_EXCEEDED(6),
    UNRECOGNIZED(-1);
    
    private final int i;

    private aomt(int i2) {
        this.i = i2;
    }

    public static aomt a(int i2) {
        switch (i2) {
            case 0:
                return UNDEFINED;
            case 1:
                return SUCCESS;
            case 2:
                return FAILURE;
            case 3:
                return IO_EXCEPTION;
            case 4:
                return UNKNOWN_HOST_EXCEPTION;
            case 5:
                return UNAVAILABLE;
            case 6:
                return DEADLINE_EXCEEDED;
            default:
                return null;
        }
    }

    public static aucq b() {
        return aoms.a;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.i;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
