package defpackage;

/* renamed from: aqvt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqvt extends aucj implements audy {
    public static final aqvt e;
    private static volatile auef g;
    public int a;
    public String b = "";
    public aqws c;
    public aqwp d;
    /* access modifiers changed from: private */
    public boolean f;

    static {
        aqvt aqvt = new aqvt();
        e = aqvt;
        aucj.a(aqvt.class, (aucj) aqvt);
    }

    private aqvt() {
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
            return aucj.a((audx) e, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\t\u0004\u0007\u0005\t", new Object[]{"a", "b", "c", "f", "d"});
        } else if (i2 == 3) {
            return new aqvt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqvt.class) {
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
