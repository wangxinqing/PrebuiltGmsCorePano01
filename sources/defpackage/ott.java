package defpackage;

/* renamed from: ott  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ott extends aucj implements audy {
    public static final ott f;
    private static volatile auef g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    static {
        ott ott = new ott();
        f = ott;
        aucj.a(ott.class, (aucj) ott);
    }

    private ott() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\n\u0013\u0004\u0000\u0000\u0000\n\u0007\u0000\f\u0007\u0001\u0011\u0007\u0003\u0013\u0007\u0004", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new ott();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ott.class) {
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
