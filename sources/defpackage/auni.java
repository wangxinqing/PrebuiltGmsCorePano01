package defpackage;

/* renamed from: auni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auni implements auco {
    UNKNOWN(0),
    ACCEPTED(1),
    REJECTED(2),
    DELTA_FAILURE(3);
    
    private final int e;

    private auni(int i) {
        this.e = i;
    }

    public static auni a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return ACCEPTED;
        }
        if (i == 2) {
            return REJECTED;
        }
        if (i != 3) {
            return null;
        }
        return DELTA_FAILURE;
    }

    public static aucq b() {
        return aunh.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
