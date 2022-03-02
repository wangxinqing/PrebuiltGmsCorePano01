package defpackage;

/* renamed from: aqsl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsl extends aucj implements audy {
    public static final aqsl g;
    private static volatile auef h;
    public int a;
    public long b;
    public String c = "";
    public aqsi d;
    public String e = "";
    public aqsr f;

    static {
        aqsl aqsl = new aqsl();
        g = aqsl;
        aucj.a(aqsl.class, (aucj) aqsl);
    }

    private aqsl() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\t\u0002\u0004\b\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqsl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqsl.class) {
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
