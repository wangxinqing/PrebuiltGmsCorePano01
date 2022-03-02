package defpackage;

/* renamed from: aruv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aruv extends aucj implements audy {
    public static final aruv f;
    private static volatile auef g;
    public int a;
    public double b;
    public aucs c = aucl.b;
    public aucs d = aucl.b;
    public aucs e = aucl.b;

    static {
        aruv aruv = new aruv();
        f = aruv;
        aucj.a(aruv.class, (aucj) aruv);
    }

    private aruv() {
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
            return aucj.a((audx) f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0004\u0002\u0000\u0003/\u0004/\u0005/", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aruv();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (char[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aruv.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(f);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
