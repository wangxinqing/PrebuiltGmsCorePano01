package defpackage;

/* renamed from: auhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auhy extends aucj implements audy {
    public static final auhy d;
    private static volatile auef f;
    public int a;
    public String b = "";
    public aucx c = auei.b;
    private int e;

    static {
        auhy auhy = new auhy();
        d = auhy;
        aucj.a(auhy.class, (aucj) auhy);
    }

    private auhy() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", auhx.class});
        } else if (i2 == 3) {
            return new auhy();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (auhy.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(d);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
