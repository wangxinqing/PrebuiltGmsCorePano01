package defpackage;

/* renamed from: bbm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bbm extends aucj implements audy {
    public static final bbm b;
    private static volatile auef d;
    public long a;
    private int c;

    static {
        bbm bbm = new bbm();
        b = bbm;
        aucj.a(bbm.class, (aucj) bbm);
    }

    private bbm() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new bbm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (bbm.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
