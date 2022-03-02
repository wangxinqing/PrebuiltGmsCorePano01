package defpackage;

/* renamed from: gzu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzu extends aucj implements audy {
    public static final gzu c;
    private static volatile auef f;
    public auay a = auay.b;
    public auay b = auay.b;
    private int d;
    private byte e = 2;

    static {
        gzu gzu = new gzu();
        c = gzu;
        aucj.a(gzu.class, (aucj) gzu);
    }

    private gzu() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԋ\u0000\u0002Ԋ\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new gzu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (gzu.class) {
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
