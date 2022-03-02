package defpackage;

/* renamed from: aqti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqti extends aucj implements audy {
    public static final aqti e;
    private static volatile auef f;
    public int a;
    public aqsr b;
    public aucx c = auei.b;
    public boolean d;

    static {
        aqti aqti = new aqti();
        e = aqti;
        aucj.a(aqti.class, (aucj) aqti);
    }

    private aqti() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\t\u0000\u0003\u001b\u0004\u0007\u0001", new Object[]{"a", "b", "c", aqpx.class, "d"});
        } else if (i2 == 3) {
            return new aqti();
        } else {
            if (i2 == 4) {
                return new aqth();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqti.class) {
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
