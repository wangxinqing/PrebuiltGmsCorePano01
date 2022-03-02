package defpackage;

/* renamed from: atzx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atzx extends aucj implements audy {
    public static final atzx f;
    private static volatile auef g;
    public int a;
    public atyh b;
    public String c = "";
    public atzw d;
    public String e = "";

    static {
        atzx atzx = new atzx();
        f = atzx;
        aucj.a(atzx.class, (aucj) atzx);
    }

    private atzx() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001\t\u0002\u0002\t\u0000\u0003\b\u0001\u0005\b\u0004", new Object[]{"a", "d", "b", "c", "e"});
        } else if (i2 == 3) {
            return new atzx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atzx.class) {
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
