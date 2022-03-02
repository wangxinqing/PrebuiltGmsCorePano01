package defpackage;

/* renamed from: apjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apjg extends aucj implements audy {
    public static final apjg g;
    private static volatile auef h;
    public int a;
    public apgv b;
    public int c;
    public apje d;
    public apjd e;
    public apjf f;

    static {
        apjg apjg = new apjg();
        g = apjg;
        aucj.a(apjg.class, (aucj) apjg);
    }

    private apjg() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", apkn.a, "d", "e", "f"});
        } else if (i2 == 3) {
            return new apjg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apjg.class) {
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
