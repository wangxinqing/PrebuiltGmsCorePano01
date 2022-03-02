package defpackage;

/* renamed from: arko  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arko extends aucj implements audy {
    public static final arko e;
    private static volatile auef g;
    public float a;
    public float b;
    public float c;
    public float d;
    private int f;

    static {
        arko arko = new arko();
        e = arko;
        aucj.a(arko.class, (aucj) arko);
    }

    private arko() {
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0001\u0010\u0004\u0000\u0000\u0000\u0001\u0001\u0000\u000b\u0001\u0002\f\u0001\u0003\u0010\u0001\u0001", new Object[]{"f", "a", "c", "d", "b"});
        } else if (i2 == 3) {
            return new arko();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (arko.class) {
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
