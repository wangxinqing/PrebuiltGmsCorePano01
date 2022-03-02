package defpackage;

/* renamed from: asux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asux extends aucj implements audy {
    public static final asux c;
    private static volatile auef e;
    public aucx a = auei.b;
    public aucx b = auei.b;
    private byte d = 2;

    static {
        asux asux = new asux();
        c = asux;
        aucj.a(asux.class, (aucj) asux);
    }

    private asux() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"a", asto.class, "b", astz.class});
        } else if (i2 == 3) {
            return new asux();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (asux.class) {
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
