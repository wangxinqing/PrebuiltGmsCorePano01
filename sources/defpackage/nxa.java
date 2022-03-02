package defpackage;

/* renamed from: nxa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nxa extends aucj implements audy {
    public static final nxa g;
    private static volatile auef h;
    public int a;
    public aubn b;
    public long c;
    public nxd d;
    public aucx e = auei.b;
    public nwu f;

    static {
        nxa nxa = new nxa();
        g = nxa;
        aucj.a(nxa.class, (aucj) nxa);
    }

    private nxa() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\t\u0000\u0002\u0002\u0001\u0003\t\u0002\u0004\u001b\u0005\t\u0003", new Object[]{"a", "b", "c", "d", "e", nxl.class, "f"});
        } else if (i2 == 3) {
            return new nxa();
        } else {
            if (i2 == 4) {
                return new aucd((int[]) null, (boolean[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (nxa.class) {
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
