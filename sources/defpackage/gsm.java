package defpackage;

/* renamed from: gsm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gsm extends aucj implements audy {
    public static final gsm c;
    private static volatile auef f;
    public int a;
    public aucx b = auei.b;
    private int d;
    private byte e = 2;

    static {
        gsm gsm = new gsm();
        c = gsm;
        aucj.a(gsm.class, (aucj) gsm);
    }

    private gsm() {
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
            return aucj.a((audx) c, "\u0001\u0002\u0000\u0001\u0002\u000b\u0002\u0000\u0001\u0002\u0002б\u000bԌ\u0001", new Object[]{"d", "b", gsg.class, "a", gsk.a});
        } else if (i2 == 3) {
            return new gsm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (gsm.class) {
                    auef = f;
                    if (auef == null) {
                        auef = new auce(c);
                        f = auef;
                    }
                }
            }
            return auef;
        }
    }
}
