package defpackage;

/* renamed from: amaz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amaz extends aucj implements audy {
    public static final amaz e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public boolean d;

    static {
        amaz amaz = new amaz();
        e = amaz;
        aucj.a(amaz.class, (aucj) amaz);
    }

    private amaz() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0007\u0002", new Object[]{"a", "b", ambr.a, "c", amab.a, "d"});
        } else if (i2 == 3) {
            return new amaz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (amaz.class) {
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
