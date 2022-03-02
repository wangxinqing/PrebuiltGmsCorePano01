package defpackage;

/* renamed from: aqwj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqwj extends aucj implements audy {
    public static final aqwj c;
    private static volatile auef e;
    public aucx a = auei.b;
    public audr b = audr.b;
    private byte d = 2;

    static {
        aqwj aqwj = new aqwj();
        c = aqwj;
        aucj.a(aqwj.class, (aucj) aqwj);
    }

    private aqwj() {
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
            return aucj.a((audx) c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0001\u0001\u0001\u001b\u0002в", new Object[]{"a", aqwh.class, "b", aqwi.a});
        } else if (i2 == 3) {
            return new aqwj();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = e;
            if (auef == null) {
                synchronized (aqwj.class) {
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
