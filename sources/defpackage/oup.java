package defpackage;

/* renamed from: oup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oup extends aucj implements audy {
    public static final oup q;
    private static volatile auef r;
    public int a;
    public int b;
    public aucs c = aucl.b;
    public aucx d = auei.b;
    public int e;
    public aucs f = aucl.b;
    public auay g = auay.b;
    public ouq h;
    public aucn i = aubm.b;
    public aucs j = aucl.b;
    public aucs k = aucl.b;
    public otv l;
    public int m;
    public String n = "";
    public aucs o = aucl.b;
    public auay p = auay.b;

    static {
        oup oup = new oup();
        q = oup;
        aucj.a(oup.class, (aucj) oup);
    }

    private oup() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) q, "\u0001\u000f\u0000\u0001\u0002\u0016\u000f\u0000\u0007\u0000\u0002\u000b\u0001\u0003'\u0004\u001b\u0005\u000b\u0002\u0006'\u0007\n\u0003\t\t\u0004\n#\u000b'\f'\u000f\b\u0007\u0010'\u0011\n\b\u0015\t\u0005\u0016\f\u0006", new Object[]{"a", "b", "c", "d", ouo.class, "e", "f", "g", "h", "i", "j", "k", "n", "o", "p", "l", "m", aone.a});
        } else if (i3 == 3) {
            return new oup();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (oup.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
