package defpackage;

/* renamed from: aqwb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwb extends aucj implements audy {
    public static final aqwb e;
    private static volatile auef f;
    public String a = "";
    public int b;
    public int c;
    public aqur d;

    static {
        aqwb aqwb = new aqwb();
        e = aqwb;
        aucj.a(aqwb.class, (aucj) aqwb);
    }

    private aqwb() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\t\u0004\u0000\u0000\u0000\u0001Ȉ\u0004\f\u0005\u0004\t\t", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqwb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqwb.class) {
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
