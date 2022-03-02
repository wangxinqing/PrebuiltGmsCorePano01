package defpackage;

/* renamed from: aocr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum aocr implements auco {
    HOME(0),
    WORK(1),
    NICKNAME(2);
    
    public final int d;

    private aocr(int i) {
        this.d = i;
    }

    public static aocr a(int i) {
        if (i == 0) {
            return HOME;
        }
        if (i == 1) {
            return WORK;
        }
        if (i != 2) {
            return null;
        }
        return NICKNAME;
    }

    public static aucq b() {
        return aocq.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
