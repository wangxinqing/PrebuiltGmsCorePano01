package defpackage;

/* renamed from: aozq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aozq extends aucj implements audy {
    public static final aozq e;
    private static volatile auef f;
    public int a;
    public aozo b;
    public auay c = auay.b;
    public auay d = auay.b;

    static {
        aozq aozq = new aozq();
        e = aozq;
        aucj.a(aozq.class, (aucj) aozq);
    }

    private aozq() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aozq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aozq.class) {
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
