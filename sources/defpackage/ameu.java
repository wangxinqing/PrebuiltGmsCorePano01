package defpackage;

/* renamed from: ameu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ameu extends aucj implements audy {
    public static final ameu g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public amew c;
    public String d = "";
    public boolean e;
    public int f;

    static {
        ameu ameu = new ameu();
        g = ameu;
        aucj.a(ameu.class, (aucj) ameu);
    }

    private ameu() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003\b\u0002\u0004\u0007\u0003\u0006\f\u0005", new Object[]{"a", "b", "c", "d", "e", "f", amec.a});
        } else if (i2 == 3) {
            return new ameu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (ameu.class) {
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
