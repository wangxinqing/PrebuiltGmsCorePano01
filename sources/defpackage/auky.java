package defpackage;

/* renamed from: auky  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum auky implements auco {
    UNKNOWN(0),
    UPDATE(1),
    RESET(2);
    
    public final int d;

    private auky(int i) {
        this.d = i;
    }

    public static auky a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UPDATE;
        }
        if (i != 2) {
            return null;
        }
        return RESET;
    }

    public static aucq b() {
        return aukx.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
