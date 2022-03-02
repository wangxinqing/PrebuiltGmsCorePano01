package defpackage;

/* renamed from: amhg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amhg extends aucj implements audy {
    public static final amhg c;
    private static volatile auef e;
    public aucx a = auei.b;
    public long b;
    private int d;

    static {
        amhg amhg = new amhg();
        c = amhg;
        aucj.a(amhg.class, (aucj) amhg);
    }

    private amhg() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\u0003\u0000", new Object[]{"d", "a", amen.class, "b"});
        } else if (i2 == 3) {
            return new amhg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (amhg.class) {
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
