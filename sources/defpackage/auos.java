package defpackage;

/* renamed from: auos  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auos extends aucj implements audy {
    public static final auos n;
    private static volatile auef p;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public int g;
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";
    public String m = "";
    private byte o = 2;

    static {
        auos auos = new auos();
        n = auos;
        aucj.a(auos.class, (aucj) auos);
    }

    private auos() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.o);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.o = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0005\u0001Ԉ\u0000\u0002Ԉ\u0001\u0003Ԉ\u0002\u0004Ԉ\u0003\u0005Ԉ\u0004\u0006\u0004\u0005\u0007\b\u0006\b\b\u0007\t\b\b\n\b\t\u000b\b\n\f\b\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        } else if (i3 == 3) {
            return new auos();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) n);
            }
            if (i3 == 5) {
                return n;
            }
            auef auef = p;
            if (auef == null) {
                synchronized (auos.class) {
                    auef = p;
                    if (auef == null) {
                        auef = new auce(n);
                        p = auef;
                    }
                }
            }
            return auef;
        }
    }
}
