package defpackage;

/* renamed from: pqy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pqy extends aucj implements audy {
    public static final pqy c;
    private static volatile auef e;
    public String a = "";
    public aucx b = auei.b;
    private int d;

    static {
        pqy pqy = new pqy();
        c = pqy;
        aucj.a(pqy.class, (aucj) pqy);
    }

    private pqy() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"d", "a", "b", atzl.class});
        } else if (i2 == 3) {
            return new pqy();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (pqy.class) {
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
