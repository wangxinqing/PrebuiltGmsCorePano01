package defpackage;

/* renamed from: anxr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anxr extends aucj implements audy {
    public static final anxr f;
    private static volatile auef g;
    public int a;
    public anuv b;
    public long c;
    public int d;
    public int e;

    static {
        anxr anxr = new anxr();
        f = anxr;
        aucj.a(anxr.class, (aucj) anxr);
    }

    private anxr() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0003\f\u0005\u0005\t\u0000\u0006\f\u0006", new Object[]{"a", "c", "d", anxq.a, "b", "e", anxp.a});
        } else if (i2 == 3) {
            return new anxr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (anxr.class) {
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