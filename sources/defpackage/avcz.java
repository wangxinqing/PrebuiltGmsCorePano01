package defpackage;

/* renamed from: avcz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avcz extends aucg implements audy {
    public static final avcz d;
    private static volatile auef f;
    public int a;
    public avad b;
    public auyt c;
    private byte e = 2;

    static {
        avcz avcz = new avcz();
        d = avcz;
        aucj.a(avcz.class, (aucj) avcz);
    }

    private avcz() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0001\u0003\t\u0001\u0004Љ\u0002", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new avcz();
        } else {
            if (i2 == 4) {
                return new aucf(d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avcz.class) {
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
