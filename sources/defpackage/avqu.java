package defpackage;

/* renamed from: avqu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avqu extends aucj implements audy {
    public static final avqu j;
    private static volatile auef k;
    public int a;
    public int b;
    public auay c = auay.b;
    public int d;
    public long e;
    public long f;
    public avqx g;
    public avqy h;
    public aucx i = auei.b;

    static {
        avqu avqu = new avqu();
        j = avqu;
        aucj.a(avqu.class, (aucj) avqu);
    }

    private avqu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\f\u0000\u0002\n\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\t\u0005\u0007\t\u0006\b\u001b", new Object[]{"a", "b", avqw.a, "c", "d", "e", "f", "g", "h", "i", avqv.class});
        } else if (i3 == 3) {
            return new avqu();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (boolean[][]) null);
            }
            if (i3 == 5) {
                return j;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (avqu.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(j);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
