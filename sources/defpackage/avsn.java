package defpackage;

/* renamed from: avsn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avsn extends aucj implements audy {
    public static final avsn b;
    private static volatile auef c;
    public aucs a = aucl.b;

    static {
        avsn avsn = new avsn();
        b = avsn;
        aucj.a(avsn.class, (aucj) avsn);
    }

    private avsn() {
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"a"});
        } else if (i2 == 3) {
            return new avsn();
        } else {
            if (i2 == 4) {
                return new avsm();
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (avsn.class) {
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
