package defpackage;

/* renamed from: ausi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ausi extends aucj implements audy {
    public static final ausi e;
    private static volatile auef g;
    public int a;
    public int b = 1;
    public auay c = auay.b;
    public auay d = auay.b;
    private byte f = 2;

    static {
        ausi ausi = new ausi();
        e = ausi;
        aucj.a(ausi.class, (aucj) ausi);
    }

    private ausi() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԍ\u0000\u0002Ԋ\u0001\u0003Ԋ\u0002", new Object[]{"a", "b", ausg.a, "c", "d"});
        } else if (i2 == 3) {
            return new ausi();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (ausi.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
