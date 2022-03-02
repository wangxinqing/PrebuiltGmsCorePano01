package defpackage;

/* renamed from: atsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atsm extends aucj implements audy {
    public static final auct c = new atsj();
    public static final atsm d;
    private static volatile auef f;
    public atsg a;
    public aucs b = aucl.b;
    private int e;

    static {
        atsm atsm = new atsm();
        d = atsm;
        aucj.a(atsm.class, (aucj) atsm);
    }

    private atsm() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001e", new Object[]{"e", "a", "b", atsl.b()});
        } else if (i2 == 3) {
            return new atsm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atsm.class) {
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
