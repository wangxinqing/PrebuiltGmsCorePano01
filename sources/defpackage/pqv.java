package defpackage;

/* renamed from: pqv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqv extends aucj implements audy {
    public static final pqv c;
    private static volatile auef d;
    public int a;
    public pqu b;

    static {
        pqv pqv = new pqv();
        c = pqv;
        aucj.a(pqv.class, (aucj) pqv);
    }

    private pqv() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005\t\u0001", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new pqv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (pqv.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
