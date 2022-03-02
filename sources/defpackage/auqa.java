package defpackage;

/* renamed from: auqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqa extends aucj implements audy {
    public static final auqa g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public aupy d;
    public bcp e;
    public int f;

    static {
        auqa auqa = new auqa();
        g = auqa;
        aucj.a(auqa.class, (aucj) auqa);
    }

    private auqa() {
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
            return aucj.a((audx) g, "\u0001\b\u0001\u0001\u0001f\b\u0000\u0000\u0000\u0001=\u0000\u0002=\u0000\u0003<\u0000\u0004=\u0000\u0005<\u0000d\t\u0006e\t\u0007f\f\b", new Object[]{"c", "b", "a", aupz.class, aupv.class, "d", "e", "f", bcn.a});
        } else if (i2 == 3) {
            return new auqa();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auqa.class) {
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
