package defpackage;

/* renamed from: tad  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tad extends aucj implements audy {
    public static final tad P;
    private static volatile auef Q;
    public String A = "";
    public boolean B;
    public aucx C = auei.b;
    public String D = "";
    public int E;
    public String F = "";
    public long G;
    public long H;
    public String I = "";
    public int J;
    public String K = "";
    public tae L;
    public aucs M = aucl.b;
    public long N;
    public long O;
    public int a;
    public int b;
    public int c;
    public aucx d = auei.b;
    public aucx e = auei.b;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public String k = "";
    public String l = "";
    public String m = "";
    public String n = "";
    public int o;
    public String p = "";
    public String q = "";
    public String r = "";
    public long s;
    public long t;
    public String u = "";
    public boolean v;
    public String w = "";
    public long x;
    public int y;
    public String z = "";

    static {
        tad tad = new tad();
        P = tad;
        aucj.a(tad.class, (aucj) tad);
    }

    private tad() {
    }

    public static /* synthetic */ void a(tad tad) {
        tad.a |= 1;
        tad.c = 1;
    }

    public final void b() {
        if (!this.e.a()) {
            this.e = aucj.a(this.e);
        }
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
            return aucj.a((audx) P, "\u0001'\u0000\u0002\u0001/'\u0000\u0004\u0000\u0001\u0004\u0000\u0002\u001b\u0003\u001b\u0004\u0002\u0001\u0005\u0002\u0002\u0006\u0002\u0003\u0007\u0002\u0005\b\b\u0006\t\b\u0007\n\b\b\u000b\b\t\f\u0004\n\r\b\u000b\u000e\b\f\u0010\b\r\u0011\u0002\u000e\u0012\u0002\u000f\u0013\b\u0010\u0014\u0007\u0011\u0015\b\u0012\u0016\u0002\u0013\u0017\u0004\u0014\u0018\b\u0015\u0019\b\u0016\u001a\u0002\u0004\u001c\u0007\u0017\u001d\u001b\u001e\b\u0018\u001f\u0004\u0019\"\b\u001c#\u0002\u001d$\u0002\u001e%\b\u001f'\u0004!)\b\",\t#-\u001d.\u0002$/\u0002%", new Object[]{"a", "b", "c", "d", szz.class, "e", tah.class, "f", "g", "h", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "i", "B", "C", szx.class, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"});
        } else if (i3 == 3) {
            return new tad();
        } else {
            if (i3 == 4) {
                return new aucd((int[][]) null, (byte[][][]) null);
            }
            if (i3 == 5) {
                return P;
            }
            auef auef = Q;
            if (auef == null) {
                synchronized (tad.class) {
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

    public final void a() {
        if (!this.d.a()) {
            this.d = aucj.a(this.d);
        }
    }
}
