package defpackage;

/* renamed from: aunz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aunz extends aucj implements audy {
    public static final aunz c;
    public static final aucw d = new aucw(aunx.RESULT_UNKNOWN);
    private static volatile auef f;
    public int a;
    public audr b = audr.b;
    private int e;

    static {
        aunx aunx = aunx.RESULT_UNKNOWN;
        aunz aunz = new aunz();
        c = aunz;
        aucj.a(aunz.class, (aucj) aunz);
    }

    private aunz() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\f\u0000\u0002࠲", new Object[]{"e", "a", aunx.b(), "b", auny.a, aunx.b()});
        } else if (i2 == 3) {
            return new aunz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aunz.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
