package defpackage;

/* renamed from: aran  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aran extends aucj implements audy {
    public static final aran e;
    private static volatile auef f;
    public auay a = auay.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        aran aran = new aran();
        e = aran;
        aucj.a(aran.class, (aucj) aran);
    }

    private aran() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0003\u0000\u0001\n\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", "b", arao.class, "c", arbf.class, "d", arba.class});
        } else if (i2 == 3) {
            return new aran();
        } else {
            if (i2 == 4) {
                return new aram();
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aran.class) {
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
