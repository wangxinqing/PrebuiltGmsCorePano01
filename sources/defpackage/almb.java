package defpackage;

/* renamed from: almb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almb extends aucj implements audy {
    public static final almb g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public int e;
    public String f = "";

    static {
        almb almb = new almb();
        g = almb;
        aucj.a(almb.class, (aucj) almb);
    }

    private almb() {
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
            return aucj.a((audx) g, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\b\u0002\u0004<\u0000", new Object[]{"c", "b", "a", "d", "e", auht.a, "f", auhr.class});
        } else if (i2 == 3) {
            return new almb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (almb.class) {
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
