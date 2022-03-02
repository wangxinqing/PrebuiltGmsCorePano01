package defpackage;

/* renamed from: xjm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum xjm implements auco {
    UNSPECIFIED(0),
    CP2(1),
    SERVER(2);
    
    public final int d;

    private xjm(int i) {
        this.d = i;
    }

    public static xjm a(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CP2;
        }
        if (i != 2) {
            return null;
        }
        return SERVER;
    }

    public static aucq b() {
        return xjl.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
