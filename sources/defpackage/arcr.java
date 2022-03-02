package defpackage;

/* renamed from: arcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcr extends aucj implements audy {
    public static final arcr f;
    private static volatile auef g;
    public arcu a;
    public ardg b;
    public arck c;
    public ardc d;
    public arcz e;

    static {
        arcr arcr = new arcr();
        f = arcr;
        aucj.a(arcr.class, (aucj) arcr);
    }

    private arcr() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\t\u0004\t\u0005\t", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new arcr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arcr.class) {
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
