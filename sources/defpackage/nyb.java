package defpackage;

/* renamed from: nyb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nyb extends aucj implements audy {
    public static final nyb c;
    private static volatile auef f;
    public int a;
    public nya b;
    private nyf d;
    private byte e = 2;

    static {
        nyb nyb = new nyb();
        c = nyb;
        aucj.a(nyb.class, (aucj) nyb);
    }

    private nyb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0001\u0002Љ\u0001\u0003\t\u0002", new Object[]{"a", "d", "b"});
        } else if (i2 == 3) {
            return new nyb();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (nyb.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
