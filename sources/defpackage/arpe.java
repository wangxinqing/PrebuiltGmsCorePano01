package defpackage;

/* renamed from: arpe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arpe extends aucj implements audy {
    public static final arpe d;
    private static volatile auef e;
    public auay a = auay.b;
    public auay b = auay.b;
    public auay c = auay.b;

    static {
        arpe arpe = new arpe();
        d = arpe;
        aucj.a(arpe.class, (aucj) arpe);
    }

    private arpe() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\n\u0003\n", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arpe();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arpe.class) {
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
