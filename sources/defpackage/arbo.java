package defpackage;

/* renamed from: arbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbo extends aucj implements audy {
    public static final arbo e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public long b;
    public arbr c;
    public arbs d;

    static {
        arbo arbo = new arbo();
        e = arbo;
        aucj.a(arbo.class, (aucj) arbo);
        aujv aujv = aujv.a;
        arbo arbo2 = e;
        f = aucj.a((audx) aujv, (Object) arbo2, (audx) arbo2, 215961826, aufw.MESSAGE);
    }

    private arbo() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\t\u0003\u0004\t\u0001", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new arbo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arbo.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
