package defpackage;

/* renamed from: asrl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asrl extends aucj implements audy {
    public static final asrl e;
    private static volatile auef f;
    public int a;
    public asuu b;
    public aucx c = auei.b;
    public int d;

    static {
        asrl asrl = new asrl();
        e = asrl;
        aucj.a(asrl.class, (aucj) asrl);
    }

    private asrl() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\t\u0000\u0002\u001b\u0003\u0004\u0001", new Object[]{"a", "b", "c", asrk.class, "d"});
        } else if (i2 == 3) {
            return new asrl();
        } else {
            if (i2 == 4) {
                return new aucd((float[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (asrl.class) {
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
