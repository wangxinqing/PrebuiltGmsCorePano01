package defpackage;

/* renamed from: apfb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfb extends aucj implements audy {
    public static final apfb g;
    private static volatile auef h;
    public int a;
    public apfy b;
    public auay c = auay.b;
    public aucx d = auei.b;
    public auay e = auay.b;
    public boolean f;

    static {
        apfb apfb = new apfb();
        g = apfb;
        aucj.a(apfb.class, (aucj) apfb);
    }

    private apfb() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\n\u0001\u0003\u001b\u0004\n\u0002\u0005\u0007\u0003", new Object[]{"a", "b", "c", "d", apfx.class, "e", "f"});
        } else if (i2 == 3) {
            return new apfb();
        } else {
            if (i2 == 4) {
                return new apfa();
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apfb.class) {
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
