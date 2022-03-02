package defpackage;

/* renamed from: xnk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xnk extends aucj implements audy {
    public static final xnk p;
    private static volatile auef q;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public boolean e;
    public String f = "";
    public int g;
    public String h = "";
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n = "";
    public String o = "";

    static {
        xnk xnk = new xnk();
        p = xnk;
        aucj.a(xnk.class, (aucj) xnk);
    }

    private xnk() {
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
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\b\u0004\u0006\u0004\u0005\u0007\b\u0006\b\u0007\u0007\t\u0007\b\u000b\u0007\n\f\u0007\u000b\r\u0007\f\u000f\b\u000e\u0010\b\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
        } else if (i3 == 3) {
            return new xnk();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (xnk.class) {
                    auef = q;
                    if (auef == null) {
                        auef = new auce(p);
                        q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
