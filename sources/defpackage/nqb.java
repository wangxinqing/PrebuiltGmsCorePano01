package defpackage;

/* renamed from: nqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nqb extends aucj implements audy {
    public static final nqb f;
    private static volatile auef g;
    public int a;
    public long b;
    public int c;
    public String d = "";
    public auay e = auay.b;

    static {
        nqb nqb = new nqb();
        f = nqb;
        aucj.a(nqb.class, (aucj) nqb);
    }

    private nqb() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\b\u0002\u0004\n\u0003", new Object[]{"a", "b", "c", nqh.a, "d", "e"});
        } else if (i2 == 3) {
            return new nqb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (nqb.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
