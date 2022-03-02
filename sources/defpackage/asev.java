package defpackage;

/* renamed from: asev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asev extends aucg implements audy {
    public static final asev h;
    private static volatile auef j;
    public int a;
    public asfp b;
    public asft c;
    public int d;
    public int e;
    public int f;
    public int g;
    private byte i = 2;

    static {
        asev asev = new asev();
        h = asev;
        aucj.a(asev.class, (aucj) asev);
    }

    private asev() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.i);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.i = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\f\u0002\u0004\u0004\u0003\u0007\f\u0004\b\f\u0005", new Object[]{"a", "b", "c", "d", aseu.b(), "e", "f", asfb.a, "g", avax.a});
        } else if (i3 == 3) {
            return new asev();
        } else {
            if (i3 == 4) {
                return new aucf(h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = j;
            if (auef == null) {
                synchronized (asev.class) {
                    auef = j;
                    if (auef == null) {
                        auef = new auce(h);
                        j = auef;
                    }
                }
            }
            return auef;
        }
    }
}
