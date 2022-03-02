package defpackage;

/* renamed from: aphv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphv extends aucj implements audy {
    public static final aphv e;
    private static volatile auef g;
    public int a;
    public apgv b;
    public aucx c = auei.b;
    public auay d = auay.b;
    private byte f = 2;

    static {
        aphv aphv = new aphv();
        e = aphv;
        aucj.a(aphv.class, (aucj) aphv);
    }

    private aphv() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001", new Object[]{"a", "b", "c", apjv.class, "d"});
        } else if (i2 == 3) {
            return new aphv();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aphv.class) {
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
