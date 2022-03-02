package defpackage;

/* renamed from: awgg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgg extends aucj implements audy {
    public static final awgg c;
    private static volatile auef d;
    public int a = 0;
    public Object b;

    static {
        awgg awgg = new awgg();
        c = awgg;
        aucj.a(awgg.class, (aucj) awgg);
    }

    private awgg() {
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
            return aucj.a((audx) c, "\u0000\u0006\u0001\u0000\u0002\u0007\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", awfw.class, awgd.class, awgf.class, awgb.class, awge.class, awgc.class});
        } else if (i2 == 3) {
            return new awgg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (awgg.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
