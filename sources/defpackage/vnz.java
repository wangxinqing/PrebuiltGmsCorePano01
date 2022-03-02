package defpackage;

/* renamed from: vnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum vnz implements auco {
    UNKNOWN_SECURITY_TYPE(0),
    OPEN(1),
    WPA_PSK(2),
    WEP(3);
    
    public final int e;

    private vnz(int i) {
        this.e = i;
    }

    public static vnz a(int i) {
        if (i == 0) {
            return UNKNOWN_SECURITY_TYPE;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i == 2) {
            return WPA_PSK;
        }
        if (i != 3) {
            return null;
        }
        return WEP;
    }

    public static aucq b() {
        return vny.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
