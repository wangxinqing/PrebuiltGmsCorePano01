package defpackage;

/* renamed from: oum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oum extends aucj implements audy {
    public static final oum e;
    private static volatile auef g;
    public aucs a = aucl.b;
    public auay b = auay.b;
    public aucs c = aucl.b;
    public auay d = auay.b;
    private int f;

    static {
        oum oum = new oum();
        e = oum;
        aucj.a(oum.class, (aucj) oum);
    }

    private oum() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001'\u0002\n\u0002\u0003'\u0004\n\u0003", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new oum();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (oum.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
