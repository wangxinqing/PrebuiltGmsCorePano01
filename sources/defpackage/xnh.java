package defpackage;

/* renamed from: xnh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xnh extends aucj implements audy {
    public static final xnh f;
    private static volatile auef g;
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    static {
        xnh xnh = new xnh();
        f = xnh;
        aucj.a(xnh.class, (aucj) xnh);
    }

    private xnh() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"a", "b", xju.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new xnh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (xnh.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
