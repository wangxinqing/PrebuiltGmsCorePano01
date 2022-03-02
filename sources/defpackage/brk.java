package defpackage;

/* renamed from: brk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class brk extends aucj implements audy {
    public static final brk g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public int e;
    public int f;

    static {
        brk brk = new brk();
        g = brk;
        aucj.a(brk.class, (aucj) brk);
    }

    private brk() {
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
            return aucj.a((audx) g, "\u0001\b\u0001\u0001\u0001d\b\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u00037\u0000\u00044\u0000\u0005:\u0000\u0006;\u0000\u0007=\u0000d\u0004\u0007", new Object[]{"c", "b", "a", "d", "e", bri.a, "f"});
        } else if (i2 == 3) {
            return new brk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (brk.class) {
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
