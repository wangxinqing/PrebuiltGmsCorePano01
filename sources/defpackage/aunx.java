package defpackage;

/* renamed from: aunx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aunx implements auco {
    RESULT_UNKNOWN(0),
    RESULT_SUCCESS(1),
    RESULT_RESCHEDULE(2),
    RESULT_FAILURE(3),
    RESULT_RETHROW(4);
    
    public static final aucp f = null;
    public final int g;

    static {
        f = new aunv();
    }

    private aunx(int i) {
        this.g = i;
    }

    public static aunx a(int i) {
        if (i == 0) {
            return RESULT_UNKNOWN;
        }
        if (i == 1) {
            return RESULT_SUCCESS;
        }
        if (i == 2) {
            return RESULT_RESCHEDULE;
        }
        if (i == 3) {
            return RESULT_FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return RESULT_RETHROW;
    }

    public static aucq b() {
        return aunw.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
