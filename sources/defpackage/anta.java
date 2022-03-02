package defpackage;

/* renamed from: anta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anta extends aucj implements audy {
    public static final anta g;
    private static volatile auef h;
    public int a;
    public long b;
    public antb c;
    public antc d;
    public antf e;
    public ansz f;

    static {
        anta anta = new anta();
        g = anta;
        aucj.a(anta.class, (aucj) anta);
    }

    private anta() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\u0004\u0003\u0002\u0004\t\u0005\t\u0007\t", new Object[]{"d", "a", "b", "c", "e", "f"});
        } else if (i2 == 3) {
            return new anta();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (anta.class) {
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
