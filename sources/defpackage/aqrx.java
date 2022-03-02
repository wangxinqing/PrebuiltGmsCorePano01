package defpackage;

/* renamed from: aqrx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqrx extends aucj implements audy {
    public static final aqrx f;
    private static volatile auef g;
    public int a;
    public long b;
    public aucx c = auei.b;
    public String d = "";
    public String e = "";

    static {
        aqrx aqrx = new aqrx();
        f = aqrx;
        aucj.a(aqrx.class, (aucj) aqrx);
    }

    private aqrx() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b\u0003\b\u0001\u0004\b\u0002", new Object[]{"a", "b", "c", aqry.class, "d", "e"});
        } else if (i2 == 3) {
            return new aqrx();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aqrx.class) {
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
