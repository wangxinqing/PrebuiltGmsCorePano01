package defpackage;

/* renamed from: ixf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ixf extends aucj implements audy {
    public static final ixf c;
    private static volatile auef e;
    public ixg a;
    public String b = "";
    private int d;

    static {
        ixf ixf = new ixf();
        c = ixf;
        aucj.a(ixf.class, (aucj) ixf);
    }

    private ixf() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001", new Object[]{"d", "a", "b"});
        } else if (i2 == 3) {
            return new ixf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ixf.class) {
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
