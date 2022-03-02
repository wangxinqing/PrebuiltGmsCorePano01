package defpackage;

/* renamed from: aukz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aukz extends aucj implements audy {
    public static final aukz g;
    private static volatile auef h;
    public int a;
    public int b;
    public auay c = auay.b;
    public auay d = auay.b;
    public long e = -1;
    public String f = "";

    static {
        aukz aukz = new aukz();
        g = aukz;
        aucj.a(aukz.class, (aucj) aukz);
    }

    private aukz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\n\u0001\u0003\n\u0002\u0004\u0002\u0003\u0005\b\u0004", new Object[]{"a", "b", auky.b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aukz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aukz.class) {
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
