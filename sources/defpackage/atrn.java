package defpackage;

/* renamed from: atrn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atrn extends aucj implements audy {
    public static final auct b = new atrk();
    public static final atrn c;
    public static final auci d;
    private static volatile auef e;
    public aucs a = aucl.b;

    static {
        atrn atrn = new atrn();
        c = atrn;
        aucj.a(atrn.class, (aucj) atrn);
        atjm atjm = atjm.a;
        atrn atrn2 = c;
        d = aucj.a((audx) atjm, (Object) atrn2, (audx) atrn2, 121436786, aufw.MESSAGE);
    }

    private atrn() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", atrm.b()});
        } else if (i2 == 3) {
            return new atrn();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (atrn.class) {
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
