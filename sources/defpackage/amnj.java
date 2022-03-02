package defpackage;

/* renamed from: amnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amnj extends aucj implements audy {
    public static final amnj e;
    private static volatile auef f;
    public int a;
    public int b;
    public long c;
    public int d;

    static {
        amnj amnj = new amnj();
        e = amnj;
        aucj.a(amnj.class, (aucj) amnj);
    }

    private amnj() {
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
            return new amnj();
        } else {
            if (i2 == 4) {
                return new amni();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amnj.class) {
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
