package defpackage;

/* renamed from: asva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asva extends aucj implements audy {
    public static final asva c;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    private int d;

    static {
        asva asva = new asva();
        c = asva;
        aucj.a(asva.class, (aucj) asva);
    }

    private asva() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"d", "a", astf.a, "b", asvd.class});
        } else if (i2 == 3) {
            return new asva();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asva.class) {
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
