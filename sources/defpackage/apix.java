package defpackage;

/* renamed from: apix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum apix implements auco {
    UNKNOWN_FAMILY_ROLE(0),
    HEAD_OF_HOUSEHOLD(1),
    PARENT(2),
    MEMBER(3),
    CHILD(4),
    UNCONFIRMED_MEMBER(5);
    
    public final int g;

    private apix(int i) {
        this.g = i;
    }

    public static apix a(int i) {
        if (i == 0) {
            return UNKNOWN_FAMILY_ROLE;
        }
        if (i == 1) {
            return HEAD_OF_HOUSEHOLD;
        }
        if (i == 2) {
            return PARENT;
        }
        if (i == 3) {
            return MEMBER;
        }
        if (i == 4) {
            return CHILD;
        }
        if (i != 5) {
            return null;
        }
        return UNCONFIRMED_MEMBER;
    }

    public static aucq b() {
        return apiw.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
