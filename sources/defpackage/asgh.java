package defpackage;

/* renamed from: asgh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asgh extends aucj implements audy {
    public static final asgh d;
    private static volatile auef f;
    public int a;
    public asfz b;
    public aucx c = auei.b;
    private byte e = 2;

    static {
        asgh asgh = new asgh();
        d = asgh;
        aucj.a(asgh.class, (aucj) asgh);
    }

    private asgh() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001\t\u0000\u0002Л", new Object[]{"a", "b", "c", asgd.class});
        } else if (i2 == 3) {
            return new asgh();
        } else {
            if (i2 == 4) {
                return new asgg();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asgh.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
