package defpackage;

/* renamed from: apkr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apkr extends aucj implements audy {
    public static final apkr g;
    private static volatile auef h;
    public int a;
    public apgw b;
    public boolean c;
    public boolean d;
    public String e = "";
    public apkp f;

    static {
        apkr apkr = new apkr();
        g = apkr;
        aucj.a(apkr.class, (aucj) apkr);
    }

    private apkr() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\b\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new apkr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apkr.class) {
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
