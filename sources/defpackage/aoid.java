package defpackage;

/* renamed from: aoid  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aoid extends aucj implements audy {
    public static final aoid m;
    private static volatile auef n;
    public int a;
    public int b;
    public int c;
    public int d = -1;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public double j;
    public double k;
    public double l;

    static {
        aoid aoid = new aoid();
        m = aoid;
        aucj.a(aoid.class, (aucj) aoid);
    }

    private aoid() {
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
            return aucj.a((audx) m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0000\b\n\u0000\t\u000b\u0000\n", new Object[]{"a", "b", "c", "d", aoib.a, "e", "f", "g", "h", "i", "j", "k", "l"});
        } else if (i3 == 3) {
            return new aoid();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) m);
            }
            if (i3 == 5) {
                return m;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (aoid.class) {
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
