package defpackage;

/* renamed from: apgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apgp extends aucj implements audy {
    public static final apgp e;
    private static volatile auef f;
    public int a;
    public int b = 0;
    public Object c;
    public String d = "";

    static {
        apgp apgp = new apgp();
        e = apgp;
        aucj.a(apgp.class, (aucj) apgp);
    }

    private apgp() {
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
            return aucj.a((audx) e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u00025\u0000\u00033\u0000\u0004:\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"c", "b", "a", "d"});
        } else if (i2 == 3) {
            return new apgp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (apgp.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(e);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
