package defpackage;

/* renamed from: aujm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aujm extends aucj implements audy {
    public static final aujm g;
    private static volatile auef h;
    public int a;
    public auip b;
    public aucx c = auei.b;
    public float d;
    public int e;
    public int f;

    static {
        aujm aujm = new aujm();
        g = aujm;
        aucj.a(aujm.class, (aucj) aujm);
    }

    private aujm() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\u0001\u0001\u0004\f\u0002\u0005\f\u0003", new Object[]{"a", "b", "c", aujj.class, "d", "e", aujk.a, "f", aujl.a});
        } else if (i2 == 3) {
            return new aujm();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (int[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aujm.class) {
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
