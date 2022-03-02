package defpackage;

/* renamed from: aqsf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqsf extends aucj implements audy {
    public static final aqsf g;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aqsr e;
    public aucx f = auei.b;

    static {
        aqsf aqsf = new aqsf();
        g = aqsf;
        aucj.a(aqsf.class, (aucj) aqsf);
    }

    private aqsf() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", "f", aqtg.class});
        } else if (i2 == 3) {
            return new aqsf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqsf.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
