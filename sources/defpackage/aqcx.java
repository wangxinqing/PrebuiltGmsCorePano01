package defpackage;

/* renamed from: aqcx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqcx extends aucj implements audy {
    public static final aqcx f;
    private static volatile auef h;
    public int a;
    public aqcv b;
    public aoiq c;
    public auay d = auay.b;
    public aucx e = auei.b;
    private byte g = 2;

    static {
        aqcx aqcx = new aqcx();
        f = aqcx;
        aucj.a(aqcx.class, (aucj) aqcx);
    }

    private aqcx() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0002\t\u0004\u0000\u0001\u0001\u0002\t\u0000\u0003Љ\u0001\b\n\u0003\t\u001b", new Object[]{"a", "b", "c", "d", "e", aqdb.class});
        } else if (i2 == 3) {
            return new aqcx();
        } else {
            if (i2 == 4) {
                return new aucd((short[][][]) null, (short[][]) null);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aqcx.class) {
                    auef = h;
                    if (auef == null) {
                        auef = new auce(f);
                        h = auef;
                    }
                }
            }
            return auef;
        }
    }
}
