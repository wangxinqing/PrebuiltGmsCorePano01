package defpackage;

/* renamed from: jos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jos extends aucj implements audy {
    public static final jos d;
    private static volatile auef f;
    public String a = "";
    public aucx b = auei.b;
    public aucx c = auei.b;
    private int e;

    static {
        jos jos = new jos();
        d = jos;
        aucj.a(jos.class, (aucj) jos);
    }

    private jos() {
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
            return aucj.a((audx) d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\b\u0000\u0002\u001b\u0003\u001c", new Object[]{"e", "a", "b", jov.class, "c"});
        } else if (i2 == 3) {
            return new jos();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (jos.class) {
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
