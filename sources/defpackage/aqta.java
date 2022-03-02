package defpackage;

/* renamed from: aqta  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqta extends aucj implements audy {
    public static final aqta a;
    private static volatile auef d;
    private int b;
    private aqpx c;

    static {
        aqta aqta = new aqta();
        a = aqta;
        aucj.a(aqta.class, (aucj) aqta);
    }

    private aqta() {
        auei auei = auei.b;
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003\t\u0001", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new aqta();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqta.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(a);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
