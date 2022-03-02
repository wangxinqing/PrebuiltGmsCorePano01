package defpackage;

/* renamed from: aqwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwr extends aucj implements audy {
    public static final aqwr c;
    private static volatile auef e;
    public amgi a;
    public aurd b;
    private byte d = 2;

    static {
        aqwr aqwr = new aqwr();
        c = aqwr;
        aucj.a(aqwr.class, (aucj) aqwr);
    }

    private aqwr() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0003\u0005\u0002\u0000\u0000\u0001\u0003Љ\u0005\t", new Object[]{"a", "b"});
        } else if (i2 == 3) {
            return new aqwr();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqwr.class) {
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
