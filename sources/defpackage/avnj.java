package defpackage;

/* renamed from: avnj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avnj extends aucj implements audy {
    public static final avnj p;
    private static volatile auef q;
    public int a;
    public String b = "";
    public String c = "";
    public boolean d;
    public int e = 1;
    public aucx f = auei.b;
    public String g = "";
    public avnk h;
    public String i = "";
    public String j = "";
    public String k = "";
    public boolean l;
    public aucx m;
    public aucx n;
    public boolean o;

    static {
        avnj avnj = new avnj();
        p = avnj;
        aucj.a(avnj.class, (aucj) avnj);
    }

    private avnj() {
        audl audl = audl.b;
        this.m = auei.b;
        this.n = auei.b;
        this.o = true;
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
            return aucj.a((audx) p, "\u0001\u000e\u0000\u0001\u0001\u0017\u000e\u0000\u0003\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0007\u0002\u0004\f\u0003\u0005\u001b\u0006\b\u0004\b\t\u0006\t\b\u0007\n\b\b\f\b\n\u0011\u0007\u000e\u0012\u001a\u0013\u001b\u0017\u0007\u0012", new Object[]{"a", "b", "c", "d", "e", avnh.a, "f", avnl.class, "g", "h", "i", "j", "k", "l", "m", "n", avnl.class, "o"});
        } else if (i3 == 3) {
            return new avnj();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) p);
            }
            if (i3 == 5) {
                return p;
            }
            auef auef = q;
            if (auef == null) {
                synchronized (avnj.class) {
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
