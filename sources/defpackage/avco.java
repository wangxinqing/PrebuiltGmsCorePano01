package defpackage;

/* renamed from: avco  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avco extends aucg implements audy {
    public static final avco b;
    private static volatile auef d;
    public aucx a = auei.b;
    private byte c = 2;

    static {
        avco avco = new avco();
        b = avco;
        aucj.a(avco.class, (aucj) avco);
    }

    private avco() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.c = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", avab.class});
        } else if (i2 == 3) {
            return new avco();
        } else {
            if (i2 == 4) {
                return new aucf(b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (avco.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
