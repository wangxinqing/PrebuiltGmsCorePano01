package defpackage;

/* renamed from: ggu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggu extends aucj implements audy {
    public static final ggu b;
    private static volatile auef e;
    public String a = "";
    private int c;
    private byte d = 2;

    static {
        ggu ggu = new ggu();
        b = ggu;
        aucj.a(ggu.class, (aucj) ggu);
    }

    private ggu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Ԉ\u0000", new Object[]{"c", "a"});
        } else if (i2 == 3) {
            return new ggu();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (ggu.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(b);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
