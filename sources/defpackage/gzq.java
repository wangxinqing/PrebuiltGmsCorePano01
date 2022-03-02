package defpackage;

/* renamed from: gzq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum gzq implements auco {
    NO_RESTRICTION(0),
    SW_DEVICE(1),
    LATCHSKY_DEVICE(2);
    
    public final int d;

    private gzq(int i) {
        this.d = i;
    }

    public static gzq a(int i) {
        if (i == 0) {
            return NO_RESTRICTION;
        }
        if (i == 1) {
            return SW_DEVICE;
        }
        if (i != 2) {
            return null;
        }
        return LATCHSKY_DEVICE;
    }

    public static aucq b() {
        return gzp.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
