package defpackage;

/* renamed from: nxl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxl extends aucj implements audy {
    public static final nxl e;
    private static volatile auef f;
    public int a;
    public long b;
    public long c;
    public long d;

    static {
        nxl nxl = new nxl();
        e = nxl;
        aucj.a(nxl.class, (aucj) nxl);
    }

    private nxl() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new nxl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nxl.class) {
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
