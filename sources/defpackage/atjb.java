package defpackage;

/* renamed from: atjb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atjb extends aucj implements audy {
    public static final auct d = new atiy();
    public static final atjb e;
    private static volatile auef g;
    public int a;
    public long b;
    public aucs c = aucl.b;
    private int f;

    static {
        atjb atjb = new atjb();
        e = atjb;
        aucj.a(atjb.class, (aucj) atjb);
    }

    private atjb() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0000\u0002\u0002\u0001\u0003\u001e", new Object[]{"f", "a", atiz.a, "b", "c", atrp.b()});
        } else if (i2 == 3) {
            return new atjb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atjb.class) {
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
