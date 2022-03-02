package defpackage;

/* renamed from: haj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class haj extends aucj implements audy {
    public static final haj g;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public aucx e = auei.b;
    public String f = "";
    private byte h = 2;

    static {
        haj haj = new haj();
        g = haj;
        aucj.a(haj.class, (aucj) haj);
    }

    private haj() {
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
            return aucj.a((audx) g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0001\u0002\u0001Ԉ\u0000\u0002\b\u0001\u0003\b\u0002\u0005б\b\b\u0004", new Object[]{"a", "b", "c", "d", "e", hai.class, "f"});
        } else if (i3 == 3) {
            return new haj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) g);
            }
            if (i3 == 5) {
                return g;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (haj.class) {
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
