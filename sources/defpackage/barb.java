package defpackage;

/* renamed from: barb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class barb extends aucg implements audy {
    public static final barb c;
    private static volatile auef e;
    public int a;
    public nih b;
    private byte d = 2;

    static {
        barb barb = new barb();
        c = barb;
        aucj.a(barb.class, (aucj) barb);
    }

    private barb() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0000\b\t\u0005", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new barb();
        } else {
            if (i2 == 4) {
                return new aucf(c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (barb.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
