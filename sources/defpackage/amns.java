package defpackage;

/* renamed from: amns  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class amns extends aucj implements audy {
    private static volatile auef B;
    public static final amns z;
    private byte A = 2;
    public int a;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public aucx h = auei.b;
    public aucx i = auei.b;
    public amnk j;
    public boolean k;
    public long l;
    public int m;
    public int n;
    public long o;
    public String p = "";
    public long q;
    public aucx r = auei.b;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public int x;
    public aucx y = auei.b;

    static {
        amns amns = new amns();
        z = amns;
        aucj.a(amns.class, (aucj) amns);
    }

    private amns() {
    }

    /* access modifiers changed from: protected */
    public final Object a(int i2, Object obj) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.A);
        }
        byte b2 = 0;
        if (i3 == 1) {
            if (obj != null) {
                b2 = 1;
            }
            this.A = b2;
            return null;
        } else if (i3 == 2) {
            return aucj.a((audx) z, "\u0001\u0018\u0000\u0001\u0001\u001d\u0018\u0000\u0004\u0007\u0001Ԉ\u0000\u0002Ԉ\u0001\u0003Ԉ\u0002\u0004Ԉ\u0003\u0005Ԉ\u0004\u0006\b\u0005\bЛ\n\u001a\rЉ\b\u000e\u0007\t\u000f\u0002\n\u0010\f\u000b\u0011\u0004\f\u0012\u0002\r\u0013\b\u000e\u0015\u0003\u0010\u0016\u001b\u0017\u0007\u0011\u0018\u0007\u0012\u0019\u0004\u0013\u001a\f\u0014\u001b\u0004\u0015\u001c\f\u0016\u001d\u001a", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", amnv.class, "i", "j", "k", "l", "m", amno.a, "n", "o", "p", "q", "r", ammy.class, "s", "t", "u", "v", amnq.a, "w", "x", amnr.a, "y"});
        } else if (i3 == 3) {
            return new amns();
        } else {
            if (i3 == 4) {
                return new amnp();
            }
            if (i3 == 5) {
                return z;
            }
            auef auef = B;
            if (auef == null) {
                synchronized (amns.class) {
                    auef = B;
                    if (auef == null) {
                        auef = new auce(z);
                        B = auef;
                    }
                }
            }
            return auef;
        }
    }

    public final void a() {
        if (!this.r.a()) {
            this.r = aucj.a(this.r);
        }
    }
}
