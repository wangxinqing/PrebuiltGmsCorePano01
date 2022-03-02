package defpackage;

/* renamed from: aawb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aawb implements auco {
    THREAT_ENTRY_TYPE_UNSPECIFIED(0),
    URL_EXPRESSION(1),
    BINARY_DIGEST(2),
    IP_RANGE(3);
    
    public final int e;

    private aawb(int i) {
        this.e = i;
    }

    public static aawb a(int i) {
        if (i == 0) {
            return THREAT_ENTRY_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return URL_EXPRESSION;
        }
        if (i == 2) {
            return BINARY_DIGEST;
        }
        if (i != 3) {
            return null;
        }
        return IP_RANGE;
    }

    public static aucq b() {
        return aawa.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
