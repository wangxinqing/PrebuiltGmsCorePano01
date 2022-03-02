package defpackage;

/* renamed from: atip  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atip extends aucj implements audy {
    public static final atip c;
    private static volatile auef g;
    public int a;
    public String b = "";
    private int d;
    private auju e;
    private byte f = 2;

    static {
        atip atip = new atip();
        c = atip;
        aucj.a(atip.class, (aucj) atip);
    }

    private atip() {
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
            return aucj.a((audx) c, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001\u0004\u0000\u0003\b\u0002\u0004Љ\u0004", new Object[]{"d", "a", "b", "e"});
        } else if (i2 == 3) {
            return new atip();
        } else {
            if (i2 == 4) {
                return new aucd((aucj) c);
            }
            if (i2 == 5) {
                return c;
            }
            auef auef = g;
            if (auef == null) {
                synchronized (atip.class) {
                    auef = g;
                    if (auef == null) {
                        auef = new auce(c);
                        g = auef;
                    }
                }
            }
            return auef;
        }
    }
}
