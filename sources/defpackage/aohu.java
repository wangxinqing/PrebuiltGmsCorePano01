package defpackage;

/* renamed from: aohu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aohu extends aucj implements audy {
    public static final aohu h;
    private static volatile auef i;
    public int a;
    public int b;
    public long c;
    public long d;
    public aucs e = aucl.b;
    public aucs f = aucl.b;
    public aucs g = aucl.b;

    static {
        aohu aohu = new aohu();
        h = aohu;
        aucj.a(aohu.class, (aucj) aohu);
    }

    private aohu() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u0004\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004)\u0005'\u0006'", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
        } else if (i3 == 3) {
            return new aohu();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aohu.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
