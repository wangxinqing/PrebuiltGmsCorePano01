package defpackage;

/* renamed from: arjp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arjp extends aucj implements audy {
    public static final arjp d;
    private static volatile auef e;
    public int a;
    public arcr b;
    public arcv c;

    static {
        arjp arjp = new arjp();
        d = arjp;
        aucj.a(arjp.class, (aucj) arjp);
    }

    private arjp() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arjp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arjp.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
