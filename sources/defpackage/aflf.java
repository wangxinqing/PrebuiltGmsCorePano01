package defpackage;

/* renamed from: aflf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aflf extends aucj implements audy {
    public static final aflf f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public boolean e;

    static {
        aflf aflf = new aflf();
        f = aflf;
        aucj.a(aflf.class, (aucj) aflf);
    }

    private aflf() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0004\u0007\u0003\u0005\b\u0002", new Object[]{"a", "b", "c", "e", "d"});
        } else if (i2 == 3) {
            return new aflf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aflf.class) {
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
