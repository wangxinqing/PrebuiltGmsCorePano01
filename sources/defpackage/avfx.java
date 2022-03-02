package defpackage;

/* renamed from: avfx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avfx extends aucj implements audy {
    public static final avfx g;
    private static volatile auef h;
    public int a;
    public int b;
    public String c = "";
    public auay d = auay.b;
    public int e;
    public int f;

    static {
        avfx avfx = new avfx();
        g = avfx;
        aucj.a(avfx.class, (aucj) avfx);
    }

    private avfx() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002\u0005\u0004\u0004\u0006\u0004\u0005", new Object[]{"a", "b", avfw.a, "c", "d", "e", "f"});
        } else if (i2 == 3) {
            return new avfx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) g);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (avfx.class) {
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
