package defpackage;

/* renamed from: aqun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqun extends aucj implements audy {
    public static final aqun c;
    private static volatile auef e;
    public amgi a;
    public long b;
    private byte d = 2;

    static {
        aqun aqun = new aqun();
        c = aqun;
        aucj.a(aqun.class, (aucj) aqun);
    }

    private aqun() {
        auay auay = auay.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.d = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0002\u0003", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqun();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqun.class) {
                    auef = e;
                    if (auef == null) {
                        auef = new auce(c);
                        e = auef;
                    }
                }
            }
            return auef;
        }
    }
}
