package defpackage;

/* renamed from: aqww  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqww extends aucj implements audy {
    public static final aqww d;
    private static volatile auef e;
    public aubw a;
    public aucs b = aucl.b;
    public aqwv c;

    static {
        aqww aqww = new aqww();
        d = aqww;
        aucj.a(aqww.class, (aucj) aqww);
    }

    private aqww() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0007\u0003\u0000\u0001\u0000\u0001\t\u0003,\u0007\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqww();
        } else {
            if (i2 == 4) {
                return new aqwu();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqww.class) {
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
