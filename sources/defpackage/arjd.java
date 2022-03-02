package defpackage;

/* renamed from: arjd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arjd extends aucj implements audy {
    public static final arjd e;
    private static volatile auef g;
    public int a;
    public long b;
    public int c;
    public int d;
    private int f;

    static {
        arjd arjd = new arjd();
        e = arjd;
        aucj.a(arjd.class, (aucj) arjd);
    }

    private arjd() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\u0003\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"f", "a", arjb.a, "b", "c", ariv.a, "d", ariu.b()});
        } else if (i2 == 3) {
            return new arjd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arjd.class) {
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
