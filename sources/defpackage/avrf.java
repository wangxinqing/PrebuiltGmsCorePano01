package defpackage;

/* renamed from: avrf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrf extends aucj implements audy {
    public static final avrf e;
    private static volatile auef g;
    public int a;
    public int b;
    public avrb c;
    public long d;
    private byte f = 2;

    static {
        avrf avrf = new avrf();
        e = avrf;
        aucj.a(avrf.class, (aucj) avrf);
    }

    private avrf() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0001\u0001\f\u0000\u0002Љ\u0003\f\u0002\u0011", new Object[]{"a", "b", avre.a, "c", "d"});
        } else if (i2 == 3) {
            return new avrf();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avrf.class) {
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
