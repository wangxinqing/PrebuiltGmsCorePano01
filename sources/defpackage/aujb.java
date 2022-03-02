package defpackage;

/* renamed from: aujb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aujb extends aucj implements audy {
    public static final aujb y;
    private static volatile auef z;
    public int a;
    public int b;
    public int c;
    public long d;
    public String e = "";
    public auir f;
    public auir g;
    public auis h;
    public float i;
    public int j = 100;
    public auip k;
    public auip l;
    public float m;
    public String n = "";
    public int o;
    public int p;
    public int q;
    public int r;
    public auiz s;
    public String t = "";
    public aucs u = aucl.b;
    public aucx v = auei.b;
    public aucx w = auei.b;
    public aucx x = auei.b;

    static {
        aujb aujb = new aujb();
        y = aujb;
        aucj.a(aujb.class, (aucj) aujb);
    }

    private aujb() {
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
            return aucj.a((audx) y, "\u0001\u0017\u0000\u0001\u0001\u0018\u0017\u0000\u0004\u0000\u0001\f\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\b\u0003\u0005\t\u0004\u0006\t\u0005\u0007\u0001\u0007\b\u0004\b\t\f\u000e\n\t\t\u000b\b\r\f\f\u000f\r\f\u0010\u000e\t\u0006\u000f\u0004\u0011\u0011\t\u000b\u0012\u0001\f\u0013\t\u0012\u0014\b\u0013\u0015\u001e\u0016\u001b\u0017\u001b\u0018\u001b", new Object[]{"a", "b", auje.a, "c", aujc.a, "d", "e", "f", "g", "i", "j", "o", aujd.a, "k", "n", "p", auje.a, "q", aujc.a, "h", "r", "l", "m", "s", "t", "u", aujg.b(), "v", aujm.class, "w", aujq.class, "x", aujh.class});
        } else if (i3 == 3) {
            return new aujb();
        } else {
            if (i3 == 4) {
                return new auja();
            }
            if (i3 == 5) {
                return y;
            }
            auef auef = z;
            if (auef == null) {
                synchronized (aujb.class) {
                    auef = z;
                    if (auef == null) {
                        auef = new auce(y);
                        z = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void c() {
        if (!this.v.a()) {
            this.v = aucj.a(this.v);
        }
    }

    public final void e() {
        if (!this.w.a()) {
            this.w = aucj.a(this.w);
        }
    }
}
