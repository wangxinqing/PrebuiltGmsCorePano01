package defpackage;

/* renamed from: auik  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auik extends aucj implements audy {
    public static final auik d;
    private static volatile auef e;
    public int a;
    public int b;
    public audr c = audr.b;

    static {
        auik auik = new auik();
        d = auik;
        aucj.a(auik.class, (aucj) auik);
    }

    private auik() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0004\u0000\u00022", new Object[]{"a", "b", "c", auij.a});
        } else if (i2 == 3) {
            return new auik();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (auik.class) {
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
