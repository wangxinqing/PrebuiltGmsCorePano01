package defpackage;

/* renamed from: anuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anuc extends aucj implements audy {
    public static final anuc e;
    public static final auci f;
    private static volatile auef g;
    public int a;
    public aucx b = auei.b;
    public String c = "";
    public String d = "";

    static {
        anuc anuc = new anuc();
        e = anuc;
        aucj.a(anuc.class, (aucj) anuc);
        aujv aujv = aujv.a;
        anuc anuc2 = e;
        f = aucj.a((audx) aujv, (Object) anuc2, (audx) anuc2, 78432438, aufw.MESSAGE);
    }

    private anuc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000\u0006\b\u0001", new Object[]{"a", "b", anua.class, "c", "d"});
        } else if (i2 == 3) {
            return new anuc();
        } else {
            if (i2 == 4) {
                return new anub();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (anuc.class) {
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
