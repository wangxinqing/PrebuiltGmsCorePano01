package defpackage;

/* renamed from: aqwf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwf extends aucj implements audy {
    public static final aqwf e;
    private static volatile auef f;
    public aucx a = auei.b;
    public String b = "";
    public String c = "";
    public int d;

    static {
        aqwf aqwf = new aqwf();
        e = aqwf;
        aucj.a(aqwf.class, (aucj) aqwf);
    }

    private aqwf() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002Ȉ\u0003Ȉ\u0004\u0004", new Object[]{"a", avlc.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqwf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqwf.class) {
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
