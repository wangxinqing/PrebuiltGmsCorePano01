package defpackage;

/* renamed from: aszq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszq extends aucj implements audy {
    public static final aszq g;
    private static volatile auef h;
    public int a;
    public long b;
    public int c;
    public int d;
    public boolean e;
    public int f;

    static {
        aszq aszq = new aszq();
        g = aszq;
        aucj.a(aszq.class, (aucj) aszq);
    }

    private aszq() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0005\u0000\u0002\u000f\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d", aszp.a, "e", "f"});
        } else if (i2 == 3) {
            return new aszq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aszq.class) {
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
