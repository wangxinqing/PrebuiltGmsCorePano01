package defpackage;

/* renamed from: old  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class old extends aucj implements audy {
    public static final old g;
    private static volatile auef h;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";
    public aufd e;
    public aufd f;

    static {
        old old = new old();
        g = old;
        aucj.a(old.class, (aucj) old);
    }

    private old() {
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
            return aucj.a((audx) g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\b\u0000\u0002\t\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006\t\u0006\u0007<\u0000", new Object[]{"c", "b", "a", "d", "e", ola.class, okq.class, okt.class, "f", olc.class});
        } else if (i2 == 3) {
            return new old();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (old.class) {
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
