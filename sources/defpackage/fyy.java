package defpackage;

/* renamed from: fyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fyy extends aucj implements audy {
    public static final fyy g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public auay d = auay.b;
    public aucx e = auei.b;
    public boolean f;

    static {
        fyy fyy = new fyy();
        g = fyy;
        aucj.a(fyy.class, (aucj) fyy);
    }

    private fyy() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\n\u0002\u0004\u001c\u0005\u0007\u0003", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new fyy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (fyy.class) {
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
