package defpackage;

/* renamed from: auyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyg extends aucj implements audy {
    public static final auyg g;
    private static volatile auef h;
    public int a;
    public long b = 8;
    public long c;
    public long d;
    public long e = 40;
    public double f = 1.0d;

    static {
        auyg auyg = new auyg();
        g = auyg;
        aucj.a(auyg.class, (aucj) auyg);
    }

    private auyg() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0000\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new auyg();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auyg.class) {
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
