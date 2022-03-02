package defpackage;

/* renamed from: aqvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqvf extends aucj implements audy {
    public static final aqvf c;
    private static volatile auef d;
    public aucs a = aucl.b;
    public avlm b;

    static {
        aqvf aqvf = new aqvf();
        c = aqvf;
        aucj.a(aqvf.class, (aucj) aqvf);
    }

    private aqvf() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001,\u0002\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqvf();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqvf.class) {
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
