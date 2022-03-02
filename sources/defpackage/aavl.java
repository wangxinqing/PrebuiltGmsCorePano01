package defpackage;

/* renamed from: aavl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavl extends aucj implements audy {
    public static final aavl g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public auay e = auay.b;
    public aavk f;

    static {
        aavl aavl = new aavl();
        g = aavl;
        aucj.a(aavl.class, (aucj) aavl);
    }

    private aavl() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\n\u0003\u0004\t\u0004\u0005\f\u0002", new Object[]{"a", "b", "c", "e", "f", "d", aawb.b()});
        } else if (i2 == 3) {
            return new aavl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aavl.class) {
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
