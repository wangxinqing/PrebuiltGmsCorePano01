package defpackage;

/* renamed from: ausr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausr extends aucj implements audy {
    public static final ausr d;
    private static volatile auef f;
    public int a;
    public auay b = auay.b;
    public long c;
    private int e;

    static {
        ausr ausr = new ausr();
        d = ausr;
        aucj.a(ausr.class, (aucj) ausr);
    }

    private ausr() {
    }

    public static /* synthetic */ void a(ausr ausr) {
        ausr.a |= 4;
        ausr.e = 1;
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\u0002\u0001\u0003\u0004\u0002", new Object[]{"a", "b", "c", "e"});
        } else if (i2 == 3) {
            return new ausr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ausr.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
