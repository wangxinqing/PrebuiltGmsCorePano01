package defpackage;

/* renamed from: ariz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ariz extends aucj implements audy {
    public static final ariz e;
    private static volatile auef g;
    public int a;
    public int b;
    public float c;
    public long d;
    private int f;

    static {
        ariz ariz = new ariz();
        e = ariz;
        aucj.a(ariz.class, (aucj) ariz);
    }

    private ariz() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0001\u0002\u0004\u0003\u0003", new Object[]{"f", "a", arix.a, "b", ariv.a, "c", "d"});
        } else if (i2 == 3) {
            return new ariz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ariz.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
