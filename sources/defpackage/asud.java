package defpackage;

/* renamed from: asud  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asud extends aucj implements audy {
    public static final asud e;
    private static volatile auef f;
    public int a;
    public long b;
    public int c;
    public int d;

    static {
        asud asud = new asud();
        e = asud;
        aucj.a(asud.class, (aucj) asud);
    }

    private asud() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0004\u000b\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new asud();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asud.class) {
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
