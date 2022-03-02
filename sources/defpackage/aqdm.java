package defpackage;

/* renamed from: aqdm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqdm extends aucj implements audy {
    public static final aqdm f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public auay d = auay.b;
    public auay e = auay.b;
    private int g;

    static {
        aqdm aqdm = new aqdm();
        f = aqdm;
        aucj.a(aqdm.class, (aucj) aqdm);
    }

    private aqdm() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002\u0004\n\u0003\u0005\n\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqdm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqdm.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
