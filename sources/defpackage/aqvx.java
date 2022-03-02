package defpackage;

/* renamed from: aqvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqvx extends aucj implements audy {
    public static final aqvx b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        aqvx aqvx = new aqvx();
        b = aqvx;
        aucj.a(aqvx.class, (aucj) aqvx);
    }

    private aqvx() {
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"a"});
        } else if (i2 == 3) {
            return new aqvx();
        } else {
            if (i2 == 4) {
                return new aqvv();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aqvx.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
