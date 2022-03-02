package defpackage;

/* renamed from: apfp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apfp extends aucj implements audy {
    public static final apfp f;
    private static volatile auef h;
    public aucx a = auei.b;
    public auay b = auay.b;
    public String c = "";
    public long d;
    public aucs e = aucl.b;
    private int g;

    static {
        apfp apfp = new apfp();
        f = apfp;
        aucj.a(apfp.class, (aucj) apfp);
    }

    private apfp() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u001b\u0002\n\u0000\u0003\b\u0001\u0004\u0002\u0002\u0006\u0016", new Object[]{"g", "a", apfc.class, "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new apfp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apfp.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
