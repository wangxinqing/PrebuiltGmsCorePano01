package defpackage;

/* renamed from: amao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amao extends aucj implements audy {
    public static final amao g;
    private static volatile auef h;
    public int a;
    public int b;
    public int c;
    public aucs d = aucl.b;
    public int e;
    public int f;

    static {
        amao amao = new amao();
        g = amao;
        aucj.a(amao.class, (aucj) amao);
    }

    private amao() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0000\u0002\u000b\u0001\u0003\u001e\u0004\f\u0002\u0005\u000b\u0003", new Object[]{"a", "b", amae.a, "c", "d", alzy.b(), "e", amad.a, "f"});
        } else if (i2 == 3) {
            return new amao();
        } else {
            if (i2 == 4) {
                return new aucd((byte[][][]) null, (byte[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (amao.class) {
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
}
