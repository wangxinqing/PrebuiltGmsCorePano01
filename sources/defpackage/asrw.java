package defpackage;

/* renamed from: asrw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrw extends aucj implements audy {
    public static final asrw f;
    private static volatile auef g;
    public int a;
    public asuu b;
    public avoq c;
    public int d;
    public aucx e = auei.b;

    static {
        asrw asrw = new asrw();
        f = asrw;
        aucj.a(asrw.class, (aucj) asrw);
    }

    private asrw() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", asrv.class});
        } else if (i2 == 3) {
            return new asrw();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (asrw.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
