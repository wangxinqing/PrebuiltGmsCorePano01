package defpackage;

/* renamed from: aqmr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqmr extends aucj implements audy {
    public static final aqmr k;
    private static volatile auef l;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = -1;
    public int j = -1;

    static {
        aqmr aqmr = new aqmr();
        k = aqmr;
        aucj.a(aqmr.class, (aucj) aqmr);
    }

    private aqmr() {
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
            return aucj.a((audx) k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\u0004\u0004\b\u0004\u0007\t\u0004\b\n\u0004\t\u000b\u0004\n", new Object[]{"a", "b", aqmq.a, "c", "d", "e", "f", "g", "h", "i", "j"});
        } else if (i3 == 3) {
            return new aqmr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) k);
            }
            if (i3 == 5) {
                return k;
            }
            auef auef = l;
            if (auef == null) {
                synchronized (aqmr.class) {
                    auef = l;
                    if (auef == null) {
                        auef = new auce(k);
                        l = auef;
                    }
                }
            }
            return auef;
        }
    }
}
