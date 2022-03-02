package defpackage;

/* renamed from: aunf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aunf extends aucj implements audy {
    public static final aunf c;
    private static volatile auef d;
    public int a = 0;
    public Object b;

    static {
        aunf aunf = new aunf();
        c = aunf;
        aucj.a(aunf.class, (aucj) aunf);
    }

    private aunf() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u00018\u0000", new Object[]{"b", "a"});
        } else if (i2 == 3) {
            return new aunf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aunf.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(c);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
