package defpackage;

/* renamed from: bcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bcl extends aucj implements audy {
    public static final bcl d;
    private static volatile auef f;
    public long a;
    public int b;
    public long c;
    private int e;

    static {
        bcl bcl = new bcl();
        d = bcl;
        aucj.a(bcl.class, (aucj) bcl);
    }

    private bcl() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0002\f\u0001\u0003\u0002\u0002", new Object[]{"e", "a", "b", bcj.a, "c"});
        } else if (i2 == 3) {
            return new bcl();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (bcl.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
