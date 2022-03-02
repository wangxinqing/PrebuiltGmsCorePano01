package defpackage;

/* renamed from: avuc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avuc extends aucj implements audy {
    public static final avuc e;
    private static volatile auef f;
    public int a;
    public aucv b = audl.b;
    public boolean c;
    public long d;

    static {
        avuc avuc = new avuc();
        e = avuc;
        aucj.a(avuc.class, (aucj) avuc);
    }

    private avuc() {
        audl audl = audl.b;
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u0017\u0003\u0007\u0000\u0004\u0005\u0001", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new avuc();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avuc.class) {
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
