package com.google.ads.afma.proto2api;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class d extends aucj implements audy {
    public static final d f;
    private static volatile auef g;
    public int a;
    public auay b = auay.b;
    public auay c = auay.b;
    public auay d = auay.b;
    public auay e = auay.b;

    static {
        d dVar = new d();
        f = dVar;
        aucj.a(d.class, (aucj) dVar);
    }

    private d() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new d();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (d.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
