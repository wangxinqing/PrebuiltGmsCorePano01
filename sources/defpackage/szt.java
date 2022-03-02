package defpackage;

/* renamed from: szt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class szt extends aucj implements audy {
    public static final szt f;
    private static volatile auef g;
    public int a;
    public int b;
    public String c = "";
    public boolean d;
    public aucx e = auei.b;

    static {
        szt szt = new szt();
        f = szt;
        aucj.a(szt.class, (aucj) szt);
    }

    private szt() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\u001a", new Object[]{"a", "b", szr.a, "c", "d", "e"});
        } else if (i2 == 3) {
            return new szt();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (szt.class) {
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
