package defpackage;

/* renamed from: alzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alzs extends aucj implements audy {
    public static final alzs e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public long c;
    public int d;

    static {
        alzs alzs = new alzs();
        e = alzs;
        aucj.a(alzs.class, (aucj) alzs);
    }

    private alzs() {
        auay auay = auay.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0006\f\u0005", new Object[]{"a", "b", "c", "d", alzt.a});
        } else if (i2 == 3) {
            return new alzs();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (alzs.class) {
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
