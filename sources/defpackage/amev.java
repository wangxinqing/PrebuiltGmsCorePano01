package defpackage;

/* renamed from: amev  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amev extends aucj implements audy {
    public static final amev t;
    private static volatile auef u;
    public int a;
    public int b;
    public amei c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public boolean k;
    public boolean l = true;
    public boolean m = true;
    public boolean n;
    public ameq o;
    public boolean p = true;
    public String q = "";
    public aucx r = auei.b;
    public ameg s;

    static {
        amev amev = new amev();
        t = amev;
        aucj.a(amev.class, (aucj) amev);
    }

    private amev() {
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
            return aucj.a((audx) t, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0001\u0000\u0001\u0004\u0000\u0002\t\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\u0007\t\u000b\u0007\n\f\u0007\u000b\r\u0007\f\u000e\t\r\u000f\u0007\u000e\u0010\b\u000f\u0011\u001b\u0012\t\u0010", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", ameu.class, "s"});
        } else if (i3 == 3) {
            return new amev();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) t);
            }
            if (i3 == 5) {
                return t;
            }
            auef auef = u;
            if (auef == null) {
                synchronized (amev.class) {
                    auef = u;
                    if (auef == null) {
                        auef = new auce(t);
                        u = auef;
                    }
                }
            }
            return auef;
        }
    }
}
