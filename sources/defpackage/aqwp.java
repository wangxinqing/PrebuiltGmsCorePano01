package defpackage;

/* renamed from: aqwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwp extends aucj implements audy {
    public static final aqwp d;
    private static volatile auef e;
    public aqur a;
    public aqwo b;
    public avkh c;

    static {
        aqwp aqwp = new aqwp();
        d = aqwp;
        aucj.a(aqwp.class, (aucj) aqwp);
    }

    private aqwp() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0004\t\u0003\u0000\u0000\u0000\u0004\t\u0005\t\t\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqwp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqwp.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
