package defpackage;

/* renamed from: aqxb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxb extends aucj implements audy {
    public static final aqxb c;
    private static volatile auef d;
    public aucx a = auei.b;
    public aqxq b;

    static {
        aqxb aqxb = new aqxb();
        c = aqxb;
        aucj.a(aqxb.class, (aucj) aqxb);
    }

    private aqxb() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003\t", new Object[]{"a", aqxx.class, "b"});
        } else if (i2 == 3) {
            return new aqxb();
        } else {
            if (i2 == 4) {
                return new aqxa();
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqxb.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
