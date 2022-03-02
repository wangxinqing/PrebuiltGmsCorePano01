package defpackage;

/* renamed from: gsg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsg extends aucj implements audy {
    public static final gsg b;
    private static volatile auef g;
    public aucx a = auei.b;
    private int c;
    private String d = "";
    private int e;
    private byte f = 2;

    static {
        gsg gsg = new gsg();
        b = gsg;
        aucj.a(gsg.class, (aucj) gsg);
    }

    private gsg() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) b, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0001\u0003\u0003Ԉ\u0000\u0004Л\u0005Ԍ\u0004", new Object[]{"c", "d", "a", gsn.class, "e", gsk.a});
        } else if (i2 == 3) {
            return new gsg();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) b);
            }
            if (i2 == 5) {
                return b;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (gsg.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(b);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
