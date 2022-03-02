package defpackage;

/* renamed from: aufy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aufy {
    static final int a = a(1, 3);
    static final int b = a(1, 4);
    static final int c = a(2, 0);
    static final int d = a(3, 2);

    public static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
