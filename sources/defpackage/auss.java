package defpackage;

/* renamed from: auss  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auss extends aucj implements audy {
    public static final auss d;
    private static volatile auef f;
    public int a;
    public int b;
    public int c;
    private byte e = 2;

    static {
        auss auss = new auss();
        d = auss;
        aucj.a(auss.class, (aucj) auss);
    }

    private auss() {
    }

    public static /* synthetic */ void a(auss auss) {
        auss.a |= 2;
        auss.c = 1;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\u0004\u0001", new Object[]{"a", "b", aust.a, "c"});
        } else if (i2 == 3) {
            return new auss();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auss.class) {
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
