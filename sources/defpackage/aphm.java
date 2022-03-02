package defpackage;

/* renamed from: aphm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphm extends aucj implements audy {
    public static final auct d = new aphl();
    public static final aphm g;
    private static volatile auef i;
    public apgw a;
    public boolean b;
    public aucs c = aucl.b;
    public apkp e;
    public auay f = auay.b;
    private int h;

    static {
        aphm aphm = new aphm();
        g = aphm;
        aucj.a(aphm.class, (aucj) aphm);
    }

    private aphm() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003\u001e\u0004\t\u0002\u0005\n\u0003", new Object[]{"h", "a", "b", "c", apku.b(), "e", "f"});
        } else if (i3 == 3) {
            return new aphm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aphm.class) {
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
