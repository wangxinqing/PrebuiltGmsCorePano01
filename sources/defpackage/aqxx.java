package defpackage;

/* renamed from: aqxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqxx extends aucj implements audy {
    public static final aqxx E;
    private static volatile auef F;
    public boolean A;
    public String B = "";
    public aucv C = audl.b;
    public long D;
    public String a = "";
    public String b = "";
    public aqyd c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public aucx f = auei.b;
    public String g = "";
    public int h;
    public long i;
    public int j;
    public long k;
    public String l = "";
    public long m;
    public long n;
    public String o = "";
    public auay p = auay.b;
    public auay q = auay.b;
    public aqxz r;
    public boolean s;
    public aucx t = auei.b;
    public aqya u;
    public aucx v = auei.b;
    public aucx w = auei.b;
    public String x = "";
    public aucx y = auei.b;
    public boolean z;

    static {
        aqxx aqxx = new aqxx();
        E = aqxx;
        aucj.a(aqxx.class, (aucj) aqxx);
    }

    private aqxx() {
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
            return aucj.a((audx) E, "\u0000\u001e\u0000\u0000\u0001 \u001e\u0000\b\u0000\u0001Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006Ȉ\u0007\u0004\b\u0003\nȈ\u000bȈ\f\n\r\n\u000e\t\u000f\u0007\u0010\u001b\u0011\t\u0012\u001b\u0013\u001b\u0014\u0002\u0015Ȉ\u0016\u001b\u0017\u0002\u0018\t\u0019\u0007\u001a\u0007\u001b\u0004\u001c\u0003\u001dȈ\u001e%\u001fȈ \u0002", new Object[]{"a", "d", aqxs.class, "e", aqxu.class, "f", aqxv.class, "g", "h", "i", "l", "o", "p", "q", "r", "s", "t", aqye.class, "u", "v", aqxy.class, "w", aqyc.class, "m", "x", "y", aqyb.class, "n", "c", "z", "A", "j", "k", "B", "C", "b", "D"});
        } else if (i3 == 3) {
            return new aqxx();
        } else {
            if (i3 == 4) {
                return new aqxw();
            }
            if (i3 == 5) {
                return E;
            }
            auef auef = F;
            if (auef == null) {
                synchronized (aqxx.class) {
                    auef = F;
                    if (auef == null) {
                        auef = new auce(E);
                        F = auef;
                    }
                }
            }
            return auef;
        }
    }
}
