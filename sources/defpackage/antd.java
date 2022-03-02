package defpackage;

/* renamed from: antd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class antd extends aucj implements audy {
    public static final antd l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public antb j;
    public long k;

    static {
        antd antd = new antd();
        l = antd;
        aucj.a(antd.class, (aucj) antd);
    }

    private antd() {
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
            return aucj.a((audx) l, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\f\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0004\b\u0004\t\f\n\t\u000b\u0002", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new antd();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (antd.class) {
                    auef = m;
                    if (auef == null) {
                        auef = new auce(l);
                        m = auef;
                    }
                }
            }
            return auef;
        }
    }
}
