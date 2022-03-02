package defpackage;

/* renamed from: pqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqu extends aucj implements audy {
    public static final pqu f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public aucx c = auei.b;
    public int d;
    public boolean e;

    static {
        pqu pqu = new pqu();
        f = pqu;
        aucj.a(pqu.class, (aucj) pqu);
    }

    private pqu() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u001b\u0003\u0004\u0001\u0004\u0007\u0002", new Object[]{"a", "b", "c", pqt.class, "d", "e"});
        } else if (i2 == 3) {
            return new pqu();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (pqu.class) {
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
