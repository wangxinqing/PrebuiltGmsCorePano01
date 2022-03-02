package defpackage;

/* renamed from: antj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antj extends aucj implements audy {
    public static final antj d;
    private static volatile auef e;
    public int a;
    public int b;
    public int c;

    static {
        antj antj = new antj();
        d = antj;
        aucj.a(antj.class, (aucj) antj);
    }

    private antj() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\b\u000b", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new antj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (antj.class) {
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
