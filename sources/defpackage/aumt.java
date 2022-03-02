package defpackage;

/* renamed from: aumt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aumt extends aucj implements audy {
    public static final aumt e;
    private static volatile auef g;
    public aums a;
    public aums b;
    public aums c;
    public aums d;
    private int f;

    static {
        aumt aumt = new aumt();
        e = aumt;
        aucj.a(aumt.class, (aucj) aumt);
    }

    private aumt() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0004\t\u0003\u0005\t\u0004", new Object[]{"f", "a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aumt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aumt.class) {
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
