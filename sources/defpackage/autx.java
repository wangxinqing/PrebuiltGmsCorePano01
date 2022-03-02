package defpackage;

/* renamed from: autx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class autx extends aucj implements audy {
    public static final autx f;
    private static volatile auef h;
    public int a;
    public int b = 1;
    public autu c;
    public auug d;
    public autt e;
    private byte g = 2;

    static {
        autx autx = new autx();
        f = autx;
        aucj.a(autx.class, (aucj) autx);
    }

    private autx() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Ԍ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", auub.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new autx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (autx.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
