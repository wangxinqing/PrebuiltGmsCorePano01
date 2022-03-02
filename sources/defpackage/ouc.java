package defpackage;

/* renamed from: ouc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ouc extends aucj implements audy {
    public static final ouc g;
    private static volatile auef h;
    public int a;
    public int b;
    public aucx c = auei.b;
    public aucx d = auei.b;
    public double e = 1.0d;
    public int f;

    static {
        ouc ouc = new ouc();
        g = ouc;
        aucj.a(ouc.class, (aucj) ouc);
    }

    private ouc() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001\u0004\u0000\u0002\u001b\u0004\u001b\u0005\u0000\u0001\u0006\u0004\u0002", new Object[]{"a", "b", "c", ouj.class, "d", ovb.class, "e", "f"});
        } else if (i2 == 3) {
            return new ouc();
        } else {
            if (i2 == 4) {
                return new aucd((int[][][]) null, (char[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (ouc.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(g);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.c.a()) {
            this.c = aucj.a(this.c);
        }
    }
}
