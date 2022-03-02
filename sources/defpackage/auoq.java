package defpackage;

/* renamed from: auoq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auoq extends aucj implements audy {
    public static final auoq f;
    private static volatile auef h;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    private byte g = 2;

    static {
        auoq auoq = new auoq();
        f = auoq;
        aucj.a(auoq.class, (aucj) auoq);
    }

    private auoq() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\b\u0000\u0002Ԉ\u0001\u0003Ԉ\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i2 == 3) {
            return new auoq();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) f);
            }
            if (i2 == 5) {
                return f;
            }
            auef auef = h;
            if (auef == null) {
                synchronized (auoq.class) {
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
