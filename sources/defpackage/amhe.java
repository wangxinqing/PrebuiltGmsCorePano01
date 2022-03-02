package defpackage;

/* renamed from: amhe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amhe extends aucj implements audy {
    public static final amhe e;
    private static volatile auef f;
    public int a;
    public amej b;
    public int c;
    public String d = "";

    static {
        amhe amhe = new amhe();
        e = amhe;
        aucj.a(amhe.class, (aucj) amhe);
    }

    private amhe() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0003\u0004\f\u0002", new Object[]{"a", "b", "d", "c", amec.a});
        } else if (i2 == 3) {
            return new amhe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amhe.class) {
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
