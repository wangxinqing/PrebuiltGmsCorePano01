package defpackage;

/* renamed from: aqwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwn extends aucj implements audy {
    public static final aqwn d;
    private static volatile auef e;
    public aquv a;
    public aqwq b;
    public aucs c = aucl.b;

    static {
        aqwn aqwn = new aqwn();
        d = aqwn;
        aucj.a(aqwn.class, (aucj) aqwn);
    }

    private aqwn() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0004\t\u0003\u0000\u0001\u0000\u0004\t\u0006\t\t,", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqwn();
        } else {
            if (i2 == 4) {
                return new aqwl();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqwn.class) {
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
