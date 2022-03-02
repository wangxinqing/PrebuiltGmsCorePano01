package defpackage;

/* renamed from: aqxf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxf extends aucj implements audy {
    public static final aqxf e;
    private static volatile auef f;
    public aucx a = auei.b;
    public aqvx b;
    public aqwp c;
    public int d;

    static {
        aqxf aqxf = new aqxf();
        e = aqxf;
        aucj.a(aqxf.class, (aucj) aqxf);
    }

    private aqxf() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004\f", new Object[]{"a", avkz.class, "b", "c", "d"});
        } else if (i2 == 3) {
            return new aqxf();
        } else {
            if (i2 == 4) {
                return new aucd((byte[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (aqxf.class) {
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
