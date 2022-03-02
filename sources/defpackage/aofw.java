package defpackage;

/* renamed from: aofw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aofw implements auco {
    UNDEFINED(0),
    INFERRED_HOME(1),
    INFERRED_WORK(2);
    
    public final int d;

    private aofw(int i) {
        this.d = i;
    }

    public static aofw a(int i) {
        if (i == 0) {
            return UNDEFINED;
        }
        if (i == 1) {
            return INFERRED_HOME;
        }
        if (i != 2) {
            return null;
        }
        return INFERRED_WORK;
    }

    public static aucq b() {
        return aofv.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
