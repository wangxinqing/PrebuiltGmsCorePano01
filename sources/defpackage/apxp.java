package defpackage;

/* renamed from: apxp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apxp extends aucj implements audy {
    public static final apxp g;
    private static volatile auef h;
    public int a;
    public apxk b;
    public long c;
    public int d;
    public int e;
    public int f;

    static {
        apxp apxp = new apxp();
        g = apxp;
        aucj.a(apxp.class, (aucj) apxp);
    }

    private apxp() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\u0002\u0001\u0003\f\u0002\u0004\u0004\u0003\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d", apxo.a, "e", "f"});
        } else if (i2 == 3) {
            return new apxp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apxp.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
