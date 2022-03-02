package defpackage;

/* renamed from: bca  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bca extends aucj implements audy {
    public static final bca g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    static {
        bca bca = new bca();
        g = bca;
        aucj.a(bca.class, (aucj) bca);
    }

    private bca() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0007\u0004", new Object[]{"a", "b", bbq.a, "c", avsd.b(), "d", bbx.b(), "e", "f"});
        } else if (i2 == 3) {
            return new bca();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (bca.class) {
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
