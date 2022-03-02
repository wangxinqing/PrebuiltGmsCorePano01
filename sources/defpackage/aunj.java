package defpackage;

/* renamed from: aunj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aunj extends aucj implements audy {
    public static final aunj d;
    private static volatile auef f;
    public int a = 0;
    public Object b;
    public int c;
    private int e;

    static {
        aunj aunj = new aunj();
        d = aunj;
        aucj.a(aunj.class, (aucj) aunj);
    }

    private aunj() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002<\u0000", new Object[]{"b", "a", "e", "c", auni.b(), auks.class});
        } else if (i2 == 3) {
            return new aunj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aunj.class) {
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
