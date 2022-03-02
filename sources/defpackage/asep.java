package defpackage;

/* renamed from: asep  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asep extends aucg implements audy {
    public static final asep f;
    private static volatile auef h;
    public int a;
    public int b;
    public asfp c;
    public asfg d;
    public asew e;
    private byte g = 2;

    static {
        asep asep = new asep();
        f = asep;
        aucj.a(asep.class, (aucj) asep);
    }

    private asep() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0004\t\u0002\u0005\t\u0003", new Object[]{"a", "b", aser.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new asep();
        } else {
            if (i2 == 4) {
                return new aucf(f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (asep.class) {
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
