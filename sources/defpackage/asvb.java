package defpackage;

/* renamed from: asvb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asvb extends aucj implements audy {
    public static final asvb f;
    private static volatile auef h;
    public aucr a = aubz.b;
    public aucr b = aubz.b;
    public int c;
    public boolean d;
    public int e;
    private int g;

    static {
        asvb asvb = new asvb();
        f = asvb;
        aucj.a(asvb.class, (aucj) asvb);
    }

    private asvb() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u0013\u0002\u0013\u0003\u0004\u0000\u0004\u0007\u0001\u0005\u0004\u0002", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new asvb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (asvb.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
