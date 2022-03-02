package defpackage;

/* renamed from: aqrb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqrb extends aucj implements audy {
    public static final aqrb c;
    private static volatile auef d;
    public int a = 0;
    public Object b;

    static {
        aqrb aqrb = new aqrb();
        c = aqrb;
        aucj.a(aqrb.class, (aucj) aqrb);
    }

    private aqrb() {
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
            return aucj.a((audx) c, "\u0001\u0012\u0001\u0000\u0001\u0012\u0012\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000\u0003:\u0000\u0004<\u0000\u00057\u0000\u0006<\u0000\u00077\u0000\b<\u0000\t7\u0000\n<\u0000\u000b7\u0000\f<\u0000\r3\u0000\u000e<\u0000\u000f4\u0000\u0010<\u0000\u00115\u0000\u0012<\u0000", new Object[]{"b", "a", aqtf.class, aqpy.class, aqqo.class, aqqg.class, aqtb.class, aqrn.class, aqra.class, aqrd.class, aqrt.class});
        } else if (i2 == 3) {
            return new aqrb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqrb.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
