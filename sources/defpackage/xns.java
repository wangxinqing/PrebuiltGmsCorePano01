package defpackage;

/* renamed from: xns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xns extends aucj implements audy {
    public static final xns d;
    private static volatile auef e;
    public int a;
    public int b;
    public long c;

    static {
        xns xns = new xns();
        d = xns;
        aucj.a(xns.class, (aucj) xns);
    }

    private xns() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001", new Object[]{"a", "b", xnr.a, "c"});
        } else if (i2 == 3) {
            return new xns();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (xns.class) {
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
