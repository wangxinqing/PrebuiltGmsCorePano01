package defpackage;

/* renamed from: avrs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avrs extends aucg implements audy {
    public static final avrs f;
    private static volatile auef h;
    public int a;
    public long b = -1;
    public avsf c;
    public avrw d;
    public aucx e = auei.b;
    private byte g = 2;

    static {
        avrs avrs = new avrs();
        f = avrs;
        aucj.a(avrs.class, (aucj) avrs);
    }

    private avrs() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u0002\u0000\u0003\t\u0002\u0004\t\u0003\u0005\u001b", new Object[]{"a", "b", "c", "d", "e", avrv.class});
        } else if (i2 == 3) {
            return new avrs();
        } else {
            if (i2 == 4) {
                return new aucf(f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avrs.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
