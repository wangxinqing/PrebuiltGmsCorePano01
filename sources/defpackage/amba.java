package defpackage;

/* renamed from: amba  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amba extends aucj implements audy {
    public static final amba g;
    private static volatile auef h;
    public int a;
    public aucs b = aucl.b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;

    static {
        amba amba = new amba();
        g = amba;
        aucj.a(amba.class, (aucj) amba);
    }

    private amba() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u001e\u0003\u0007\u0001\u0004\u000b\u0002\u0005\u0007\u0003\u0006\f\u0004", new Object[]{"a", "b", ambp.b(), "c", "d", "e", "f", amda.a});
        } else if (i2 == 3) {
            return new amba();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (amba.class) {
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
