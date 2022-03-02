package defpackage;

/* renamed from: arax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arax extends aucj implements audy {
    public static final arax e;
    private static volatile auef f;
    public arbd a;
    public boolean b;
    public aucs c = aucl.b;
    public boolean d;

    static {
        arax arax = new arax();
        e = arax;
        aucj.a(arax.class, (aucj) arax);
    }

    private arax() {
        auay auay = auay.b;
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0003\u0007\u0004\u0000\u0001\u0000\u0003\t\u0004\u0007\u0005'\u0007\u0007", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new arax();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (short[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (arax.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
