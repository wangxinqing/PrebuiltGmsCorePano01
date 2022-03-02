package defpackage;

/* renamed from: almg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almg extends aucj implements audy {
    public static final almg b;
    private static volatile auef f;
    public aucx a = auei.b;
    private int c;
    private String d = "";
    private byte e = 2;

    static {
        almg almg = new almg();
        b = almg;
        aucj.a(almg.class, (aucj) almg);
    }

    private almg() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Ԉ\u0000\u0002\u001b", new Object[]{"c", "d", "a", alnl.class});
        } else if (i2 == 3) {
            return new almg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (almg.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(b);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
