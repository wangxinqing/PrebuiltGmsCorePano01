package defpackage;

/* renamed from: atqb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atqb extends aucj implements audy {
    public static final atqb e;
    private static volatile auef f;
    public int a;
    public atqj b;
    public int c;
    public aucx d = auei.b;

    static {
        atqb atqb = new atqb();
        e = atqb;
        aucj.a(atqb.class, (aucj) atqb);
    }

    private atqb() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\f\u0001\u0003\u001c", new Object[]{"a", "b", "c", atjv.b(), "d"});
        } else if (i2 == 3) {
            return new atqb();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (atqb.class) {
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
