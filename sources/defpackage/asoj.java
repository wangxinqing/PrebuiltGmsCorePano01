package defpackage;

/* renamed from: asoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asoj implements auco {
    UNKNOWN_SESSION_ROLE(0),
    ADVERTISER(1),
    DISCOVERER(2);
    
    public final int d;

    private asoj(int i) {
        this.d = i;
    }

    public static asoj a(int i) {
        if (i == 0) {
            return UNKNOWN_SESSION_ROLE;
        }
        if (i == 1) {
            return ADVERTISER;
        }
        if (i != 2) {
            return null;
        }
        return DISCOVERER;
    }

    public static aucq b() {
        return asoi.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
