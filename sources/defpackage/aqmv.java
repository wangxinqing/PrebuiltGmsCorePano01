package defpackage;

/* renamed from: aqmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqmv extends aucj implements audy {
    public static final aqmv f;
    private static volatile auef g;
    public int a;
    public int b;
    public aqmy c;
    public aqnc d;
    public aqmw e;

    static {
        aqmv aqmv = new aqmv();
        f = aqmv;
        aucj.a(aqmv.class, (aucj) aqmv);
    }

    private aqmv() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002\u0005\t\u0004", new Object[]{"a", "b", aqmu.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new aqmv();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqmv.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
