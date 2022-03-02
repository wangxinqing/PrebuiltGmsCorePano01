package defpackage;

/* renamed from: avxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avxj extends aucj implements audy {
    public static final avxj q;
    private static volatile auef r;
    public int a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public boolean f;
    public String g = "";
    public String h = "";
    public String i = "";
    public int j = 1;
    public String k;
    public boolean l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;

    static {
        avxj avxj = new avxj();
        q = avxj;
        aucj.a(avxj.class, (aucj) avxj);
    }

    private avxj() {
        aucl aucl = aucl.b;
        auei auei = auei.b;
        this.k = "";
        this.m = "";
        this.n = "";
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
            return aucj.a((audx) q, "\u0001\u000e\u0000\u0002\u0001-\u000e\u0000\u0000\u0000\u0001\b\u0000\u0004\u0007\u0006\u0005\b\b\u0006\b\u0001\t\b\u0003\u0012\b\r\u0013\b\u000e\u0016\f\u0012\u001b\b\u0016\u001d\u0007\u0018'\b\"(\b#*\u0007*-\u0007-", new Object[]{"a", "b", "c", "f", "g", "d", "e", "h", "i", "j", avxi.a, "k", "l", "m", "n", "o", "p"});
        } else if (i3 == 3) {
            return new avxj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) q);
            }
            if (i3 == 5) {
                return q;
            }
            auef auef = r;
            if (auef == null) {
                synchronized (avxj.class) {
                    auef = r;
                    if (auef == null) {
                        auef = new auce(q);
                        r = auef;
                    }
                }
            }
            return auef;
        }
    }
}
