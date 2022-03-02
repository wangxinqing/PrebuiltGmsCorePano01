package defpackage;

/* renamed from: agxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agxe extends aucj implements audy {
    public static final agxe g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public auay c = auay.b;
    public String d = "";
    public long e;
    public aucx f = auei.b;

    static {
        agxe agxe = new agxe();
        g = agxe;
        aucj.a(agxe.class, (aucj) agxe);
    }

    private agxe() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\n\u0001\u0003\b\u0002\u0004\u0002\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", agxf.class});
        } else if (i2 == 3) {
            return new agxe();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (agxe.class) {
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
