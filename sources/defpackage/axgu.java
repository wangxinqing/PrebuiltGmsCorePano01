package defpackage;

/* renamed from: axgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axgu extends aucj implements audy {
    public static final axgu e;
    private static volatile auef f;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        axgu axgu = new axgu();
        e = axgu;
        aucj.a(axgu.class, (aucj) axgu);
    }

    private axgu() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u001a\u0002\u001b\u0003\u001a\u0004\u001a", new Object[]{"a", "b", axgt.class, "c", "d"});
        } else if (i2 == 3) {
            return new axgu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (axgu.class) {
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
