package defpackage;

/* renamed from: xoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xoh extends aucj implements audy {
    public static final xoh f;
    private static volatile auef g;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public long e;

    static {
        xoh xoh = new xoh();
        f = xoh;
        aucj.a(xoh.class, (aucj) xoh);
    }

    private xoh() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0002\u0003", new Object[]{"a", "b", xoe.a, "c", "d", xof.a, "e"});
        } else if (i2 == 3) {
            return new xoh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (xoh.class) {
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
