package defpackage;

/* renamed from: aszm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszm extends aucj implements audy {
    public static final aszm e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aszw c;
    public int d;

    static {
        aszm aszm = new aszm();
        e = aszm;
        aucj.a(aszm.class, (aucj) aszm);
    }

    private aszm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u001a\u0003\t\u0000\u0004\u0004\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aszm();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aszm.class) {
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
