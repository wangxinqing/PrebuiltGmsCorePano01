package defpackage;

/* renamed from: anss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anss extends aucj implements audy {
    public static final anss g;
    private static volatile auef h;
    public int a;
    public boolean b;
    public aucx c = auei.b;
    public int d;
    public boolean e;
    public int f;

    static {
        anss anss = new anss();
        g = anss;
        aucj.a(anss.class, (aucj) anss);
    }

    private anss() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u001b\u0003\f\u0001\u0004\u0007\u0002\u0005\u0004\u0003", new Object[]{"a", "b", "c", ansq.class, "d", ansr.a, "e", "f"});
        } else if (i2 == 3) {
            return new anss();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (char[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anss.class) {
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
