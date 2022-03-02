package defpackage;

/* renamed from: wlz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wlz extends aucj implements audy {
    public static final wlz d;
    private static volatile auef f;
    public aucx a = auei.b;
    public int b = 1;
    public int c;
    private int e;

    static {
        wlz wlz = new wlz();
        d = wlz;
        aucj.a(wlz.class, (aucj) wlz);
    }

    private wlz() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\f\u0000\u0003\f\u0001", new Object[]{"e", "a", wly.class, "b", wmb.b(), "c", wmb.b()});
        } else if (i2 == 3) {
            return new wlz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (wlz.class) {
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
