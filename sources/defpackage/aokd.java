package defpackage;

/* renamed from: aokd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aokd extends aucj implements audy {
    public static final aokd c;
    private static volatile auef d;
    public int a;
    public int b;

    static {
        aokd aokd = new aokd();
        c = aokd;
        aucj.a(aokd.class, (aucj) aokd);
    }

    private aokd() {
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
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\f\u0003", new Object[]{"a", "b", aomr.b()});
        } else if (i2 == 3) {
            return new aokd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (aokd.class) {
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
