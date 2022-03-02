package defpackage;

/* renamed from: asqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asqy implements auco {
    HOME(0),
    WORK(1),
    NICKNAME(2),
    INFERRED_HOME(3),
    INFERRED_WORK(4);
    
    public final int f;

    private asqy(int i) {
        this.f = i;
    }

    public static asqy a(int i) {
        if (i == 0) {
            return HOME;
        }
        if (i == 1) {
            return WORK;
        }
        if (i == 2) {
            return NICKNAME;
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
        return asqx.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
