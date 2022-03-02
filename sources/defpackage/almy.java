package defpackage;

/* renamed from: almy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class almy extends aucj implements audy {
    public static final almy t;
    private static volatile auef w;
    public String a = "";
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public boolean g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public String p;
    public String q;
    public String r;
    public aucx s;
    private int u;
    private int v;

    static {
        almy almy = new almy();
        t = almy;
        aucj.a(almy.class, (aucj) almy);
    }

    private almy() {
        auei auei = auei.b;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = "";
        this.m = "";
        this.n = "";
        this.p = "";
        this.q = "";
        this.r = "";
        this.s = auei.b;
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
            return aucj.a((audx) t, "\u0001\u0013\u0000\u0002\u0002-\u0013\u0000\u0001\u0000\u0002\b\u0001\u0003\b\u0002\u000b\b\n\u0011\b\u0010\u0013\b\u0012\u0014\b\u0013\u0019\u0007\u0016\u001c\b\u0018!\b\u001d\"\b\u001e#\u0002\u001f$\b &\b\"'\b#(\u0007$*\b%+\b&,\b'-\u001b", new Object[]{"u", "v", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", alnh.class});
        } else if (i3 == 3) {
            return new almy();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) t);
            }
            if (i3 == 5) {
                return t;
            }
            auef auef = w;
            if (auef == null) {
                synchronized (almy.class) {
                    auef = w;
                    if (auef == null) {
                        auef = new auce(t);
                        w = auef;
                    }
                }
            }
            return auef;
        }
    }
}
