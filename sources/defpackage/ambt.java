package defpackage;

/* renamed from: ambt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ambt extends aucj implements audy {
    public static final ambt a;
    private static volatile auef e;
    private int b;
    private int c;
    private byte d = 2;

    static {
        ambt ambt = new ambt();
        a = ambt;
        aucj.a(ambt.class, (aucj) ambt);
    }

    private ambt() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Ԍ\u0000", new Object[]{"b", "c", amhi.a});
        } else if (i2 == 3) {
            return new ambt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ambt.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(a);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
