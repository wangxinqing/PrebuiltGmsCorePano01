package defpackage;

/* renamed from: almv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almv extends aucj implements audy {
    public static final almv g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public String e = "";
    public String f = "";

    static {
        almv almv = new almv();
        g = almv;
        aucj.a(almv.class, (aucj) almv);
    }

    private almv() {
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
            return aucj.a((audx) g, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004<\u0000", new Object[]{"c", "b", "a", "d", auht.a, "e", "f", auhu.class});
        } else if (i2 == 3) {
            return new almv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (almv.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
