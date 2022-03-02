package defpackage;

/* renamed from: awgn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awgn extends aucj implements audy {
    public static final awgn c;
    private static volatile auef g;
    public int a;
    public int b;
    /* access modifiers changed from: private */
    public int d;
    /* access modifiers changed from: private */
    public int e;
    /* access modifiers changed from: private */
    public int f;

    static {
        awgn awgn = new awgn();
        c = awgn;
        aucj.a(awgn.class, (aucj) awgn);
    }

    private awgn() {
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
            return aucj.a((audx) c, "\u0000\u0005\u0000\u0000\u0003\t\u0005\u0000\u0000\u0000\u0003\u0004\u0004\u0004\u0005\u0004\u0007\f\t\f", new Object[]{"d", "e", "f", "a", "b"});
        } else if (i2 == 3) {
            return new awgn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (awgn.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(c);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
