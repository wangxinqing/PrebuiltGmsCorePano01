package defpackage;

/* renamed from: xmt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xmt extends aucj implements audy {
    public static final xmt h;
    private static volatile auef i;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public xms e;
    public int f;
    public xmr g;

    static {
        xmt xmt = new xmt();
        h = xmt;
        aucj.a(xmt.class, (aucj) xmt);
    }

    private xmt() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\t\u0003\u0005\f\u0004\u0006\t\u0005", new Object[]{"a", "b", xkr.a, "c", "d", xku.a, "e", "f", xkt.a, "g"});
        } else if (i3 == 3) {
            return new xmt();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (xmt.class) {
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
