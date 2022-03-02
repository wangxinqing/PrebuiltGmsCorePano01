package defpackage;

/* renamed from: anpa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anpa extends aucj implements audy {
    public static final anpa u;
    private static volatile auef v;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aucs j = aucl.b;
    public boolean k;
    public int l;
    public int m;
    public boolean n;
    public long o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public int t;

    static {
        anpa anpa = new anpa();
        u = anpa;
        aucj.a(anpa.class, (aucj) anpa);
    }

    private anpa() {
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
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0002\u0016\u0013\u0000\u0001\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0005\u0007\u0004\u0006\f\u0005\u0007\u0004\u0006\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0016\f\u0007\n\r\u0004\u000b\u000e\u0004\f\u0010\u0007\u000e\u0011\u0002\u000f\u0012\u0004\u0010\u0013\u0004\u0011\u0014\u0007\u0012\u0015\f\u0013\u0016\f\u0014", new Object[]{"a", "b", "c", "d", "e", anoy.a, "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", anoy.a, "t", anor.a});
        } else if (i3 == 3) {
            return new anpa();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][]) null, (float[][]) null);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (anpa.class) {
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
