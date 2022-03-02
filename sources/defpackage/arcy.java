package defpackage;

/* renamed from: arcy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arcy extends aucj implements audy {
    public static final arcy d;
    private static volatile auef e;
    public double a;
    public double b;
    public double c;

    static {
        arcy arcy = new arcy();
        d = arcy;
        aucj.a(arcy.class, (aucj) arcy);
    }

    private arcy() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0000\u0002\u0000\u0003\u0000", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new arcy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (arcy.class) {
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
