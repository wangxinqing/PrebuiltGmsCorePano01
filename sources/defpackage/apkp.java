package defpackage;

/* renamed from: apkp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apkp extends aucj implements audy {
    public static final apkp e;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    private int f;

    static {
        apkp apkp = new apkp();
        e = apkp;
        aucj.a(apkp.class, (aucj) apkp);
    }

    private apkp() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\f\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"f", "a", apkn.a, "b", apkj.class, "c", apkm.class, "d", apki.class});
        } else if (i2 == 3) {
            return new apkp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (apkp.class) {
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
