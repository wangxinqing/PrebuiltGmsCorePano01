package defpackage;

/* renamed from: aqoj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqoj extends aucj implements audy {
    public static final aqoj c;
    private static volatile auef d;
    public int a = 0;
    public Object b;

    static {
        aqoj aqoj = new aqoj();
        c = aqoj;
        aucj.a(aqoj.class, (aucj) aqoj);
    }

    private aqoj() {
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
            return aucj.a((audx) c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", aqof.class, aqoh.class, aqoi.class, aqog.class});
        } else if (i2 == 3) {
            return new aqoj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqoj.class) {
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
