package defpackage;

/* renamed from: aavk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aavk extends aucj implements audy {
    public static final aavk e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public aucs d = aucl.b;

    static {
        aavk aavk = new aavk();
        e = aavk;
        aucj.a(aavk.class, (aucj) aavk);
    }

    private aavk() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0004\u001e", new Object[]{"a", "b", "c", "d", aavi.b()});
        } else if (i2 == 3) {
            return new aavk();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (float[][][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aavk.class) {
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
