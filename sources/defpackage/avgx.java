package defpackage;

/* renamed from: avgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avgx extends aucj implements audy {
    public static final avgx e;
    private static volatile auef g;
    public avgo a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;
    private int f;

    static {
        avgx avgx = new avgx();
        e = avgx;
        aucj.a(avgx.class, (aucj) avgx);
    }

    private avgx() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001b", new Object[]{"f", "a", "b", "c", "d", avfn.class});
        } else if (i2 == 3) {
            return new avgx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avgx.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
