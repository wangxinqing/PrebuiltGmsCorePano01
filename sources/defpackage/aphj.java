package defpackage;

/* renamed from: aphj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aphj extends aucj implements audy {
    public static final aphj d;
    private static volatile auef f;
    public boolean a;
    public apkp b;
    public apkp c;
    private int e;

    static {
        aphj aphj = new aphj();
        d = aphj;
        aucj.a(aphj.class, (aucj) aphj);
    }

    private aphj() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0007\u0001\u0003\t\u0002\u0004\t\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new aphj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aphj.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
