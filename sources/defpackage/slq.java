package defpackage;

/* renamed from: slq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum slq implements auco {
    UNKNOWN(0),
    PROFILE_SYNC(1),
    WIPEOUT(2);
    
    public final int d;

    private slq(int i) {
        this.d = i;
    }

    public static slq a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PROFILE_SYNC;
        }
        if (i != 2) {
            return null;
        }
        return WIPEOUT;
    }

    public static aucq b() {
        return slp.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
