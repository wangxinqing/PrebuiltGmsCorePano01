package defpackage;

/* renamed from: auxt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auxt extends aucj implements audy {
    public static final auxt g;
    private static volatile auef h;
    public int a;
    public auxg b;
    public auxg c;
    public String d = "";
    public String e = "";
    public auxh f;

    static {
        auxt auxt = new auxt();
        g = auxt;
        aucj.a(auxt.class, (aucj) auxt);
    }

    private auxt() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0004\n\u0005\u0000\u0000\u0000\u0004\t\u0000\u0005\t\u0001\u0007\b\u0003\t\b\u0004\n\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new auxt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auxt.class) {
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
