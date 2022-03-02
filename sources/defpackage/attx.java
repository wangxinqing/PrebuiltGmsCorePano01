package defpackage;

/* renamed from: attx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class attx extends aucj implements audy {
    public static final attx d;
    public static final auci e;
    private static volatile auef f;
    public int a;
    public int b;
    public double c;

    static {
        attx attx = new attx();
        d = attx;
        aucj.a(attx.class, (aucj) attx);
        atjm atjm = atjm.a;
        attx attx2 = d;
        e = aucj.a((audx) atjm, (Object) attx2, (audx) attx2, 87654321, aufw.MESSAGE);
    }

    private attx() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0000\u0001", new Object[]{"a", "b", attw.b(), "c"});
        } else if (i2 == 3) {
            return new attx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (attx.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
