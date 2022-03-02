package defpackage;

/* renamed from: assl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class assl extends aucj implements audy {
    public static final assl d;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    public aucx c = auei.b;

    static {
        assl assl = new assl();
        d = assl;
        aucj.a(assl.class, (aucj) assl);
    }

    private assl() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004\u001b", new Object[]{"a", assp.class, "b", asvi.class, "c", asve.class});
        } else if (i2 == 3) {
            return new assl();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (float[]) null);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (assl.class) {
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
