package defpackage;

/* renamed from: aszr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aszr extends aucj implements audy {
    public static final aszr f;
    private static volatile auef g;
    public int a;
    public avoq b;
    public int c;
    public aucx d = auei.b;
    public String e = "";

    static {
        aszr aszr = new aszr();
        f = aszr;
        aucj.a(aszr.class, (aucj) aszr);
    }

    private aszr() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0000\u0002\t\u0000\u0003\u0004\u0001\u0005\u001b\u0006\b\u0002", new Object[]{"a", "b", "c", "d", aszq.class, "e"});
        } else if (i2 == 3) {
            return new aszr();
        } else {
            if (i2 == 4) {
                return new aucd((boolean[][][]) null, (short[]) null, (byte[]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (aszr.class) {
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
