package defpackage;

/* renamed from: auwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auwy extends aucj implements audy {
    public static final auwy u;
    private static volatile auef v;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public String f = "";
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public auwg n;
    public auwi o;
    public auwk p;
    public auwh q;
    public auwl r;
    public auwj s;
    public auwf t;

    static {
        auwy auwy = new auwy();
        u = auwy;
        aucj.a(auwy.class, (aucj) auwy);
    }

    private auwy() {
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
            return aucj.a((audx) u, "\u0001\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0002\u0000\u0001\f\u0000\u0002\u0004\u0001\u0004\u001b\u0005\u001b\u0006\b\u0003\u0007\f\u0004\b\f\u0005\n\f\u0007\u000b\u0004\b\f\f\t\u000e\f\u000b\u000f\f\f\u0010\t\r\u0011\t\u000e\u0012\t\u000f\u0013\t\u0010\u0014\t\u0011\u0015\t\u0012\u0016\t\u0013", new Object[]{"a", "b", asom.b(), "c", "d", auwc.class, "e", auwc.class, "f", "g", asoq.a, "h", asoq.a, "i", asoo.a, "j", "k", ason.a, "l", asop.a, "m", asoz.a, "n", "o", "p", "q", "r", "s", "t"});
        } else if (i3 == 3) {
            return new auwy();
        } else {
            if (i3 == 4) {
                return new aucd((byte[][][]) null, (byte[]) null);
            }
            if (i3 == 5) {
                return u;
            }
            auef auef = v;
            if (auef == null) {
                synchronized (auwy.class) {
                    auef = v;
                    if (auef == null) {
                        auef = new auce(u);
                        v = auef;
                    }
                }
            }
            return auef;
        }
    }
}
