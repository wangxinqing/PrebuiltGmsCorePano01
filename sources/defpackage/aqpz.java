package defpackage;

/* renamed from: aqpz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpz extends aucj implements audy {
    public static final aqpz g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public aqrl e;
    public aqrl f;

    static {
        aqpz aqpz = new aqpz();
        g = aqpz;
        aucj.a(aqpz.class, (aucj) aqpz);
    }

    private aqpz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002<\u0000\u0003<\u0000\u0004\t\u0001\u0005\t\u0002", new Object[]{"c", "b", "a", "d", aqsr.class, aqqa.class, "e", "f"});
        } else if (i2 == 3) {
            return new aqpz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqpz.class) {
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
