package defpackage;

/* renamed from: apja  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apja extends aucj implements audy {
    public static final apja g;
    private static volatile auef h;
    public int a;
    public apgw b;
    public aucx c = auei.b;
    public apgz d;
    public String e = "";
    public apjw f;

    static {
        apja apja = new apja();
        g = apja;
        aucj.a(apja.class, (aucj) apja);
    }

    private apja() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\t\u0001\u0004\b\u0002\u0006\t\u0004", new Object[]{"a", "b", "c", apkp.class, "d", "e", "f"});
        } else if (i2 == 3) {
            return new apja();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (apja.class) {
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
