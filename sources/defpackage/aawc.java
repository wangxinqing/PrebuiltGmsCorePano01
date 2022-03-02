package defpackage;

/* renamed from: aawc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aawc extends aucj implements audy {
    public static final aawc e;
    private static volatile auef f;
    public aucs a = aucl.b;
    public aucs b = aucl.b;
    public aucs c = aucl.b;
    public aucx d = auei.b;

    static {
        aawc aawc = new aawc();
        e = aawc;
        aucj.a(aawc.class, (aucj) aawc);
    }

    private aawc() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0016\u0002\u0016\u0003\u001b\u0004\u001e", new Object[]{"a", "b", "d", aavw.class, "c", aawb.b()});
        } else if (i2 == 3) {
            return new aawc();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aawc.class) {
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
