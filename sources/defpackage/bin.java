package defpackage;

/* renamed from: bin  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bin extends aucj implements audy {
    public static final bin d;
    private static volatile auef e;
    public int a;
    public int b;
    public big c;

    static {
        bin bin = new bin();
        d = bin;
        aucj.a(bin.class, (aucj) bin);
    }

    private bin() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\t\u0001\u0003\f\u0000", new Object[]{"a", "c", "b", bik.a});
        } else if (i2 == 3) {
            return new bin();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (bin.class) {
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
