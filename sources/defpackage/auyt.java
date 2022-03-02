package defpackage;

/* renamed from: auyt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auyt extends aucg implements audy {
    public static final auyt p;
    private static volatile auef r;
    public int a;
    public String b = "";
    public auyu c;
    public auyy d;
    public auyp e;
    public auyi f;
    public auyo g;
    public auyn h;
    public auyz i;
    public auyx j;
    public auyq k;
    public auyk l;
    public auys n;
    public auyw o;
    private byte q = 2;

    static {
        auyt auyt = new auyt();
        p = auyt;
        aucj.a(auyt.class, (aucj) auyt);
    }

    private auyt() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.q);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.q = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) p, "\u0001\r\u0000\u0001\u0003\u0011\r\u0000\u0000\u0006\u0003\b\u0000\u0004Љ\u0001\u0005Љ\u0002\u0006Љ\u0003\u0007\t\u0004\bЉ\u0005\tЉ\u0006\u000b\t\u0007\r\t\b\u000eЉ\t\u000f\t\n\u0010\t\u000b\u0011\t\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", "o"});
        } else if (i3 == 3) {
            return new auyt();
        } else {
            if (i3 == 4) {
                return new aucf(p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (auyt.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(p);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
