package defpackage;

/* renamed from: arji  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum arji implements auco {
    INVALID_TRANSITION(0),
    ENTER(1),
    EXIT(2);
    
    public final int d;

    private arji(int i) {
        this.d = i;
    }

    public static arji a(int i) {
        if (i == 0) {
            return INVALID_TRANSITION;
        }
        if (i == 1) {
            return ENTER;
        }
        if (i != 2) {
            return null;
        }
        return EXIT;
    }

    public static aucq b() {
        return arjh.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
