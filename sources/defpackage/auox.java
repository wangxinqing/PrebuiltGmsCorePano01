package defpackage;

/* renamed from: auox  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auox extends aucj implements audy {
    public static final auox e;
    private static volatile auef g;
    public int a;
    public String b = "";
    public String c = "";
    public auov d;
    private byte f = 2;

    static {
        auox auox = new auox();
        e = auox;
        aucj.a(auox.class, (aucj) auox);
    }

    private auox() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        byte b2 = 0;
        if (i2 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.f = b2;
            return null;
        } else if (i2 == 2) {
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԉ\u0000\u0002Ԉ\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
        } else if (i2 == 3) {
            return new auox();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (auox.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(e);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
