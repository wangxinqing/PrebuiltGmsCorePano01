package defpackage;

/* renamed from: amgq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amgq extends aucj implements audy {
    public static final amgq a;
    private static volatile auef f;
    private int b;
    private aqee c;
    private aqef d;
    private byte e = 2;

    static {
        amgq amgq = new amgq();
        a = amgq;
        aucj.a(amgq.class, (aucj) amgq);
    }

    private amgq() {
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
            return aucj.a((audx) a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0003Љ\u0002", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new amgq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amgq.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(a);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
