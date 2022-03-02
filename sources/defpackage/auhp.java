package defpackage;

/* renamed from: auhp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhp extends aucj implements audy {
    public static final auhp u;
    private static volatile auef v;
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
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public double p;
    public int q;
    public long r;
    public long s;
    public int t;

    static {
        auhp auhp = new auhp();
        u = auhp;
        aucj.a(auhp.class, (aucj) auhp);
    }

    private auhp() {
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
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n\f\u0004\u000b\r\u0004\f\u000e\u0004\r\u000f\u0000\u000e\u0010\u0004\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0004\u0012", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
        } else if (i3 == 3) {
            return new auhp();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) u);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (auhp.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(u);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}
