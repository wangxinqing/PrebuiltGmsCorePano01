package defpackage;

/* renamed from: atrj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atrj extends aucj implements audy {
    public static final atrj e;
    private static volatile auef g;
    public atre a;
    public String b = "";
    public int c;
    public atjt d;
    private int f;

    static {
        atrj atrj = new atrj();
        e = atrj;
        aucj.a(atrj.class, (aucj) atrj);
    }

    private atrj() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001\u0003\f\u0002\u0004\t\u0003", new Object[]{"f", "a", "b", "c", atrh.a, "d"});
        } else if (i2 == 3) {
            return new atrj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atrj.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
