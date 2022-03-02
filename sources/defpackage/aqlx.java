package defpackage;

/* renamed from: aqlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqlx extends aucj implements audy {
    public static final aqlx f;
    private static volatile auef g;
    public int a;
    public aucs b = aucl.b;
    public int c;
    public int d;
    public int e;

    static {
        aqlx aqlx = new aqlx();
        f = aqlx;
        aucj.a(aqlx.class, (aucj) aqlx);
    }

    private aqlx() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0016\u0002\u0004\u0000\u0003\u0004\u0001\u0004\f\u0002", new Object[]{"a", "b", "c", "d", "e", aqma.a});
        } else if (i2 == 3) {
            return new aqlx();
        } else {
            if (i2 == 4) {
                return new aqlw();
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqlx.class) {
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
