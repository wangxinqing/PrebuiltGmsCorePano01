package defpackage;

/* renamed from: oln  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class oln extends aucj implements audy {
    public static final oln e;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public String d = "";
    private int f;

    static {
        oln oln = new oln();
        e = oln;
        aucj.a(oln.class, (aucj) oln);
    }

    private oln() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\b\u0001", new Object[]{"f", "a", "b", olk.class, "c", olk.class, "d"});
        } else if (i2 == 3) {
            return new oln();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (oln.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
