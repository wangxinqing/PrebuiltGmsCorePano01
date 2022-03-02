package defpackage;

/* renamed from: tzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tzf extends aucj implements audy {
    public static final tzf A;
    private static volatile auef B;
    public static final auct u = new tze();
    public int a;
    public String b = "";
    public int c;
    public int d;
    public auay e = auay.b;
    public String f = "";
    public long g;
    public String h = "";
    public String i = "";
    public int j;
    public auay k = auay.b;
    public String l = "";
    public tzc m;
    public auay n = auay.b;
    public boolean o;
    public int p;
    public avan q;
    public boolean r;
    public String s = "";
    public aucs t = aucl.b;
    public int v;
    public auay w = auay.b;
    public asqh x;
    public long y;
    public int z;

    static {
        tzf tzf = new tzf();
        A = tzf;
        aucj.a(tzf.class, (aucj) tzf);
    }

    private tzf() {
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
            return aucj.a((audx) A, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0001\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\n\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\b\u0006\b\b\u0007\t\u0004\b\n\n\t\u000b\b\n\f\t\u000b\r\n\f\u000e\u0007\r\u000f\u0004\u000e\u0010\t\u000f\u0011\u0007\u0010\u0012\b\u0011\u0013\u001e\u0014\f\u0012\u0015\n\u0013\u0016\t\u0014\u0017\u0002\u0015\u0018\u0004\u0016", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", asql.b(), "v", asqr.a, "w", "x", "y", "z"});
        } else if (i3 == 3) {
            return new tzf();
        } else {
            if (i3 == 4) {
                return new aucd((char[]) null, (int[][][]) null);
            }
            if (i3 == 5) {
                return A;
            }
            auef auef = B;
            if (auef == null) {
                synchronized (tzf.class) {
                    auef = B;
                    if (auef == null) {
                        auef = new auce(A);
                        B = auef;
                    }
                }
            }
            return auef;
        }
    }
}
