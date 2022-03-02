package defpackage;

/* renamed from: qjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qjf extends aucj implements audy {
    public static final qjf d;
    private static volatile auef e;
    public long a;
    public String b = "";
    public auay c = auay.b;

    static {
        qjf qjf = new qjf();
        d = qjf;
        aucj.a(qjf.class, (aucj) qjf);
    }

    private qjf() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new qjf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (qjf.class) {
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
