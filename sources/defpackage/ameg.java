package defpackage;

/* renamed from: ameg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ameg extends aucj implements audy {
    public static final ameg h;
    private static volatile auef i;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;

    static {
        ameg ameg = new ameg();
        h = ameg;
        aucj.a(ameg.class, (aucj) ameg);
    }

    private ameg() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 1) {
            return null;
        }
        if (i3 == 2) {
            return aucj.a((audx) h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0002\u0003\b\u0003\u0004\b\u0004\u0005\f\u0005\u0006\b\u0001", new Object[]{"a", "b", "d", "e", "f", "g", amee.a, "c"});
        } else if (i3 == 3) {
            return new ameg();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) h);
            }
            if (i3 == 5) {
                return h;
            }
            auef auef = i;
            if (auef == null) {
                synchronized (ameg.class) {
                    auef = i;
                    if (auef == null) {
                        auef = new auce(h);
                        i = auef;
                    }
                }
            }
            return auef;
        }
    }
}
