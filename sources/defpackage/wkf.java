package defpackage;

/* renamed from: wkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wkf extends aucj implements audy {
    public static final wkf g;
    private static volatile auef h;
    public String a = "";
    public String b = "";
    public int c;
    public int d;
    public int e;
    public String f = "";

    static {
        wkf wkf = new wkf();
        g = wkf;
        aucj.a(wkf.class, (aucj) wkf);
    }

    private wkf() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0004\u0004\u0004\u0005\u0004\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new wkf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (wkf.class) {
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
