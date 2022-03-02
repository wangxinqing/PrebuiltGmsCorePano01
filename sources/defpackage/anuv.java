package defpackage;

/* renamed from: anuv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuv extends aucj implements audy {
    public static final anuv g;
    private static volatile auef h;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        anuv anuv = new anuv();
        g = anuv;
        aucj.a(anuv.class, (aucj) anuv);
    }

    private anuv() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0007\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new anuv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anuv.class) {
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
