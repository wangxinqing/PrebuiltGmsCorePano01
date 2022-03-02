package defpackage;

/* renamed from: augm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum augm implements auco {
    NONE(0),
    CALL(1),
    CAPTURE(2),
    HOTWORD(3),
    PREEMPT(4);
    
    public final int f;

    private augm(int i) {
        this.f = i;
    }

    public static augm a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return CALL;
        }
        if (i == 2) {
            return CAPTURE;
        }
        if (i == 3) {
            return HOTWORD;
        }
        if (i != 4) {
            return null;
        }
        return PREEMPT;
    }

    public static aucq b() {
        return augl.a;
    }

    public final int a() {
        return this.f;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }

    public static augm a(String str) {
        return (augm) Enum.valueOf(augm.class, str);
    }
}
