package defpackage;

/* renamed from: avhz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avhz extends aucj implements audy {
    public static final avhz e;
    private static volatile auef g;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;
    public String d = "";
    private int f;

    static {
        avhz avhz = new avhz();
        e = avhz;
        aucj.a(avhz.class, (aucj) avhz);
    }

    private avhz() {
        auei auei = auei.b;
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
            return aucj.a((audx) e, "\u0001\u0004\u0000\u0001\u0003\u0006\u0004\u0000\u0003\u0000\u0003\u001b\u0004\u001b\u0005\u001b\u0006\b\u0001", new Object[]{"f", "a", avhx.class, "b", avhy.class, "c", avhu.class, "d"});
        } else if (i2 == 3) {
            return new avhz();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (avhz.class) {
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
