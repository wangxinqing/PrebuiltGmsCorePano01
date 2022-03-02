package defpackage;

/* renamed from: xlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xlx extends aucj implements audy {
    public static final xlx f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public xlv e;

    static {
        xlx xlx = new xlx();
        f = xlx;
        aucj.a(xlx.class, (aucj) xlx);
    }

    private xlx() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\u001b\u0004\t\u0002", new Object[]{"a", "b", "c", xlw.a, "d", xlu.class, "e"});
        } else if (i2 == 3) {
            return new xlx();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (xlx.class) {
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
