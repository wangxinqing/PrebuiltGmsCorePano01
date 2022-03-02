package defpackage;

/* renamed from: amez  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amez extends aucj implements audy {
    public static final amez l;
    private static volatile auef o;
    public int a;
    public amgl b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    private amgq m;
    private byte n = 2;

    static {
        amez amez = new amez();
        l = amez;
        aucj.a(amez.class, (aucj) amez);
    }

    private amez() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.n);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.n = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) l, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0000\u0001\u0001\t\u0000\u0002\b\u0001\u0003\b\u0003\u0004\b\u0004\u0005\b\u0005\u0006\b\u0007\u0007\b\b\b\b\t\t\b\n\f\b\u0006\u000eЉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "j", "k", "g", "m"});
        } else if (i3 == 3) {
            return new amez();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = o;
            if (auef == null) {
                synchronized (amez.class) {
                    auef = o;
                    if (auef == null) {
                        auef = new auce(l);
                        o = auef;
                    }
                }
            }
            return auef;
        }
    }
}
