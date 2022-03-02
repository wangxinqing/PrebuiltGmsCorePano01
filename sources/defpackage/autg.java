package defpackage;

/* renamed from: autg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class autg extends aucj implements audy {
    public static final autg f;
    private static volatile auef g;
    public int a;
    public int b;
    public auay c = auay.b;
    public aucx d = auei.b;
    public String e = "";

    static {
        autg autg = new autg();
        f = autg;
        aucj.a(autg.class, (aucj) autg);
    }

    private autg() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\u001b\u0004\b\u0002", new Object[]{"a", "b", "c", "d", autf.class, "e"});
        } else if (i2 == 3) {
            return new autg();
        } else {
            if (i2 == 4) {
                return new aucd((short[][]) null, (char[][][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (autg.class) {
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
