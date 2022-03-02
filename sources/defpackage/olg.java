package defpackage;

/* renamed from: olg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum olg implements auco {
    UNKNOWN_TYPING_STATUS(0),
    TYPING(1),
    TEXT_ENTERED(2),
    NO_TEXT_ENTERED(3);
    
    public final int e;

    private olg(int i) {
        this.e = i;
    }

    public static olg a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPING_STATUS;
        }
        if (i == 1) {
            return TYPING;
        }
        if (i == 2) {
            return TEXT_ENTERED;
        }
        if (i != 3) {
            return null;
        }
        return NO_TEXT_ENTERED;
    }

    public static aucq b() {
        return olf.a;
    }

    public final int a() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.e);
    }
}
