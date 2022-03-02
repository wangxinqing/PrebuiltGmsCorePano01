package defpackage;

/* renamed from: qhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qhg extends aucj implements audy {
    public static final qhg d;
    private static volatile auef e;
    public String a = "";
    public int b;
    public int c;

    static {
        qhg qhg = new qhg();
        d = qhg;
        aucj.a(qhg.class, (aucj) qhg);
    }

    private qhg() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qhg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (qhg.class) {
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
