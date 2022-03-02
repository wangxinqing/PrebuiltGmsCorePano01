package defpackage;

/* renamed from: basu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class basu extends aucj implements audy {
    public static final basu s;
    private static volatile auef v;
    public int a;
    public barg b;
    public long c;
    public String d = "";
    public basv e;
    public basg f;
    public baro g;
    public basr h;
    public baso i;
    public baqn j;
    public bask k;
    public barb l;
    public barw m;
    public String n = "";
    public baqy o;
    public base p;
    public basi q;
    public bast r;
    private basl t;
    private byte u = 2;

    static {
        basu basu = new basu();
        s = basu;
        aucj.a(basu.class, (aucj) basu);
    }

    private basu() {
        auei auei = auei.b;
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.u);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.u = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) s, "\u0001\u0012\u0000\u0001\u0001\u001c\u0012\u0000\u0000\u0005\u0001Љ\u0000\u0002\u0005\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0004\u0006Љ\u0005\b\t\u0007\t\t\b\nЉ\t\f\t\u000b\r\t\f\u000eЉ\r\u0010Љ\u000f\u0011\b\u0010\u0015\t\u0014\u0017\t\u0016\u001b\t\u0012\u001c\t\u0019", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "t", "l", "m", "n", "p", "q", "o", "r"});
        } else if (i3 == 3) {
            return new basu();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) s);
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (basu.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(s);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}
