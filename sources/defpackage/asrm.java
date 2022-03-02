package defpackage;

/* renamed from: asrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrm extends aucj implements audy {
    public static final asrm c;
    private static volatile auef e;
    public aucx a = auei.b;
    public long b;
    private int d;

    static {
        asrm asrm = new asrm();
        c = asrm;
        aucj.a(asrm.class, (aucj) asrm);
    }

    private asrm() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0005\u0000\u0002\u001b", new Object[]{"d", "b", "a", asuf.class});
        } else if (i2 == 3) {
            return new asrm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asrm.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
