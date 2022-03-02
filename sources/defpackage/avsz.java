package defpackage;

/* renamed from: avsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsz extends aucj implements audy {
    public static final avsz h;
    private static volatile auef i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public avtm g;

    static {
        avsz avsz = new avsz();
        h = avsz;
        aucj.a(avsz.class, (aucj) avsz);
    }

    private avsz() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0004\u0003\u0004\u0004\u0004\u0006\t\u0006\u0007\u0004\u0002", new Object[]{"a", "b", avsw.a, "c", avsx.a, "e", "f", "g", "d"});
        } else if (i3 == 3) {
            return new avsz();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (avsz.class) {
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
