package defpackage;

/* renamed from: astm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class astm extends aucj implements audy {
    public static final astm e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public aucv d = audl.b;

    static {
        astm astm = new astm();
        e = astm;
        aucj.a(astm.class, (aucj) astm);
    }

    private astm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0014", new Object[]{"a", "b", astl.b(), "c", "d"});
        } else if (i2 == 3) {
            return new astm();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (astm.class) {
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
