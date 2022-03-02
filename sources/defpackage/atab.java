package defpackage;

/* renamed from: atab  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum atab implements auco {
    UNKNOWN_TYPE(0),
    CONFIRMED_HOME(1),
    CONFIRMED_WORK(2),
    INFERRED_HOME(3),
    INFERRED_WORK(4);
    
    public final int f;

    private atab(int i) {
        this.f = i;
    }

    public static atab a(int i) {
        if (i == 0) {
            return UNKNOWN_TYPE;
        }
        if (i == 1) {
            return CONFIRMED_HOME;
        }
        if (i == 2) {
            return CONFIRMED_WORK;
        }
        if (i == 3) {
            return INFERRED_HOME;
        }
        if (i != 4) {
            return null;
        }
        return INFERRED_WORK;
    }

    public static aucq b() {
        return ataa.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
