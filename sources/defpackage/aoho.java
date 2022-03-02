package defpackage;

/* renamed from: aoho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoho extends aucj implements audy {
    public static final aoho s;
    private static volatile auef t;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public int m;
    public int n = -1;
    public long o;
    public long p;
    public long q;
    public long r;

    static {
        aoho aoho = new aoho();
        s = aoho;
        aucj.a(aoho.class, (aucj) aoho);
    }

    private aoho() {
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
            return aucj.a((audx) s, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0004\u000b\r\f\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", aohm.a, "o", "p", "q", "r"});
        } else if (i3 == 3) {
            return new aoho();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) s);
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (aoho.class) {
                    auef = t;
                    if (auef == null) {
                        auef = new auce(s);
                        t = auef;
                    }
                }
            }
            return auef;
        }
    }
}
