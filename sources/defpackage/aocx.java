package defpackage;

/* renamed from: aocx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aocx implements auco {
    UNKNOWN(0),
    HOME(1),
    WORK(2),
    NICKNAME(3),
    INFERRED_HOME(4),
    INFERRED_WORK(5);
    
    public final int g;

    private aocx(int i) {
        this.g = i;
    }

    public static aocx a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return HOME;
        }
        if (i == 2) {
            return WORK;
        }
        if (i == 3) {
            return NICKNAME;
        }
        if (i == 4) {
            return INFERRED_HOME;
        }
        if (i != 5) {
            return null;
        }
        return INFERRED_WORK;
    }

    public static aucq b() {
        return aocw.a;
    }

    public final int a() {
        return this.g;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
