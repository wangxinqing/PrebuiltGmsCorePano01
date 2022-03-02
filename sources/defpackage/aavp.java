package defpackage;

/* renamed from: aavp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavp extends aucj implements audy {
    public static final aavp g;
    private static volatile auef i;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public auay e = auay.b;
    public aavf f;
    private int h;

    static {
        aavp aavp = new aavp();
        g = aavp;
        aucj.a(aavp.class, (aucj) aavp);
    }

    private aavp() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0002\u0000\u0001\u0004\u0000\u0004\f\u0003\u0005\u001b\u0006\u001b\u0007\n\u0004\b\t\u0005", new Object[]{"h", "a", "b", aavn.a, "c", aavz.class, "d", aavz.class, "e", "f"});
        } else if (i3 == 3) {
            return new aavp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aavp.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
