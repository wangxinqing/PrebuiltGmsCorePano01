package defpackage;

/* renamed from: hfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hfp extends aucj implements audy {
    public static final hfp g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public aucx c = auei.b;
    public String d = "";
    public int e;
    public int f;

    static {
        hfp hfp = new hfp();
        g = hfp;
        aucj.a(hfp.class, (aucj) hfp);
    }

    private hfp() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\b\u0000\u0003\u001b\u0004\b\u0002\u0005\f\u0003\u0006\f\u0004", new Object[]{"a", "b", "c", boc.class, "d", "e", hfl.a, "f", hfn.a});
        } else if (i2 == 3) {
            return new hfp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (hfp.class) {
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
