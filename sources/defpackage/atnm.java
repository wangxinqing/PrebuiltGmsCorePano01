package defpackage;

/* renamed from: atnm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atnm extends aucj implements audy {
    public static final atnm b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        atnm atnm = new atnm();
        b = atnm;
        aucj.a(atnm.class, (aucj) atnm);
    }

    private atnm() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", atjs.b()});
        } else if (i2 == 3) {
            return new atnm();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (atnm.class) {
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
