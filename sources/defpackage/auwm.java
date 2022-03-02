package defpackage;

/* renamed from: auwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwm extends aucj implements audy {
    public static final auwm e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public auwg d;

    static {
        auwm auwm = new auwm();
        e = auwm;
        aucj.a(auwm.class, (aucj) auwm);
    }

    private auwm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\t\u0002", new Object[]{"a", "b", avbt.a, "c", "d"});
        } else if (i2 == 3) {
            return new auwm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auwm.class) {
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
