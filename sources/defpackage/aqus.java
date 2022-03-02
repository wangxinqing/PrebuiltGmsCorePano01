package defpackage;

/* renamed from: aqus  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqus extends aucj implements audy {
    public static final aqus d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aqvx b;
    public aqwp c;

    static {
        aqus aqus = new aqus();
        d = aqus;
        aucj.a(aqus.class, (aucj) aqus);
    }

    private aqus() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t", new Object[]{"a", avkz.class, "b", "c"});
        } else if (i2 == 3) {
            return new aqus();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqus.class) {
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
