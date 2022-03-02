package defpackage;

/* renamed from: otk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum otk implements auco {
    UNKNOWN(0),
    STARTED(1),
    ENDED(2);
    
    public final int d;

    private otk(int i) {
        this.d = i;
    }

    public static otk a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return STARTED;
        }
        if (i != 2) {
            return null;
        }
        return ENDED;
    }

    public static aucq b() {
        return otj.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
