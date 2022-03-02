package defpackage;

/* renamed from: amai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amai extends aucj implements audy {
    public static final amai a;
    private static volatile auef d;
    private int b;
    private alzw c;

    static {
        amai amai = new amai();
        a = amai;
        aucj.a(amai.class, (aucj) amai);
    }

    private amai() {
        aucl aucl = aucl.b;
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
            return aucj.a((audx) a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004\t\u0002", new Object[]{"b", "c"});
        } else if (i2 == 3) {
            return new amai();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (amai.class) {
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
