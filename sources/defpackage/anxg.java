package defpackage;

/* renamed from: anxg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxg extends aucj implements audy {
    public static final anxg g;
    private static volatile auef h;
    public int a;
    public int b;
    public String c = "";
    public anxe d;
    public long e;
    public long f;

    static {
        anxg anxg = new anxg();
        g = anxg;
        aucj.a(anxg.class, (aucj) anxg);
    }

    private anxg() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\t\u0002\u0004\u0002\u0003\u0005\u0002\u0004", new Object[]{"a", "b", anxf.a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new anxg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anxg.class) {
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
