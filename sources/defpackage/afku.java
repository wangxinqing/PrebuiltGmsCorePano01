package defpackage;

/* renamed from: afku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afku extends aucj implements audy {
    public static final afku g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public int c;
    public String d = "";
    public int e;
    public afkk f;

    static {
        afku afku = new afku();
        g = afku;
        aucj.a(afku.class, (aucj) afku);
    }

    private afku() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\b\u0002\u0005\f\u0003\u0006\t\u0004", new Object[]{"a", "b", "c", "d", "e", afks.a, "f"});
        } else if (i2 == 3) {
            return new afku();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (afku.class) {
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
