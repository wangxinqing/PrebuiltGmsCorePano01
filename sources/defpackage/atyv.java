package defpackage;

/* renamed from: atyv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atyv implements auco {
    UNKNOWN(0),
    FLOW(1),
    PROMPT(2);
    
    public final int d;

    private atyv(int i) {
        this.d = i;
    }

    public static atyv a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return FLOW;
        }
        if (i != 2) {
            return null;
        }
        return PROMPT;
    }

    public static aucq b() {
        return atyu.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
