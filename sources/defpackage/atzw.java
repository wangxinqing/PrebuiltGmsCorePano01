package defpackage;

/* renamed from: atzw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzw extends aucj implements audy {
    public static final atzw e;
    private static volatile auef f;
    public int a;
    public auay b = auay.b;
    public int c;
    public atzr d;

    static {
        atzw atzw = new atzw();
        e = atzw;
        aucj.a(atzw.class, (aucj) atzw);
    }

    private atzw() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\n\u0000\u0003\f\u0001\u0004\t\u0002", new Object[]{"a", "b", "c", atzp.a, "d"});
        } else if (i2 == 3) {
            return new atzw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atzw.class) {
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
