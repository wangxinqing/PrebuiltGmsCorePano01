package defpackage;

/* renamed from: aatt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aatt extends aucj implements audy {
    public static final aatt P;
    private static volatile auef Q;
    public aasm A;
    public aasp B;
    public aucx C;
    public aasv D;
    public aatl E;
    public aati F;
    public aucx G;
    public aucx H;
    public aass I;
    public aato J;
    public aate K;
    public aath L;
    public aucx M;
    public int N;
    public boolean O;
    public int a;
    public int b;
    public long c;
    public boolean d;
    public String e = "";
    public String f = "";
    public aucx g = auei.b;
    public String h;
    public aatn i;
    public String j;
    public String k;
    public aasm l;
    public boolean m;
    public aats n;
    public aatb o;
    public String p;
    public String q;
    public aatp r;
    public aatj s;
    public aatj t;
    public aucx u;
    public aasm v;
    public aasm w;
    public aucx x;
    public aata y;
    public aasm z;

    static {
        aatt aatt = new aatt();
        P = aatt;
        aucj.a(aatt.class, (aucj) aatt);
    }

    private aatt() {
        auay auay = auay.b;
        this.h = "";
        this.j = "";
        this.k = "";
        this.p = "";
        this.q = "";
        this.u = auei.b;
        this.x = auei.b;
        this.C = auei.b;
        this.G = auei.b;
        this.H = auei.b;
        this.M = auei.b;
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
            return aucj.a((audx) P, "\u0001'\u0000\u0002\u0001:'\u0000\u0007\u0000\u0001\u0002\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u001a\u0007\b\u0005\b\t\u0006\t\b\u0007\n\b\b\r\t\u000e\u000e\u0007\n\u0010\u001b\u0011\t\t\u0013\t\u000f\u0014\b\u0010\u0015\b\u0011\u0016\t\u0012\u0017\t\u0018\u0018\t\u001a\u001a\t(\u001b\t\u0019\u001c\t)\u001d\t\u0013\u001e\t\u0014\u001f\u001b \u001b!\t\u0017#\t\u001b,\t!.\t$0\t&3\u001b4\u001a5\t\"6\f*7\t\u00158\t\u00169\u0007+:\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "n", "m", "G", aatc.class, "l", "o", "p", "q", "r", "z", "B", "K", "A", "L", "s", "t", "u", aatj.class, "x", aatd.class, "y", "D", "E", "I", "J", "C", aask.class, "M", "F", "N", aarf.a, "v", "w", "O", "H", aasr.class});
        } else if (i3 == 3) {
            return new aatt();
        } else {
            if (i3 == 4) {
                return new aucd((float[][][]) null, (int[][]) null);
            }
            if (i3 == 5) {
                return P;
            }
            auef auef = Q;
            if (auef == null) {
                synchronized (aatt.class) {
                    auef = Q;
                    if (auef == null) {
                        auef = new auce(P);
                        Q = auef;
                    }
                }
            }
            return auef;
        }
    }
}
