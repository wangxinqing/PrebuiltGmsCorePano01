package defpackage;

/* renamed from: antf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antf extends aucj implements audy {
    public static final antf h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        antf antf = new antf();
        h = antf;
        aucj.a(antf.class, (aucj) antf);
    }

    private antf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\f\u0002\f\u0003\u0002\u0004\u0004\u0005\u0004\u0006\u0004\b\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new antf();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (antf.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
