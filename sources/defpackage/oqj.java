package defpackage;

/* renamed from: oqj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum oqj implements auco {
    UNKNOWN(0),
    READ(1),
    WRITE(2);
    
    public final int d;

    private oqj(int i) {
        this.d = i;
    }

    public static oqj a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return READ;
        }
        if (i != 2) {
            return null;
        }
        return WRITE;
    }

    public static aucq b() {
        return oqi.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
