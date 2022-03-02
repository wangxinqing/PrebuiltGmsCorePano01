package defpackage;

/* renamed from: amax  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amax extends aucj implements audy {
    public static final amax e;
    private static volatile auef f;
    public int a;
    public boolean b;
    public boolean c;
    public int d;

    static {
        amax amax = new amax();
        e = amax;
        aucj.a(amax.class, (aucj) amax);
    }

    private amax() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", "d", amah.a});
        } else if (i2 == 3) {
            return new amax();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amax.class) {
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
