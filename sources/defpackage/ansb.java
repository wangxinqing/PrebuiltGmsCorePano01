package defpackage;

/* renamed from: ansb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ansb extends aucj implements audy {
    public static final ansb e;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;

    static {
        ansb ansb = new ansb();
        e = ansb;
        aucj.a(ansb.class, (aucj) ansb);
    }

    private ansb() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u000b\u0000\u0002\u000b\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", ansa.class});
        } else if (i2 == 3) {
            return new ansb();
        } else {
            if (i2 == 4) {
                return new aucd((short[]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (ansb.class) {
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
