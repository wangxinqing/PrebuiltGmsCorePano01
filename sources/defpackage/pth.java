package defpackage;

/* renamed from: pth  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pth extends aucj implements audy {
    public static final pth f;
    public static final auci g;
    private static volatile auef i;
    public int a;
    public avqi b;
    public ptk c;
    public avrb d;
    public auay e = auay.b;
    private byte h = 2;

    static {
        pth pth = new pth();
        f = pth;
        aucj.a(pth.class, (aucj) pth);
        aujv aujv = aujv.a;
        pth pth2 = f;
        g = aucj.a((audx) aujv, (Object) pth2, (audx) pth2, 220671791, aufw.MESSAGE);
    }

    private pth() {
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
            return aucj.a((audx) f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\t\u0000\u0002\t\u0001\u0003Љ\u0002\u0004\n\u0003", new Object[]{"a", "b", "c", "d", "e"});
        } else if (i3 == 3) {
            return new pth();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) f);
            }
            if (i3 == 5) {
                return f;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (pth.class) {
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
