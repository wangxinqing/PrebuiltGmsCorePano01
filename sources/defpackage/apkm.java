package defpackage;

/* renamed from: apkm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apkm extends aucj implements audy {
    public static final apkm d;
    private static volatile auef f;
    public String a = "";
    public String b = "";
    public String c = "";
    private int e;

    static {
        apkm apkm = new apkm();
        d = apkm;
        aucj.a(apkm.class, (aucj) apkm);
    }

    private apkm() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0004\b\u0003", new Object[]{"e", "a", "b", "c"});
        } else if (i2 == 3) {
            return new apkm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apkm.class) {
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
