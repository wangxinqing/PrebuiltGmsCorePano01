package defpackage;

/* renamed from: hai  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hai extends aucj implements audy {
    public static final hai d;
    private static volatile auef f;
    public int a;
    public String b = "";
    public String c = "";
    private byte e = 2;

    static {
        hai hai = new hai();
        d = hai;
        aucj.a(hai.class, (aucj) hai);
    }

    private hai() {
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
            return aucj.a((audx) d, "\u0001\u0002\u0000\u0001\u0006\u0007\u0002\u0000\u0000\u0001\u0006Ԉ\u0000\u0007\b\u0001", new Object[]{"a", "b", "c"});
        } else if (i2 == 3) {
            return new hai();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) d);
            }
            if (i2 == 5) {
                return d;
            }
            auef auef = f;
            if (auef == null) {
                synchronized (hai.class) {
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
