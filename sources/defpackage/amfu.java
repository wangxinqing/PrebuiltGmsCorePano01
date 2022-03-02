package defpackage;

/* renamed from: amfu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amfu extends aucj implements audy {
    public static final amfu b;
    private static volatile auef c;
    public aucx a = auei.b;

    static {
        amfu amfu = new amfu();
        b = amfu;
        aucj.a(amfu.class, (aucj) amfu);
    }

    private amfu() {
        auei auei = auei.b;
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
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"a", amgu.class});
        } else if (i2 == 3) {
            return new amfu();
        } else {
            if (i2 == 4) {
                return new aucd((char[][][]) null);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = c;
            if (auef == null) {
                synchronized (amfu.class) {
                    auef = c;
                    if (auef == null) {
                        auef = new auce(b);
                        c = auef;
                    }
                }
            }
            return auef;
        }
    }
}
