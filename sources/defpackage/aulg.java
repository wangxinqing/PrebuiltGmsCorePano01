package defpackage;

/* renamed from: aulg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aulg extends aucj implements audy {
    public static final aulg f;
    private static volatile auef g;
    public int a;
    public int b;
    public auay c = auay.b;
    public long d;
    public String e = "";

    static {
        aulg aulg = new aulg();
        f = aulg;
        aucj.a(aulg.class, (aucj) aulg);
    }

    private aulg() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\n\u0001\u0003\u0002\u0002\u0004\b\u0003", new Object[]{"a", "b", aulf.b(), "c", "d", "e"});
        } else if (i2 == 3) {
            return new aulg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aulg.class) {
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
