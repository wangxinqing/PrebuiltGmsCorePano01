package defpackage;

/* renamed from: xlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xlz implements auco {
    UNKNOWN(0),
    CP2(1),
    OFFLINE(2),
    WEB(3);
    
    public final int e;

    private xlz(int i) {
        this.e = i;
    }

    public static xlz a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return CP2;
        }
        if (i == 2) {
            return OFFLINE;
        }
        if (i != 3) {
            return null;
        }
        return WEB;
    }

    public static aucq b() {
        return xly.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
