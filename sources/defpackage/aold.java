package defpackage;

/* renamed from: aold  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aold extends aucj implements audy {
    public static final aold e;
    private static volatile auef f;
    public int a;
    public aolg b;
    public int c;
    public long d;

    static {
        aold aold = new aold();
        e = aold;
        aucj.a(aold.class, (aucj) aold);
    }

    private aold() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0000\u0002\u0004\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aold();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aold.class) {
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
