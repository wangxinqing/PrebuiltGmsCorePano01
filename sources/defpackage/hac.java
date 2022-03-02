package defpackage;

/* renamed from: hac  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hac extends aucj implements audy {
    public static final hac r;
    private static volatile auef s;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public long h;
    public int i;
    public int j;
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public boolean o;
    public aucx p = auei.b;
    public String q;

    static {
        hac hac = new hac();
        r = hac;
        aucj.a(hac.class, (aucj) hac);
    }

    private hac() {
        auay auay = auay.b;
        this.q = "";
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
            return aucj.a((audx) r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0003\u0003\b\u0004\u0004\b\u0001\u0005\b\u0002\u0006\b\u0005\u0007\u0002\u0006\b\u0004\u0007\t\b\t\n\u0004\b\u000b\b\n\f\b\u000b\r\b\f\u000e\u0007\r\u000f\u001b\u0013\b\u0010", new Object[]{"a", "b", "e", "f", "c", "d", "g", "h", "i", "k", "j", "l", "m", "n", "o", "p", hao.class, "q"});
        } else if (i3 == 3) {
            return new hac();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) r);
            }
            if (i3 == 5) {
                return r;
            }
            auef auef = s;
            if (auef == null) {
                synchronized (hac.class) {
                    auef = s;
                    if (auef == null) {
                        auef = new auce(r);
                        s = auef;
                    }
                }
            }
            return auef;
        }
    }
}
