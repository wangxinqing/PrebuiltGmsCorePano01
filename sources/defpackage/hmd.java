package defpackage;

/* renamed from: hmd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hmd extends aucj implements audy {
    public static final hmd d;
    private static volatile auef f;
    public int a;
    public hmm b;
    public hmn c;
    private int e;

    static {
        hmd hmd = new hmd();
        d = hmd;
        aucj.a(hmd.class, (aucj) hmd);
    }

    private hmd() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\t\u0002", new Object[]{"e", "a", hmb.a, "b", "c"});
        } else if (i2 == 3) {
            return new hmd();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (hmd.class) {
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
