package defpackage;

/* renamed from: okr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okr extends aucj implements audy {
    public static final okr d;
    private static volatile auef f;
    public okn a;
    public aucx b = auei.b;
    public String c = "";
    private int e;

    static {
        okr okr = new okr();
        d = okr;
        aucj.a(okr.class, (aucj) okr);
    }

    private okr() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\b\u0001", new Object[]{"e", "a", "b", oko.class, "c"});
        } else if (i2 == 3) {
            return new okr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (okr.class) {
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
