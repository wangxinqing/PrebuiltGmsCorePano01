package defpackage;

/* renamed from: okm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class okm extends aucj implements audy {
    public static final okm e;
    private static volatile auef f;
    public int a;
    public okn b;
    public aucx c = auei.b;
    public String d = "";

    static {
        okm okm = new okm();
        e = okm;
        aucj.a(okm.class, (aucj) okm);
    }

    private okm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\b\u0001", new Object[]{"a", "b", "c", oko.class, "d"});
        } else if (i2 == 3) {
            return new okm();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (okm.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
