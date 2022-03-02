package defpackage;

/* renamed from: asvf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asvf extends aucj implements audy {
    public static final asvf f;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public aucx d = auei.b;
    public aucx e = auei.b;

    static {
        asvf asvf = new asvf();
        f = asvf;
        aucj.a(asvf.class, (aucj) asvf);
    }

    private asvf() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", "d", asvg.class, "e", asvg.class});
        } else if (i2 == 3) {
            return new asvf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asvf.class) {
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
