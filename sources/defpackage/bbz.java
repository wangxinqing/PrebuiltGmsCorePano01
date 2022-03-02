package defpackage;

/* renamed from: bbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bbz extends aucj implements audy {
    public static final bbz c;
    private static volatile auef e;
    public long a;
    public aucx b = auei.b;
    private int d;

    static {
        bbz bbz = new bbz();
        c = bbz;
        aucj.a(bbz.class, (aucj) bbz);
    }

    private bbz() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b", new Object[]{"d", "a", "b", bbu.class});
        } else if (i2 == 3) {
            return new bbz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (bbz.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
