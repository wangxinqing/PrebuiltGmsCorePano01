package defpackage;

/* renamed from: apgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apgf extends aucj implements audy {
    public static final apgf g;
    private static volatile auef i;
    public int a;
    public haa b;
    public audr c = audr.b;
    public String d = "";
    public int e;
    public int f;
    private byte h = 2;

    static {
        apgf apgf = new apgf();
        g = apgf;
        aucj.a(apgf.class, (aucj) apgf);
    }

    private apgf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0001\u0001Љ\u0000\u00022\u0003\b\u0001\u0004\f\u0002\u0005\f\u0003", new Object[]{"a", "b", "c", apgc.a, "d", "e", apgd.a, "f", apge.a});
        } else if (i3 == 3) {
            return new apgf();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (boolean[]) null);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (apgf.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
