package defpackage;

/* renamed from: aazo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aazo extends aucj implements audy {
    public static final aazo f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public aazn c;
    public long d;
    public long e;
    private byte g = 2;

    static {
        aazo aazo = new aazo();
        f = aazo;
        aucj.a(aazo.class, (aucj) aazo);
    }

    private aazo() {
        auei auei = auei.b;
        auay auay = auay.b;
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\r\u0004\u0000\u0000\u0003\u0001Ԉ\u0000\u0002ԉ\u0002\u0003Ԃ\u0003\r\u0005\n", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new aazo();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (aazo.class) {
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
