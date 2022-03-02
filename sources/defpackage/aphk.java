package defpackage;

/* renamed from: aphk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphk extends aucj implements audy {
    public static final aphk f;
    private static volatile auef g;
    public int a;
    public apgv b;
    public int c;
    public String d = "";
    public auay e = auay.b;

    static {
        aphk aphk = new aphk();
        f = aphk;
        aucj.a(aphk.class, (aucj) aphk);
    }

    private aphk() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\b\u0002\u0004\n\u0003", new Object[]{"a", "b", "c", apiu.a, "d", "e"});
        } else if (i2 == 3) {
            return new aphk();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aphk.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
