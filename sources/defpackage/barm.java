package defpackage;

/* renamed from: barm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum barm implements auco {
    UNKNOWN(0),
    CRONET(1);
    
    public final int c;

    private barm(int i) {
        this.c = i;
    }

    public static barm a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CRONET;
    }

    public static aucq b() {
        return barl.a;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
