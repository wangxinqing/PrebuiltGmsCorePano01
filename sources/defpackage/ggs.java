package defpackage;

/* renamed from: ggs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggs extends aucj implements audy {
    public static final ggs e;
    private static volatile auef g;
    public String a = "";
    public int b;
    public String c = "";
    public aucx d = auei.b;
    private int f;

    static {
        ggs ggs = new ggs();
        e = ggs;
        aucj.a(ggs.class, (aucj) ggs);
    }

    private ggs() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0001\u0003\b\u0002\u0004\u001b", new Object[]{"f", "a", "b", ggq.a, "c", "d", ggk.class});
        } else if (i2 == 3) {
            return new ggs();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ggs.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
