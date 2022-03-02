package defpackage;

/* renamed from: avfi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfi extends aucj implements audy {
    public static final avfi b;
    public static final auci c;
    private static volatile auef e;
    public avga a;
    private int d;

    static {
        avfi avfi = new avfi();
        b = avfi;
        aucj.a(avfi.class, (aucj) avfi);
        amdz amdz = amdz.a;
        avfi avfi2 = b;
        c = aucj.a((audx) amdz, (Object) avfi2, (audx) avfi2, 90751297, aufw.MESSAGE);
    }

    private avfi() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"d", "a"});
        } else if (i2 == 3) {
            return new avfi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (avfi.class) {
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
