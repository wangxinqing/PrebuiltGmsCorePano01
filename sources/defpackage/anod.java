package defpackage;

/* renamed from: anod  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anod extends aucj implements audy {
    public static final anod f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public aucs d = aucl.b;
    public int e;

    static {
        anod anod = new anod();
        f = anod;
        aucj.a(anod.class, (aucj) anod);
    }

    private anod() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0016\u0004\f\u0002", new Object[]{"a", "b", "c", "d", "e", aonp.a});
        } else if (i2 == 3) {
            return new anod();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (anod.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
