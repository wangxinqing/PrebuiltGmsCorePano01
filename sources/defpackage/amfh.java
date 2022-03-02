package defpackage;

/* renamed from: amfh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum amfh implements auco {
    ATTRIBUTE_UNKNOWN(0),
    STARRED(1);
    
    public final int c;

    private amfh(int i) {
        this.c = i;
    }

    public static amfh a(int i) {
        if (i == 0) {
            return ATTRIBUTE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return STARRED;
    }

    public static aucq b() {
        return amfg.a;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
