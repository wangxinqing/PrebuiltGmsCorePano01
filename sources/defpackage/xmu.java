package defpackage;

/* renamed from: xmu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xmu extends aucj implements audy {
    public static final xmu J;
    private static volatile auef K;
    public int A;
    public int B;
    public int C;
    public long D;
    public long E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int a;
    public int b;
    public xoa c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

    static {
        xmu xmu = new xmu();
        J = xmu;
        aucj.a(xmu.class, (aucj) xmu);
    }

    private xmu() {
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
            return aucj.a((audx) J, "\u0001!\u0000\u0002\u00015!\u0000\u0000\u0000\u0001\t\u0000\u000e\u0004\u0011\u000f\u0004\u0012\u0010\u0004\u0013\u0011\u0007\u0016\u0012\u0004\u001c\u0013\u0004\u001d\u0014\u0004\u001e\u001c\u0002/\u001d\u0007\u0017\u001e\u0007\u0018\u001f\u0007\u000f \u0007\u001b!\u0007 \"\u0004!#\u0004\"$\u0004$%\u0004%&\u0004''\u0004((\u0004\u0014)\u0004#*\u0004&,\u0007\u0001-\u0004\u0002.\u0007\u0019/\u0004\u001a0\u0007\u00151\u000202\u000213\u000224\f35\f4", new Object[]{"a", "b", "c", "g", "h", "i", "l", "r", "s", "t", "D", "m", "n", "f", "q", "u", "v", "w", "y", "z", "B", "C", "j", "x", "A", "d", "e", "o", "p", "k", "E", "F", "G", "H", xkg.a, "I", xkg.a});
        } else if (i3 == 3) {
            return new xmu();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) J);
            }
            if (i3 == 5) {
                return J;
            }
            auef auef = K;
            if (auef == null) {
                synchronized (xmu.class) {
                    auef = K;
                    if (auef == null) {
                        auef = new auce(J);
                        K = auef;
                    }
                }
            }
            return auef;
        }
    }
}
