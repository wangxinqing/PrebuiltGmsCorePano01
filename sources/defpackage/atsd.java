package defpackage;

/* renamed from: atsd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsd extends aucj implements audy {
    public static final atsd f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        atsd atsd = new atsd();
        f = atsd;
        aucj.a(atsd.class, (aucj) atsd);
    }

    private atsd() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", "d", "e", atso.a});
        } else if (i2 == 3) {
            return new atsd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atsd.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
