package defpackage;

/* renamed from: aukr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aukr extends aucj implements audy {
    public static final aukr h;
    private static volatile auef i;
    public int a;
    public long b;
    public long c = -1;
    public auay d = auay.b;
    public auay e = auay.b;
    public auay f = auay.b;
    public aukp g;

    static {
        aukr aukr = new aukr();
        h = aukr;
        aucj.a(aukr.class, (aucj) aukr);
    }

    private aukr() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\n\u0002\u0004\n\u0003\u0005\n\u0004\u0006\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aukr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aukr.class) {
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
