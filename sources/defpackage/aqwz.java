package defpackage;

/* renamed from: aqwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwz extends aucj implements audy {
    public static final aqwz d;
    private static volatile auef f;
    public aqvi a;
    public aucx b = auei.b;
    public String c = "";
    /* access modifiers changed from: private */
    public int e;

    static {
        aqwz aqwz = new aqwz();
        d = aqwz;
        aucj.a(aqwz.class, (aucj) aqwz);
    }

    private aqwz() {
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
            return aucj.a((audx) d, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\t\u0002Ț\u0003\u0004\u0004Ȉ", new Object[]{"a", "b", "e", "c"});
        } else if (i2 == 3) {
            return new aqwz();
        } else {
            if (i2 == 4) {
                return new aqwy();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqwz.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
