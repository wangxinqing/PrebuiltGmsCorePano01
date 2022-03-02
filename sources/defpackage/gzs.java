package defpackage;

/* renamed from: gzs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gzs extends aucj implements audy {
    public static final gzs l;
    private static volatile auef n;
    public int a;
    public boolean b;
    public long c;
    public aucx d = auei.b;
    public boolean e;
    public aucx f = auei.b;
    public aucx g = auei.b;
    public long h;
    public String i = "";
    public String j = "";
    public aucx k = auei.b;
    private byte m = 2;

    static {
        gzs gzs = new gzs();
        l = gzs;
        aucj.a(gzs.class, (aucj) gzs);
    }

    private gzs() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.m);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.m = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) l, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0004\u0003\u0001ԇ\u0000\u0002Л\u0003\u0002\u0001\u0005Л\b\u0005\u0006\t\u0007\u0003\n\u001a\u000b\b\u0007\f\b\b\r\u001a", new Object[]{"a", "b", "d", haj.class, "c", "g", gzu.class, "h", "e", "f", "i", "j", "k"});
        } else if (i3 == 3) {
            return new gzs();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) l);
            }
            if (i3 == 5) {
                return l;
            }
            auef auef = n;
            if (auef == null) {
                synchronized (gzs.class) {
                    auef = n;
                    if (auef == null) {
                        auef = new auce(l);
                        n = auef;
                    }
                }
            }
            return auef;
        }
    }
}
