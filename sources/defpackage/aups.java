package defpackage;

/* renamed from: aups  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aups implements auco {
    UNKNOWN(0),
    NO_WHITELIST(1),
    PLAYPASS(2);
    
    public final int d;

    private aups(int i) {
        this.d = i;
    }

    public static aups a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return NO_WHITELIST;
        }
        if (i != 2) {
            return null;
        }
        return PLAYPASS;
    }

    public static aucq b() {
        return aupr.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
