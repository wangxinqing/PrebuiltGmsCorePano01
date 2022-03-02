package defpackage;

/* renamed from: amgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amgn extends aucj implements audy {
    public static final amgn f;
    private static volatile auef g;
    public int a;
    public int b = 1;
    public aucv c;
    public amfu d;
    public aucx e;

    static {
        amgn amgn = new amgn();
        f = amgn;
        aucj.a(amgn.class, (aucj) amgn);
    }

    private amgn() {
        auei auei = auei.b;
        this.c = audl.b;
        aucl aucl = aucl.b;
        this.e = auei.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0006\u001c\u0004\u0000\u0002\u0000\u0006\u0014\u0016\t\u0007\u0019\f\u0000\u001c\u001b", new Object[]{"a", "c", "d", "b", amgm.a, "e", amfk.class});
        } else if (i2 == 3) {
            return new amgn();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (boolean[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (amgn.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
