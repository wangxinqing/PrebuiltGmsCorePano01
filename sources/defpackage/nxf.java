package defpackage;

/* renamed from: nxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxf extends aucj implements audy {
    public static final nxf e;
    private static volatile auef f;
    public int a;
    public int b = 0;
    public Object c;
    public int d;

    static {
        nxf nxf = new nxf();
        e = nxf;
        aucj.a(nxf.class, (aucj) nxf);
    }

    private nxf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"c", "b", "a", "d", nxe.a, nwy.class, nws.class});
        } else if (i2 == 3) {
            return new nxf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nxf.class) {
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
