package defpackage;

/* renamed from: auws  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auws extends aucj implements audy {
    public static final auws c;
    private static volatile auef d;
    public int a;
    public int b;

    static {
        auws auws = new auws();
        c = auws;
        aucj.a(auws.class, (aucj) auws);
    }

    private auws() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004\u0000", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new auws();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (auws.class) {
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
