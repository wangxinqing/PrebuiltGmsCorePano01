package defpackage;

/* renamed from: auyf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyf extends aucj implements audy {
    public static final auyf e;
    private static volatile auef f;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;

    static {
        auyf auyf = new auyf();
        e = auyf;
        aucj.a(auyf.class, (aucj) auyf);
    }

    private auyf() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", auya.class, "d", auxx.class});
        } else if (i2 == 3) {
            return new auyf();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auyf.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
