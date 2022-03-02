package defpackage;

/* renamed from: barc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class barc extends aucj implements audy {
    private static volatile auef A;
    public static final barc z;
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
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;

    static {
        barc barc = new barc();
        z = barc;
        aucj.a(barc.class, (aucj) barc);
    }

    private barc() {
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
            return aucj.a((audx) z, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\u0006\u0004\u0005\u0007\u0004\u0007\b\u0004\b\t\u0004\t\n\u0004\n\u000b\u0004\u000b\f\u0004\f\r\u0004\r\u000e\u0004\u000e\u000f\u0004\u000f\u0010\u0004\u0010\u0011\u0004\u0011\u0012\u0004\u0012\u0013\u0004\u0006\u0014\u0002\u0013\u0015\u0002\u0014\u0016\u0002\u0015\u0017\u0002\u0016\u0018\u0002\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "h", "u", "v", "w", "x", "y"});
        } else if (i3 == 3) {
            return new barc();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) z);
            }
            if (i3 == 5) {
                return z;
            }
            auef auef = A;
            if (auef == null) {
                synchronized (barc.class) {
                    auef = A;
                    if (auef == null) {
                        auef = new auce(z);
                        A = auef;
                    }
                }
            }
            return auef;
        }
    }
}
