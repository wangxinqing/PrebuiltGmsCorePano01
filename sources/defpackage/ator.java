package defpackage;

/* renamed from: ator  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ator extends aucj implements audy {
    public static final ator d;
    private static volatile auef e;
    public int a;
    public int b;
    public aucx c = auei.b;

    static {
        ator ator = new ator();
        d = ator;
        aucj.a(ator.class, (aucj) ator);
    }

    private ator() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"a", "b", atjv.b(), "c", atoq.class});
        } else if (i2 == 3) {
            return new ator();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][]) null, (byte[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ator.class) {
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
