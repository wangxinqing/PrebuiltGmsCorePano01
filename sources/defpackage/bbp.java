package defpackage;

/* renamed from: bbp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bbp extends aucj implements audy {
    public static final bbp d;
    private static volatile auef f;
    public int a = 0;
    public Object b;
    public long c;
    private int e;

    static {
        bbp bbp = new bbp();
        d = bbp;
        aucj.a(bbp.class, (aucj) bbp);
    }

    private bbp() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 1) {
            return null;
        }
        if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", "e", "c", bcf.class, bbo.class});
        } else if (i2 == 3) {
            return new bbp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (bbp.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
