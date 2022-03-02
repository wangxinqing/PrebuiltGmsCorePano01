package defpackage;

/* renamed from: aqlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqlv extends aucj implements audy {
    public static final aqlv h;
    private static volatile auef i;
    public int a;
    public aucs b = aucl.b;
    public aucs c = aucl.b;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;

    static {
        aqlv aqlv = new aqlv();
        h = aqlv;
        aucj.a(aqlv.class, (aucj) aqlv);
    }

    private aqlv() {
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
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\f\u0000\u0003\u0007\u0001\u0004\u0007\u0002\u0005\u0007\u0003\u0006\u0016", new Object[]{"a", "c", "d", aqme.a, "e", "f", "g", "b"});
        } else if (i3 == 3) {
            return new aqlv();
        } else {
            if (i3 == 4) {
                return new aqlu();
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (aqlv.class) {
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
