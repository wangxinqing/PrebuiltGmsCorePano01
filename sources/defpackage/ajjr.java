package defpackage;

/* renamed from: ajjr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajjr extends aucj implements audy {
    public static final ajjr g;
    private static volatile auef i;
    public int a;
    public ajjx b;
    public ajcd c;
    public atco d;
    public atde e;
    public atdp f;
    private byte h = 2;

    static {
        ajjr ajjr = new ajjr();
        g = ajjr;
        aucj.a(ajjr.class, (aucj) ajjr);
    }

    private ajjr() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
        } else if (i3 == 3) {
            return new ajjr();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ajjr.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(g);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
