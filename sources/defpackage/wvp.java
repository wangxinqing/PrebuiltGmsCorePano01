package defpackage;

/* renamed from: wvp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wvp extends aucj implements audy {
    public static final wvp g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public wvk f;

    static {
        wvp wvp = new wvp();
        g = wvp;
        aucj.a(wvp.class, (aucj) wvp);
    }

    private wvp() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003\u0005\t\u0004", new Object[]{"a", "b", wvo.b(), "c", wvl.a, "d", wvc.b(), "e", wvg.a, "f"});
        } else if (i2 == 3) {
            return new wvp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (wvp.class) {
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
