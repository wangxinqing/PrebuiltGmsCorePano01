package defpackage;

/* renamed from: augs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class augs extends aucj implements audy {
    public static final augs l;
    private static volatile auef m;
    public int a;
    public int b;
    public int c;
    public int d;
    public auhj e;
    public auhj f;
    public auhj g;
    public long h;
    public long i;
    public long j;
    public long k;

    static {
        augs augs = new augs();
        l = augs;
        aucj.a(augs.class, (aucj) augs);
    }

    private augs() {
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
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t", new Object[]{"a", "b", augr.a, "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        } else if (i3 == 3) {
            return new augs();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = m;
            if (auef == null) {
                synchronized (augs.class) {
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
