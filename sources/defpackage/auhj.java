package defpackage;

/* renamed from: auhj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhj extends aucj implements audy {
    public static final auhj f;
    private static volatile auef g;
    public int a;
    public float b;
    public int c;
    public float d;
    public aucs e = aucl.b;

    static {
        auhj auhj = new auhj();
        f = auhj;
        aucj.a(auhj.class, (aucj) auhj);
    }

    private auhj() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0001\u0000\u0002\u0004\u0001\u0003\u0001\u0002\u0004\u0016", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new auhj();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][]) null, (int[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auhj.class) {
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
