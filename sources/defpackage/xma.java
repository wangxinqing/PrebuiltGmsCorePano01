package defpackage;

/* renamed from: xma  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xma extends aucj implements audy {
    public static final xma b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        xma xma = new xma();
        b = xma;
        aucj.a(xma.class, (aucj) xma);
    }

    private xma() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", xlz.b()});
        } else if (i2 == 3) {
            return new xma();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (xma.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
