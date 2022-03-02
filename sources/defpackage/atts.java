package defpackage;

/* renamed from: atts  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atts extends aucj implements audy {
    public static final auct o = new attq();
    public static final atts s;
    private static volatile auef t;
    public int a;
    public double b;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public float h;
    public int i;
    public boolean j;
    public String k = "";
    public int l;
    public int m;
    public aucs n = aucl.b;
    public int p;
    public double q;
    public aucx r = auei.b;

    static {
        atts atts = new atts();
        s = atts;
        aucj.a(atts.class, (aucj) atts);
    }

    private atts() {
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
            return aucj.a((audx) s, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u0000\u0001\u0000\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005\u0007\u0001\u0006\b\u0004\u0007\n\u0007\b\u000b\b\t\f\u0004\n\r\u0004\u000b\u000e\u001e\u000f\u0004\f\u0010\u0000\r\u0011\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", asup.b(), "p", "q", "r"});
        } else if (i3 == 3) {
            return new atts();
        } else {
            if (i3 == 4) {
                return new attr();
            }
            if (i3 == 5) {
                return s;
            }
            auef auef = t;
            if (auef == null) {
                synchronized (atts.class) {
                    auef = t;
                    if (auef == null) {
                        auef = new auce(s);
                        t = auef;
                    }
                }
            }
            return auef;
        }
    }
}
