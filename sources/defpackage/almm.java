package defpackage;

/* renamed from: almm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almm extends aucj implements audy {
    public static final almm f;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public int d;
    public alnh e;
    private String g = "";
    private byte h = 2;

    static {
        almm almm = new almm();
        f = almm;
        aucj.a(almm.class, (aucj) almm);
    }

    private almm() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.h);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.h = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\f\u0003\u0005\t\u0004", new Object[]{"a", "g", "b", "c", "d", aqkx.b(), "e"});
        } else if (i3 == 3) {
            return new almm();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (almm.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(f);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
