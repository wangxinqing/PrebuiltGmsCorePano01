package defpackage;

/* renamed from: avks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avks extends aucj implements audy {
    public static final avks g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public double d;
    public int e;
    public int f;

    static {
        avks avks = new avks();
        g = avks;
        aucj.a(avks.class, (aucj) avks);
    }

    private avks() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0000\u0002\u0005\f\u0004\u0006\f\u0005", new Object[]{"a", "b", avkr.a, "c", avkq.a, "d", "e", avkp.a, "f", avkp.a});
        } else if (i2 == 3) {
            return new avks();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avks.class) {
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
