package defpackage;

/* renamed from: amcn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amcn extends aucj implements audy {
    public static final amcn a;
    private static volatile auef g;
    private int b;
    private long c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        amcn amcn = new amcn();
        a = amcn;
        aucj.a(amcn.class, (aucj) amcn);
    }

    private amcn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԃ\u0000\u0002Ԇ\u0001\u0003Ԇ\u0002", new Object[]{"b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new amcn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (amcn.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(a);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
