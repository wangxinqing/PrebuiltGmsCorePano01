package defpackage;

/* renamed from: aqol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqol extends aucj implements audy {
    public static final aqol d;
    private static volatile auef e;
    public String a = "";
    public auay b = auay.b;
    public hmf c;

    static {
        aqol aqol = new aqol();
        d = aqol;
        aucj.a(aqol.class, (aucj) aqol);
    }

    private aqol() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0004\t", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqol();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqol.class) {
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
