package defpackage;

/* renamed from: ambi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ambi extends aucj implements audy {
    public static final ambi f;
    private static volatile auef g;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;

    static {
        ambi ambi = new ambi();
        f = ambi;
        aucj.a(ambi.class, (aucj) ambi);
    }

    private ambi() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\u0003\u0000\u0003\f\u0002\u0004\u000b\u0003\u0005\u000b\u0004", new Object[]{"a", "b", "c", amac.a, "d", "e"});
        } else if (i2 == 3) {
            return new ambi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ambi.class) {
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
