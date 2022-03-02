package defpackage;

/* renamed from: aqpd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqpd extends aucj implements audy {
    public static final aqpd g;
    private static volatile auef h;
    public hme a;
    public int b;
    public hme c;
    public int d;
    public String e = "";
    public long f;

    static {
        aqpd aqpd = new aqpd();
        g = aqpd;
        aucj.a(aqpd.class, (aucj) aqpd);
    }

    private aqpd() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t\u0005\u0004\u0006Ȉ\u0007\u0002", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new aqpd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqpd.class) {
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
