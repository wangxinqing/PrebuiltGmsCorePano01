package defpackage;

/* renamed from: anzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anzr extends aucj implements audy {
    public static final anzr p;
    private static volatile auef q;
    public int a;
    public long b;
    public boolean c;
    public boolean d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public long k;
    public int l;
    public int m;
    public int n;
    public int o;

    static {
        anzr anzr = new anzr();
        p = anzr;
        aucj.a(anzr.class, (aucj) anzr);
    }

    private anzr() {
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
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001\u0005\u0000\u0003\u0007\u0002\u0004\u0007\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\t\u0002\b\n\u0007\t\u000b\u0004\n\f\u0002\u000b\r\u0004\f\u000e\u0004\r\u000f\u0004\u000e\u0010\u0004\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new anzr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (anzr.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
