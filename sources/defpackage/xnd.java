package defpackage;

/* renamed from: xnd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xnd implements auco {
    UNSPECIFIED(0),
    INSERT(1),
    UPDATE(2),
    REMOVE(3);
    
    public final int e;

    private xnd(int i) {
        this.e = i;
    }

    public static xnd a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return INSERT;
        }
        if (i == 2) {
            return UPDATE;
        }
        if (i != 3) {
            return null;
        }
        return REMOVE;
    }

    public static aucq b() {
        return xnc.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
