package defpackage;

/* renamed from: almc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almc extends aucj implements audy {
    public static final almc e;
    private static volatile auef g;
    public int a = 0;
    public Object b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        almc almc = new almc();
        e = almc;
        aucj.a(almc.class, (aucj) almc);
    }

    private almc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003<\u0000", new Object[]{"b", "a", "f", "c", "d", auhs.class});
        } else if (i2 == 3) {
            return new almc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (almc.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
