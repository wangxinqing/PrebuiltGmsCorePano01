package defpackage;

/* renamed from: aspx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aspx extends aucj implements audy {
    public static final aspx b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        aspx aspx = new aspx();
        b = aspx;
        aucj.a(aspx.class, (aucj) aspx);
    }

    private aspx() {
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", aspw.class});
        } else if (i2 == 3) {
            return new aspx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aspx.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
