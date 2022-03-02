package defpackage;

/* renamed from: aulx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aulx extends aucj implements audy {
    public static final aulx c;
    public static final auci d;
    private static volatile auef f;
    public boolean a;
    public boolean b;
    private int e;

    static {
        aulx aulx = new aulx();
        c = aulx;
        aucj.a(aulx.class, (aucj) aulx);
        aujv aujv = aujv.a;
        aulx aulx2 = c;
        d = aucj.a((audx) aujv, (Object) aulx2, (audx) aulx2, 158511070, aufw.MESSAGE);
    }

    private aulx() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001", new Object[]{"e", "a", "b"});
        } else if (i2 == 3) {
            return new aulx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aulx.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
