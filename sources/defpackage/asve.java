package defpackage;

/* renamed from: asve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asve extends aucj implements audy {
    public static final asve g;
    private static volatile auef h;
    public int a;
    public asvc b;
    public aucx c = auei.b;
    public int d;
    public int e;
    public asva f;

    static {
        asve asve = new asve();
        g = asve;
        aucj.a(asve.class, (aucj) asve);
    }

    private asve() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0000\u0003\u001b\u0004\u0004\u0002\u0005\u0004\u0003\u0006\t\u0004", new Object[]{"a", "b", "c", asvh.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new asve();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (asve.class) {
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
