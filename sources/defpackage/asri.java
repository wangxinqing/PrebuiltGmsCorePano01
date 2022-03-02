package defpackage;

/* renamed from: asri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asri extends aucj implements audy {
    public static final asri c;
    private static volatile auef e;
    public aucx a = auei.b;
    public String b = "";
    private int d;

    static {
        asri asri = new asri();
        c = asri;
        aucj.a(asri.class, (aucj) asri);
    }

    private asri() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000", new Object[]{"d", "a", asuf.class, "b"});
        } else if (i2 == 3) {
            return new asri();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asri.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
