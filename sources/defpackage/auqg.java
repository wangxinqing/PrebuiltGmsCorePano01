package defpackage;

/* renamed from: auqg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqg extends aucj implements audy {
    public static final auqg g;
    private static volatile auef h;
    public String a = "";
    public String b = "";
    public long c;
    public String d = "";
    public audr e = audr.b;
    public String f = "";

    static {
        auqg auqg = new auqg();
        g = auqg;
        aucj.a(auqg.class, (aucj) auqg);
    }

    private auqg() {
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
            return aucj.a((audx) g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0002\u0004Ȉ\u00052\u0006Ȉ", new Object[]{"a", "b", "c", "d", "e", auqf.a, "f"});
        } else if (i2 == 3) {
            return new auqg();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (boolean[][]) null);
            }
            if (i2 == 5) {
                return g;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auqg.class) {
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
