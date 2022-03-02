package defpackage;

/* renamed from: aavz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavz extends aucj implements audy {
    public static final aavz g;
    private static volatile auef h;
    public int a;
    public int b;
    public aavt c;
    public aavu d;
    public aavv e;
    public aavv f;

    static {
        aavz aavz = new aavz();
        g = aavz;
        aucj.a(aavz.class, (aucj) aavz);
    }

    private aavz() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", aavi.b(), "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aavz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aavz.class) {
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
