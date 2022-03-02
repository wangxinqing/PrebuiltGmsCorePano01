package defpackage;

/* renamed from: auty  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auty extends aucj implements audy {
    public static final auty h;
    private static volatile auef k;
    public int a;
    public int b = 1;
    public int c = 1;
    public auay d = auay.b;
    public auay e = auay.b;
    public auay f = auay.b;
    public int g;
    private auay i = auay.b;
    private byte j = 2;

    static {
        auty auty = new auty();
        h = auty;
        aucj.a(auty.class, (aucj) auty);
    }

    private auty() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.j = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001Ԍ\u0000\u0002Ԍ\u0001\u0003\n\u0002\u0004\n\u0003\u0005\n\u0004\u0006\n\u0005\u0007\u000b\u0006", new Object[]{"a", "b", auue.a, "c", autv.a, "i", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new auty();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = k;
            if (auef == null) {
                synchronized (auty.class) {
                    auef = k;
                    if (auef == null) {
                        auef = new auce(h);
                        k = auef;
                    }
                }
            }
            return auef;
        }
    }
}
