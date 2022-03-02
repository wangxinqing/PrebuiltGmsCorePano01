package com.google.ads.afma.proto2api;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class h extends aucj implements audy {
    public static final h e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public auay c = auay.b;
    public int d = 1;

    static {
        h hVar = new h();
        e = hVar;
        aucj.a(h.class, (aucj) hVar);
    }

    private h() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0004\f\u0002", new Object[]{"a", "b", "c", "d", e.a});
        } else if (i2 == 3) {
            return new h();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (h.class) {
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
