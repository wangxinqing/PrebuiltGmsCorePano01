package defpackage;

/* renamed from: asao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public enum asao implements auco {
    UNKNOWN_PACKET_TYPE(0),
    DATA(1),
    CONTROL(2);
    
    public final int d;

    private asao(int i) {
        this.d = i;
    }

    public static asao a(int i) {
        if (i == 0) {
            return UNKNOWN_PACKET_TYPE;
        }
        if (i == 1) {
            return DATA;
        }
        if (i != 2) {
            return null;
        }
        return CONTROL;
    }

    public static aucq b() {
        return asan.a;
    }

    public final int a() {
        return this.d;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
