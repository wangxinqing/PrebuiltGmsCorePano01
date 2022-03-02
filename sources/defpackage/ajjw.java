package defpackage;

/* renamed from: ajjw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum ajjw implements auco {
    WIFI(0),
    CELL(1),
    GPS(2),
    UNKNOWN(3),
    MANUAL(4);
    
    public final int f;

    private ajjw(int i) {
        this.f = i;
    }

    public static ajjw a(int i) {
        if (i == 0) {
            return WIFI;
        }
        if (i == 1) {
            return CELL;
        }
        if (i == 2) {
            return GPS;
        }
        if (i == 3) {
            return UNKNOWN;
        }
        if (i != 4) {
            return null;
        }
        return MANUAL;
    }

    public static aucq b() {
        return ajjv.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
