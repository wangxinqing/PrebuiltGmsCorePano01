package defpackage;

/* renamed from: askk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class askk extends aucj implements audy {
    public static final askk f;
    private static volatile auef g;
    public int a;
    public long b;
    public aucs c = aucl.b;
    public aucx d = auei.b;
    public aucx e = auei.b;

    static {
        askk askk = new askk();
        f = askk;
        aucj.a(askk.class, (aucj) askk);
    }

    private askk() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u0002\u0000\u0002\u001e\u0003\u001b\u0004\u001b", new Object[]{"a", "b", "c", asoe.b(), "d", askj.class, "e", aski.class});
        } else if (i2 == 3) {
            return new askk();
        } else {
            if (i2 == 4) {
                return new aucd((float[][][]) null, (char[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (askk.class) {
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
