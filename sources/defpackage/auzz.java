package defpackage;

/* renamed from: auzz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auzz extends aucj implements audy {
    public static final auzz d;
    private static volatile auef f;
    public int a;
    public int b;
    public double c;
    private atjt e;

    static {
        auzz auzz = new auzz();
        d = auzz;
        aucj.a(auzz.class, (aucj) auzz);
    }

    private auzz() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0000\u0001\u0003\t\u0002", new Object[]{"a", "b", avbi.a, "c", "e"});
        } else if (i2 == 3) {
            return new auzz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auzz.class) {
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
