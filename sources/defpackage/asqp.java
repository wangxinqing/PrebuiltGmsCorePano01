package defpackage;

/* renamed from: asqp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asqp extends aucj implements audy {
    public static final asqp e;
    private static volatile auef f;
    public long a;
    public int b;
    public String c = "";
    public long d;

    static {
        asqp asqp = new asqp();
        e = asqp;
        aucj.a(asqp.class, (aucj) asqp);
    }

    private asqp() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0002\u0002\f\u0003Ȉ\u0005\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new asqp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asqp.class) {
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
