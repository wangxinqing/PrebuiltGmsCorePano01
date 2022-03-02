package defpackage;

/* renamed from: bnp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bnp extends aucj implements audy {
    public static final bnp d;
    private static volatile auef e;
    public int a;
    public int b = -1;
    public aucs c = aucl.b;

    static {
        bnp bnp = new bnp();
        d = bnp;
        aucj.a(bnp.class, (aucj) bnp);
    }

    private bnp() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0016", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new bnp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (bnp.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
