package defpackage;

/* renamed from: aoes  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoes extends aucj implements audy {
    public static final aoes b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        aoes aoes = new aoes();
        b = aoes;
        aucj.a(aoes.class, (aucj) aoes);
    }

    private aoes() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", aofw.b()});
        } else if (i2 == 3) {
            return new aoes();
        } else {
            if (i2 == 4) {
                return new aoer();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (aoes.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
