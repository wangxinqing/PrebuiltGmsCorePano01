package defpackage;

/* renamed from: aphe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphe extends aucj implements audy {
    public static final auct c = new aphd();
    public static final aphe e;
    private static volatile auef g;
    public boolean a;
    public aucs b = aucl.b;
    public auay d = auay.b;
    private int f;

    static {
        aphe aphe = new aphe();
        e = aphe;
        aucj.a(aphe.class, (aucj) aphe);
    }

    private aphe() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u0007\u0001\u0003\u001e\u0004\n\u0002", new Object[]{"f", "a", "b", apku.b(), "d"});
        } else if (i2 == 3) {
            return new aphe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aphe.class) {
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
