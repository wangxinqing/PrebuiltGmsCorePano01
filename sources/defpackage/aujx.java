package defpackage;

/* renamed from: aujx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aujx implements auco {
    UNKNOWN(0),
    READ(1),
    READ_WRITE(2),
    READ_DRAIN(3);
    
    private final int e;

    private aujx(int i) {
        this.e = i;
    }

    public static aujx a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return READ;
        }
        if (i == 2) {
            return READ_WRITE;
        }
        if (i != 3) {
            return null;
        }
        return READ_DRAIN;
    }

    public static aucq b() {
        return aujw.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
