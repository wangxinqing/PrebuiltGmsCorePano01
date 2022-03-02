package defpackage;

/* renamed from: atzc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzc extends aucj implements audy {
    public static final atzc h;
    private static volatile auef i;
    public int a;
    public atyh b;
    public String c = "";
    public boolean d;
    public aucs e = aucl.b;
    public atzv f;
    public aucx g = auei.b;

    static {
        atzc atzc = new atzc();
        h = atzc;
        aucj.a(atzc.class, (aucj) atzc);
    }

    private atzc() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\u0007\u0002\u0003\t\u0000\u0004\t\u0003\u0005\b\u0001\u0006\u001b", new Object[]{"a", "e", "d", "b", "f", "c", "g", atyt.class});
        } else if (i3 == 3) {
            return new atzc();
        } else {
            if (i3 == 4) {
                return new atzb();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (atzc.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
