package defpackage;

/* renamed from: avlp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avlp extends aucj implements audy {
    public static final avlp a;
    private static volatile auef f;
    private int b;
    private String c = "";
    private String d = "";
    private byte e = 2;

    static {
        avlp avlp = new avlp();
        a = avlp;
        aucj.a(avlp.class, (aucj) avlp);
    }

    private avlp() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.e = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԉ\u0000\u0002Ԉ\u0001", new Object[]{"b", "c", "d"});
        } else if (i2 == 3) {
            return new avlp();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) a);
            }
            if (i2 == 5) {
                return a;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (avlp.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(a);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
