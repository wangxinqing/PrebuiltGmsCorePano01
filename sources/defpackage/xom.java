package defpackage;

/* renamed from: xom  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xom extends aucj implements audy {
    public static final xom d;
    private static volatile auef e;
    public int a;
    public xon b;
    public aucx c = auei.b;

    static {
        xom xom = new xom();
        d = xom;
        aucj.a(xom.class, (aucj) xom);
    }

    private xom() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b", new Object[]{"a", "b", "c", xoo.class});
        } else if (i2 == 3) {
            return new xom();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[]) null, (boolean[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (xom.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
