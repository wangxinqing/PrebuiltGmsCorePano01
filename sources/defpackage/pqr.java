package defpackage;

/* renamed from: pqr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqr extends aucj implements audy {
    public static final pqr c;
    private static volatile auef e;
    public aucx a = auei.b;
    public int b;
    private int d;

    static {
        pqr pqr = new pqr();
        c = pqr;
        aucj.a(pqr.class, (aucj) pqr);
    }

    private pqr() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004\u0000", new Object[]{"d", "a", pqq.class, "b"});
        } else if (i2 == 3) {
            return new pqr();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (pqr.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
