package defpackage;

/* renamed from: aspu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aspu extends aucj implements audy {
    public static final aspu d;
    private static volatile auef e;
    public String a = "";
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        aspu aspu = new aspu();
        d = aspu;
        aucj.a(aspu.class, (aucj) aspu);
    }

    private aspu() {
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
            return aucj.a((audx) d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new aspu();
        } else {
            if (i2 == 4) {
                return new aspt();
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aspu.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(d);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
