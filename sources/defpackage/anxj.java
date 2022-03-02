package defpackage;

/* renamed from: anxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxj extends aucj implements audy {
    public static final anxj g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public int d;
    public anxi e;
    public aucx f = auei.b;

    static {
        anxj anxj = new anxj();
        g = anxj;
        aucj.a(anxj.class, (aucj) anxj);
    }

    private anxj() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", anxh.class});
        } else if (i2 == 3) {
            return new anxj();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anxj.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
