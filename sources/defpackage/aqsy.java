package defpackage;

/* renamed from: aqsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsy extends aucj implements audy {
    public static final aqsy e;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    public aqrj c;
    public aqrl d;

    static {
        aqsy aqsy = new aqsy();
        e = aqsy;
        aucj.a(aqsy.class, (aucj) aqsy);
    }

    private aqsy() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000\u0003\t\u0001", new Object[]{"a", "b", aqsz.class, "c", "d"});
        } else if (i2 == 3) {
            return new aqsy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqsy.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
