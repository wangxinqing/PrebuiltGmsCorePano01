package defpackage;

/* renamed from: arff  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arff extends aucj implements audy {
    public static final arff d;
    private static volatile auef e;
    public int a;
    public int b;
    public aucx c = auei.b;

    static {
        arff arff = new arff();
        d = arff;
        aucj.a(arff.class, (aucj) arff);
    }

    private arff() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u001b", new Object[]{"a", "b", "c", arfg.class});
        } else if (i2 == 3) {
            return new arff();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arff.class) {
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
