package defpackage;

/* renamed from: arbh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arbh extends aucj implements audy {
    public static final arbh f;
    private static volatile auef g;
    public arbk a;
    public arbj b;
    public long c;
    public auay d = auay.b;
    public arbd e;

    static {
        arbh arbh = new arbh();
        f = arbh;
        aucj.a(arbh.class, (aucj) arbh);
    }

    private arbh() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003\n\u0004\u0002\u0005\t", new Object[]{"a", "b", "d", "c", "e"});
        } else if (i2 == 3) {
            return new arbh();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arbh.class) {
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
