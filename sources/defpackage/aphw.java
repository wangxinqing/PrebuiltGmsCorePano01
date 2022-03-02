package defpackage;

/* renamed from: aphw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphw extends aucj implements audy {
    public static final aphw d;
    private static volatile auef g;
    public apgw a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;
    private byte f = 2;

    static {
        aphw aphw = new aphw();
        d = aphw;
        aucj.a(aphw.class, (aucj) aphw);
    }

    private aphw() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001\t\u0000\u0002Л\u0003\u001b", new Object[]{"e", "a", "b", apjv.class, "c", apil.class});
        } else if (i2 == 3) {
            return new aphw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aphw.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(d);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
