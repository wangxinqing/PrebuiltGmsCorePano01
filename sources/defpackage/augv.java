package defpackage;

/* renamed from: augv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augv extends aucj implements audy {
    public static final augv u;
    private static volatile auef v;
    public int a;
    public String b = "";
    public String c = "";
    public int d = 1;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String j = "";
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;

    static {
        augv augv = new augv();
        u = augv;
        aucj.a(augv.class, (aucj) augv);
    }

    private augv() {
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
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\f\u0002\u0004\u0007\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0006\b\u0007\u0007\t\b\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0004\u000e\u0010\u0004\u000f\u0011\u0004\u0010\u0013\u0004\u0011\u0014\u0004\u0012", new Object[]{"a", "b", "c", "d", augu.a, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t"});
        } else if (i3 == 3) {
            return new augv();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) u);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (augv.class) {
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
