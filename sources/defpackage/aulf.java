package defpackage;

/* renamed from: aulf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aulf implements auco {
    UNKNOWN(0),
    UPDATE(1),
    RESET(2),
    DELETE(3);
    
    public final int e;

    private aulf(int i) {
        this.e = i;
    }

    public static aulf a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return UPDATE;
        }
        if (i == 2) {
            return RESET;
        }
        if (i != 3) {
            return null;
        }
        return DELETE;
    }

    public static aucq b() {
        return aule.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
