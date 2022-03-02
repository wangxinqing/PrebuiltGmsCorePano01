package defpackage;

/* renamed from: alno  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alno extends aucj implements audy {
    public static final alno g;
    private static volatile auef h;
    public int a;
    public alnn b;
    public auay c = auay.b;
    public long d;
    public long e;
    public auay f = auay.b;

    static {
        alno alno = new alno();
        g = alno;
        aucj.a(alno.class, (aucj) alno);
    }

    private alno() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\n\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\n\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new alno();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (alno.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
