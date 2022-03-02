package defpackage;

/* renamed from: amfq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum amfq implements auco {
    UNKNOWN(0),
    OWNER(1),
    PUBLIC_READ(2),
    DOMAIN_READ(3),
    YOUR_CIRCLES_READ(4),
    EXTENDED_CIRCLES_READ(5);
    
    public final int g;

    private amfq(int i) {
        this.g = i;
    }

    public static amfq a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return OWNER;
        }
        if (i == 2) {
            return PUBLIC_READ;
        }
        if (i == 3) {
            return DOMAIN_READ;
        }
        if (i == 4) {
            return YOUR_CIRCLES_READ;
        }
        if (i != 5) {
            return null;
        }
        return EXTENDED_CIRCLES_READ;
    }

    public static aucq b() {
        return amfp.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
