package defpackage;

/* renamed from: aris  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aris extends aucj implements audy {
    public static final aris d;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    private int e;

    static {
        aris aris = new aris();
        d = aris;
        aucj.a(aris.class, (aucj) aris);
    }

    private aris() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0000\u0002\f\u0001\u0003\f\u0002", new Object[]{"e", "a", "b", ariu.b(), "c", arji.b()});
        } else if (i2 == 3) {
            return new aris();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aris.class) {
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
