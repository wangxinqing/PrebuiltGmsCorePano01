package defpackage;

/* renamed from: nxi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxi extends aucj implements audy {
    public static final nxi e;
    private static volatile auef f;
    public int a;
    public int b = 0;
    public Object c;
    public nxk d;

    static {
        nxi nxi = new nxi();
        e = nxi;
        aucj.a(nxi.class, (aucj) nxi);
    }

    private nxi() {
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
            return aucj.a((audx) e, "\u0001\u0007\u0001\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001\t\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", "a", "d", nxh.class, nwf.class, nxa.class, nwx.class, nxg.class, nxp.class});
        } else if (i2 == 3) {
            return new nxi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nxi.class) {
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
