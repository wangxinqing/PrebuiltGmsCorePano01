package defpackage;

/* renamed from: aquc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aquc extends aucj implements audy {
    public static final auct b = new aqtz();
    public static final aquc e;
    private static volatile auef g;
    public aucs a = aucl.b;
    public String c = "";
    public String d = "";
    private int f;

    static {
        aquc aquc = new aquc();
        e = aquc;
        aucj.a(aquc.class, (aucj) aquc);
    }

    private aquc() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001", new Object[]{"f", "a", aqub.b(), "c", "d"});
        } else if (i2 == 3) {
            return new aquc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aquc.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
