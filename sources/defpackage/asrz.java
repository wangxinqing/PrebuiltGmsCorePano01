package defpackage;

/* renamed from: asrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrz extends aucj implements audy {
    public static final asrz d;
    private static volatile auef e;
    public int a;
    public asuu b;
    public aucs c = aucl.b;

    static {
        asrz asrz = new asrz();
        d = asrz;
        aucj.a(asrz.class, (aucj) asrz);
    }

    private asrz() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\t\u0000\u0002\u001e", new Object[]{"a", "b", "c", asqy.b()});
        } else if (i2 == 3) {
            return new asrz();
        } else {
            if (i2 == 4) {
                return new asry();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asrz.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
