package defpackage;

/* renamed from: basn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class basn extends aucj implements audy {
    public static final basn e;
    private static volatile auef f;
    public int a;
    public String b = "";
    public aucv c = audl.b;
    public long d;

    static {
        basn basn = new basn();
        e = basn;
        aucj.a(basn.class, (aucj) basn);
    }

    private basn() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003(", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new basn();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (basn.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
