package defpackage;

/* renamed from: asas  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asas extends aucj implements audy {
    public static final asas e;
    private static volatile auef f;
    public int a;
    public long b;
    public int c;
    public long d;

    static {
        asas asas = new asas();
        e = asas;
        aucj.a(asas.class, (aucj) asas);
    }

    private asas() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", asaq.a, "d"});
        } else if (i2 == 3) {
            return new asas();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asas.class) {
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
