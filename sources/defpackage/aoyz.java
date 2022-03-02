package defpackage;

/* renamed from: aoyz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoyz extends aucj implements audy {
    public static final aoyz e;
    private static volatile auef f;
    public aoyu a;
    public int b;
    public int c;
    public int d;

    static {
        aoyz aoyz = new aoyz();
        e = aoyz;
        aucj.a(aoyz.class, (aucj) aoyz);
    }

    private aoyz() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aoyz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aoyz.class) {
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
