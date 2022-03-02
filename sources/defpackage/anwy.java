package defpackage;

/* renamed from: anwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anwy extends aucj implements audy {
    public static final anwy e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public int d;

    static {
        anwy anwy = new anwy();
        e = anwy;
        aucj.a(anwy.class, (aucj) anwy);
    }

    private anwy() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", anww.a, "d", anwx.a});
        } else if (i2 == 3) {
            return new anwy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (anwy.class) {
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
