package defpackage;

/* renamed from: asmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asmy extends aucj implements audy {
    public static final asmy f;
    private static volatile auef g;
    public int a;
    public int b;
    public asmv c;
    public int d;
    public auay e = auay.b;

    static {
        asmy asmy = new asmy();
        f = asmy;
        aucj.a(asmy.class, (aucj) asmy);
    }

    private asmy() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\f\u0000\u0004\t\u0003\u0005\u0004\u0005\u0006\n\u0006", new Object[]{"a", "b", asmw.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new asmy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asmy.class) {
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
