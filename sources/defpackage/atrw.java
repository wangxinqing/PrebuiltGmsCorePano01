package defpackage;

/* renamed from: atrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atrw implements auco {
    UNKNOWN_STATE(0),
    IN_SHUSH(1),
    NOT_IN_SHUSH(2);
    
    public final int d;

    private atrw(int i) {
        this.d = i;
    }

    public static atrw a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return IN_SHUSH;
        }
        if (i != 2) {
            return null;
        }
        return NOT_IN_SHUSH;
    }

    public static aucq b() {
        return atrv.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
