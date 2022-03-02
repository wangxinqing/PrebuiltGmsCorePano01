package defpackage;

/* renamed from: atxm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atxm extends aucj implements audy {
    public static final atxm e;
    private static volatile auef g;
    public int a;
    public atwr b;
    public atxk c;
    public int d;
    private byte f = 2;

    static {
        atxm atxm = new atxm();
        e = atxm;
        aucj.a(atxm.class, (aucj) atxm);
    }

    private atxm() {
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
            return aucj.a((audx) e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", "d", atxl.a});
        } else if (i2 == 3) {
            return new atxm();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) e);
            }
            if (i2 == 5) {
                return e;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atxm.class) {
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
