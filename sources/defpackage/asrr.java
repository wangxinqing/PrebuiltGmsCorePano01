package defpackage;

/* renamed from: asrr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrr extends aucj implements audy {
    public static final asrr d;
    private static volatile auef e;
    public int a;
    public asuu b;
    public int c;

    static {
        asrr asrr = new asrr();
        d = asrr;
        aucj.a(asrr.class, (aucj) asrr);
    }

    private asrr() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001", new Object[]{"a", "b", "c", asqy.b()});
        } else if (i2 == 3) {
            return new asrr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asrr.class) {
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
