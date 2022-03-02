package defpackage;

/* renamed from: nig  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nig extends aucj implements audy {
    public static final nig g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public String e = "";
    public int f;

    static {
        nig nig = new nig();
        g = nig;
        aucj.a(nig.class, (aucj) nig);
    }

    private nig() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\b\u0003\u0005\f\u0004", new Object[]{"a", "b", "c", "d", "e", "f", nif.a});
        } else if (i2 == 3) {
            return new nig();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (nig.class) {
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
