package defpackage;

/* renamed from: aqox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqox extends aucj implements audy {
    public static final aqox d;
    private static volatile auef e;
    public String a = "";
    public auay b = auay.b;
    public aucx c = auei.b;

    static {
        aqox aqox = new aqox();
        d = aqox;
        aucj.a(aqox.class, (aucj) aqox);
    }

    private aqox() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001Ȉ\u0003\n\u0004Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aqox();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null, (int[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqox.class) {
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
