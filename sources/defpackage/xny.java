package defpackage;

/* renamed from: xny  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xny extends aucj implements audy {
    public static final xny w;
    private static volatile auef x;
    public int a;
    public xoa b;
    public int c;
    public int d;
    public int e;
    public int f = 1;
    public int g;
    public String h = "";
    public String i = "";
    public int j;
    public long k;
    public aucx l = auei.b;
    public long m;
    public xnq n;
    public int o;
    public aucs p = aucl.b;
    public long q;
    public int r;
    public String s = "";
    public aucx t = auei.b;
    public aucx u = auei.b;
    public aucx v = auei.b;

    static {
        xny xny = new xny();
        w = xny;
        aucj.a(xny.class, (aucj) xny);
    }

    private xny() {
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
            return aucj.a((audx) w, "\u0001\u0015\u0000\u0001\u0001\u0016\u0015\u0000\u0005\u0000\u0001\t\u0000\u0002\u0004\u0001\u0003\f\u0002\u0004\u0004\u0003\u0005\f\u0004\u0006\u0004\u0005\u0007\b\u0006\b\b\u0007\t\u0004\b\n\u0002\t\u000b\u001b\f\u0002\n\r\t\u000b\u000e\u0004\f\u000f\u0016\u0010\u0002\r\u0011\u0004\u000e\u0013\b\u000f\u0014\u001b\u0015\u001b\u0016\u001b", new Object[]{"a", "b", "c", "d", xmv.a, "e", "f", xnw.a, "g", "h", "i", "j", "k", "l", xmu.class, "m", "n", "o", "p", "q", "r", "s", "t", xnv.class, "u", xns.class, "v", xnt.class});
        } else if (i3 == 3) {
            return new xny();
        } else {
            if (i3 == 4) {
                return new aucd((char[][]) null, (byte[][][]) null);
            }
            if (i3 == 5) {
                return w;
            }
            auef auef = x;
            if (auef == null) {
                synchronized (xny.class) {
                    auef = x;
                    if (auef == null) {
                        auef = new auce(w);
                        x = auef;
                    }
                }
            }
            return auef;
        }
    }
}
