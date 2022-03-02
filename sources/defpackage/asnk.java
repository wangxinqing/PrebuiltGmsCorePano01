package defpackage;

/* renamed from: asnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asnk extends aucj implements audy {
    public static final asnk g;
    private static volatile auef h;
    public int a;
    public long b;
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public auay f = auay.b;

    static {
        asnk asnk = new asnk();
        g = asnk;
        aucj.a(asnk.class, (aucj) asnk);
    }

    private asnk() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001b\u0006\n\u0004", new Object[]{"a", "b", "c", "d", "e", asni.class, "f"});
        } else if (i2 == 3) {
            return new asnk();
        } else {
            if (i2 == 4) {
                return new aucd((int[][]) null, (short[][][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (asnk.class) {
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
