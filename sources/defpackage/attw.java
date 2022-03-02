package defpackage;

/* renamed from: attw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum attw implements auco {
    UNKNOWN(0),
    DISCONNECTED(1),
    CONNECTED_USB(2),
    CONNECTED_AC(3),
    CONNECTED_WIRELESS(4);
    
    public final int f;

    private attw(int i) {
        this.f = i;
    }

    public static attw a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return DISCONNECTED;
        }
        if (i == 2) {
            return CONNECTED_USB;
        }
        if (i == 3) {
            return CONNECTED_AC;
        }
        if (i != 4) {
            return null;
        }
        return CONNECTED_WIRELESS;
    }

    public static aucq b() {
        return attv.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
