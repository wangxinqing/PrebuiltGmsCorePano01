package defpackage;

/* renamed from: avcr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcr extends aucg implements audy {
    public static final avcr c;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    private int d;
    private byte e = 2;

    static {
        avcr avcr = new avcr();
        c = avcr;
        aucj.a(avcr.class, (aucj) avcr);
    }

    private avcr() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\f\u0000\u0003\u001b", new Object[]{"d", "a", atio.b(), "b", auzt.class});
        } else if (i2 == 3) {
            return new avcr();
        } else {
            if (i2 == 4) {
                return new aucf(c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avcr.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
