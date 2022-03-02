package defpackage;

/* renamed from: aquw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aquw extends aucj implements audy {
    public static final aquw d;
    private static volatile auef e;
    public aucx a = auei.b;
    public boolean b;
    public aqwp c;

    static {
        aquw aquw = new aquw();
        d = aquw;
        aucj.a(aquw.class, (aucj) aquw);
    }

    private aquw() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0007\u0003\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aquw();
        } else {
            if (i2 == 4) {
                return new aucd((char[]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aquw.class) {
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
