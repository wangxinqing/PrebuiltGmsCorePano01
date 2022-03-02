package defpackage;

/* renamed from: almz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almz extends aucj implements audy {
    public static final almz e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public boolean c;
    public String d = "";

    static {
        almz almz = new almz();
        e = almz;
        aucj.a(almz.class, (aucj) almz);
    }

    private almz() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\u0007\u0002\u0005\b\u0004", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new almz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (almz.class) {
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
