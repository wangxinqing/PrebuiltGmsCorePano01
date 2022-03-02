package defpackage;

/* renamed from: avuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum avuv implements auco {
    UNSPECIFIED(0),
    SUCCESS(1),
    FAILURE(2),
    UNRECOGNIZED(-1);
    
    private final int e;

    private avuv(int i) {
        this.e = i;
    }

    public static avuv a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return FAILURE;
    }

    public final String toString() {
        return Integer.toString(a());
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
