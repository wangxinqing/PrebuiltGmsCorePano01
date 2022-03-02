package defpackage;

/* renamed from: awfw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awfw extends aucj implements audy {
    public static final awfw e;
    private static volatile auef f;
    public String a = "";
    public int b;
    public auay c = auay.b;
    public int d;

    static {
        awfw awfw = new awfw();
        e = awfw;
        aucj.a(awfw.class, (aucj) awfw);
    }

    private awfw() {
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
            return aucj.a((audx) e, "\u0000\u0004\u0000\u0000\u0001\f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0005\f\f\n", new Object[]{"a", "b", "d", "c"});
        } else if (i2 == 3) {
            return new awfw();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (awfw.class) {
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
