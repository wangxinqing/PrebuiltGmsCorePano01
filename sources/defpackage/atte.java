package defpackage;

/* renamed from: atte  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atte implements auco {
    UNKNOWN_STATE(0),
    DISCONNECTED(1),
    ON_WIFI(2),
    ON_CELLULAR(3);
    
    public final int e;

    private atte(int i) {
        this.e = i;
    }

    public static atte a(int i) {
        if (i == 0) {
            return UNKNOWN_STATE;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return ON_WIFI;
        }
        if (i != 3) {
            return null;
        }
        return ON_CELLULAR;
    }

    public static aucq b() {
        return attd.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
