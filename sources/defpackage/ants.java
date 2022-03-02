package defpackage;

/* renamed from: ants  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ants extends aucj implements audy {
    public static final ants f;
    private static volatile auef g;
    public int a;
    public int b;
    public int c;
    public antr d;
    public long e;

    static {
        ants ants = new ants();
        f = ants;
        aucj.a(ants.class, (aucj) ants);
    }

    private ants() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0003\u0004\u0002\u0004\t\u0003\u0005\u0002\u0004", new Object[]{"a", "b", qbg.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new ants();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ants.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
