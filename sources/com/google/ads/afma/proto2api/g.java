package com.google.ads.afma.proto2api;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class g extends aucj implements audy {
    public static final g e;
    private static volatile auef f;
    public int a;
    public long b;
    public String c = "";
    public auay d = auay.b;

    static {
        g gVar = new g();
        e = gVar;
        aucj.a(g.class, (aucj) gVar);
    }

    private g() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new g();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (g.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
