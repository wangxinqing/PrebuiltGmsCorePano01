package defpackage;

/* renamed from: arlb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arlb extends aucj implements audy {
    public static final arlb c;
    private static volatile auef e;
    public int a;
    public aucx b = auei.b;
    private int d;

    static {
        arlb arlb = new arlb();
        c = arlb;
        aucj.a(arlb.class, (aucj) arlb);
    }

    private arlb() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0000\u0002\u001b", new Object[]{"d", "a", "b", arlc.class});
        } else if (i2 == 3) {
            return new arlb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arlb.class) {
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
