package defpackage;

/* renamed from: amng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amng extends aucj implements audy {
    public static final amng e;
    private static volatile auef f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        amng amng = new amng();
        e = amng;
        aucj.a(amng.class, (aucj) amng);
    }

    private amng() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002\u0004\u0001\u0003\u0002\u0002\u0005\u0004\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new amng();
        } else {
            if (i2 == 4) {
                return new amnf();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amng.class) {
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
