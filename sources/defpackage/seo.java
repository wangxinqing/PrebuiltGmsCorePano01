package defpackage;

/* renamed from: seo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class seo extends aucj implements audy {
    public static final seo e;
    private static volatile auef f;
    public int a;
    public long b;
    public String c = "";
    public String d = "";

    static {
        seo seo = new seo();
        e = seo;
        aucj.a(seo.class, (aucj) seo);
    }

    private seo() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new seo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (seo.class) {
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
