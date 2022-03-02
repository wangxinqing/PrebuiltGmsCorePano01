package defpackage;

/* renamed from: ggn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggn extends aucj implements audy {
    public static final ggn d;
    private static volatile auef h;
    public aucx a = auei.b;
    public int b;
    public String c = "";
    private int e;
    private ggp f;
    private byte g = 2;

    static {
        ggn ggn = new ggn();
        d = ggn;
        aucj.a(ggn.class, (aucj) ggn);
    }

    private ggn() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.g = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) d, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ԉ\u0000\u0002Л\u0003\f\u0001\u0004\b\u0002", new Object[]{"e", "f", "a", ggt.class, "b", ggl.a, "c"});
        } else if (i2 == 3) {
            return new ggn();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (ggn.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(d);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
