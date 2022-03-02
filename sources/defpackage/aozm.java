package defpackage;

/* renamed from: aozm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aozm extends aucj implements audy {
    public static final aozm e;
    private static volatile auef f;
    public int a;
    public aozk b;
    public auay c = auay.b;
    public auay d = auay.b;

    static {
        aozm aozm = new aozm();
        e = aozm;
        aucj.a(aozm.class, (aucj) aozm);
    }

    private aozm() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aozm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aozm.class) {
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
