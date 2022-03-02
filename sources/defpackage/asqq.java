package defpackage;

/* renamed from: asqq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqq extends aucj implements audy {
    public static final asqq d;
    private static volatile auef e;
    public asqj a;
    public auay b = auay.b;
    public asqt c;

    static {
        asqq asqq = new asqq();
        d = asqq;
        aucj.a(asqq.class, (aucj) asqq);
    }

    private asqq() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0003\n\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new asqq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asqq.class) {
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
