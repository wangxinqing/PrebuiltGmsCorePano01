package defpackage;

/* renamed from: asss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asss extends aucj implements audy {
    public static final asss d;
    private static volatile auef e;
    public int a;
    public asuu b;
    public aucx c = auei.b;

    static {
        asss asss = new asss();
        d = asss;
        aucj.a(asss.class, (aucj) asss);
    }

    private asss() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new asss();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asss.class) {
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
