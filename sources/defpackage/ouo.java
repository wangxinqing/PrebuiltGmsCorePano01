package defpackage;

/* renamed from: ouo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ouo extends aucj implements audy {
    public static final ouo c;
    private static volatile auef d;
    public aucx a = auei.b;
    public aucx b = auei.b;

    static {
        ouo ouo = new ouo();
        c = ouo;
        aucj.a(ouo.class, (aucj) ouo);
    }

    private ouo() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", oum.class, "b", oun.class});
        } else if (i2 == 3) {
            return new ouo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (ouo.class) {
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
