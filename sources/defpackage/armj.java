package defpackage;

/* renamed from: armj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class armj extends aucj implements audy {
    public static final armj d;
    private static volatile auef e;
    public int a;
    public int b;
    public int c;

    static {
        armj armj = new armj();
        d = armj;
        aucj.a(armj.class, (aucj) armj);
    }

    private armj() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\f\u0000\u0003\f\u0001", new Object[]{"a", "b", armg.a, "c", armi.a});
        } else if (i2 == 3) {
            return new armj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (armj.class) {
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
