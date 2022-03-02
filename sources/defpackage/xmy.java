package defpackage;

/* renamed from: xmy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xmy extends aucj implements audy {
    public static final xmy m;
    private static volatile auef n;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public xmx k;
    public int l;

    static {
        xmy xmy = new xmy();
        m = xmy;
        aucj.a(xmy.class, (aucj) xmy);
    }

    private xmy() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\n\t\n\f\u0004\b\r\u0004\t\u000e\u0004\f", new Object[]{"a", "b", xjs.a, "c", "d", "e", "f", "g", "h", "k", "i", "j", "l"});
        } else if (i3 == 3) {
            return new xmy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (xmy.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(m);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
