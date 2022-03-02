package defpackage;

/* renamed from: assj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class assj extends aucj implements audy {
    public static final auct d = new asse();
    public static final assj e;
    private static volatile auef g;
    public aucx a = auei.b;
    public int b;
    public aucs c = aucl.b;
    private int f;

    static {
        assj assj = new assj();
        e = assj;
        aucj.a(assj.class, (aucj) assj);
    }

    private assj() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\f\u0000\u0003\u001e", new Object[]{"f", "a", asve.class, "b", assf.a, "c", assi.b()});
        } else if (i2 == 3) {
            return new assj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (assj.class) {
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
