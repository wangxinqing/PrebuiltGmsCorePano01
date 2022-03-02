package defpackage;

/* renamed from: aqtx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqtx extends aucj implements audy {
    public static final aqtx a;
    private static volatile auef d;
    private int b;
    private aqsr c;

    static {
        aqtx aqtx = new aqtx();
        a = aqtx;
        aucj.a(aqtx.class, (aucj) aqtx);
    }

    private aqtx() {
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t\u0004", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new aqtx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aqtx.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(a);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
