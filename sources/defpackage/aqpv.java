package defpackage;

/* renamed from: aqpv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpv extends aucj implements audy {
    public static final aqpv f;
    private static volatile auef h;
    public String a = "";
    public int b;
    public int c;
    public aucs d = aucl.b;
    public aucs e = aucl.b;
    private int g;

    static {
        aqpv aqpv = new aqpv();
        f = aqpv;
        aucj.a(aqpv.class, (aucj) aqpv);
    }

    private aqpv() {
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
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0016\u0005\u0016", new Object[]{"g", "a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqpv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqpv.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
