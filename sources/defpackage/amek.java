package defpackage;

/* renamed from: amek  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amek extends aucj implements audy {
    public static final amek g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public aucx e = auei.b;
    public int f;

    static {
        amek amek = new amek();
        g = amek;
        aucj.a(amek.class, (aucj) amek);
    }

    private amek() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u001b\u0005\u0004\u0003", new Object[]{"a", "b", "c", "d", ameo.a, "e", amem.class, "f"});
        } else if (i2 == 3) {
            return new amek();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (amek.class) {
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
