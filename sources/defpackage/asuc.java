package defpackage;

/* renamed from: asuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asuc extends aucj implements audy {
    public static final asuc f;
    private static volatile auef g;
    public int a;
    public astp b;
    public astn c;
    public int d;
    public long e;

    static {
        asuc asuc = new asuc();
        f = asuc;
        aucj.a(asuc.class, (aucj) asuc);
    }

    private asuc() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0002\u0003\u0002\u0003\u0004\t\u0001", new Object[]{"a", "b", "d", asua.a, "e", "c"});
        } else if (i2 == 3) {
            return new asuc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asuc.class) {
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
