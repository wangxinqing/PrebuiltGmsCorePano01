package defpackage;

/* renamed from: aftc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aftc extends aucj implements audy {
    public static final aftc f;
    private static volatile auef g;
    public int a;
    public int b = 0;
    public Object c;
    public int d;
    public aftb e;

    static {
        aftc aftc = new aftc();
        f = aftc;
        aucj.a(aftc.class, (aucj) aftc);
    }

    private aftc() {
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
            return aucj.a((audx) f, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002\u0004\u0004\u0003\t\u0005\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"c", "b", "a", afte.class, "d", "e", aftd.class, ser.class, afti.class});
        } else if (i2 == 3) {
            return new aftc();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aftc.class) {
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
