package defpackage;

/* renamed from: astx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class astx extends aucj implements audy {
    public static final astx c;
    private static volatile auef e;
    public int a;
    public long b;
    private int d;

    static {
        astx astx = new astx();
        c = astx;
        aucj.a(astx.class, (aucj) astx);
    }

    private astx() {
    }

    public static /* synthetic */ void a(astx astx) {
        astx.a |= 2;
        astx.d = 2;
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0000\u0002\u0004\u0001", new Object[]{"a", "b", "d"});
        } else if (i2 == 3) {
            return new astx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (astx.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
