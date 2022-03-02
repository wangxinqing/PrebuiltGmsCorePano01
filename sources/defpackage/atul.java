package defpackage;

/* renamed from: atul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atul extends aucj implements audy {
    public static final atul d;
    private static volatile auef f;
    public int a;
    public int b;
    public aucs c = aucl.b;
    private int e;

    static {
        atul atul = new atul();
        d = atul;
        aucj.a(atul.class, (aucj) atul);
    }

    private atul() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004'", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new atul();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atul.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
