package defpackage;

/* renamed from: asth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asth extends aucj implements audy {
    public static final asth b;
    private static volatile auef f;
    public long a;
    private int c;
    private long d;
    private byte e = 2;

    static {
        asth asth = new asth();
        b = asth;
        aucj.a(asth.class, (aucj) asth);
    }

    private asth() {
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
            return aucj.a((audx) b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ԅ\u0000\u0002ԅ\u0001", new Object[]{"c", "d", "a"});
        } else if (i2 == 3) {
            return new asth();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asth.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(b);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
