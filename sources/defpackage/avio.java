package defpackage;

/* renamed from: avio  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avio extends aucj implements audy {
    public static final avio b;
    private static volatile auef d;
    public aucx a = auei.b;
    private byte c = 2;

    static {
        avio avio = new avio();
        b = avio;
        aucj.a(avio.class, (aucj) avio);
    }

    private avio() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.c = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"a", avim.class});
        } else if (i2 == 3) {
            return new avio();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = d;
            if (auef == null) {
                synchronized (avio.class) {
                    auef = d;
                    if (auef == null) {
                        auef = new auce(b);
                        d = auef;
                    }
                }
            }
            return auef;
        }
    }
}
