package defpackage;

/* renamed from: aqom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqom extends aucj implements audy {
    public static final aqom e;
    private static volatile auef f;
    public String a = "";
    public auay b = auay.b;
    public aucx c = auei.b;
    public int d;

    static {
        aqom aqom = new aqom();
        e = aqom;
        aucj.a(aqom.class, (aucj) aqom);
    }

    private aqom() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0001\u0000\u0001Ȉ\u0003\n\u0004Ț\u0005\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqom();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqom.class) {
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
