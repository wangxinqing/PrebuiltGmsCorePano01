package defpackage;

/* renamed from: zqz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zqz extends aucj implements audy {
    public static final zqz b;
    private static volatile auef c;
    public audr a = audr.b;

    static {
        zqz zqz = new zqz();
        b = zqz;
        aucj.a(zqz.class, (aucj) zqz);
    }

    private zqz() {
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
            return aucj.a((audx) b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", zqy.a});
        } else if (i2 == 3) {
            return new zqz();
        } else {
            if (i2 == 4) {
                return new aucd((float[][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (zqz.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
