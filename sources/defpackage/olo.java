package defpackage;

/* renamed from: olo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class olo extends aucj implements audy {
    public static final olo I;
    private static volatile auef J;
    public String A = "";
    public String B = "";
    public int C;
    public int D;
    public boolean E;
    public long F;
    public int G;
    public avmq H;
    public int a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public int h;
    public String i = "";
    public int j;
    public int k;
    public String l = "";
    public String m = "";
    public String n = "";
    public int o = -1;
    public int p;
    public long q = -1;
    public int r = -1;
    public int s;
    public long t = -1;
    public long u = -1;
    public int v = -1;
    public int w = -1;
    public int x;
    public int y;
    public boolean z;

    static {
        olo olo = new olo();
        I = olo;
        aucj.a(olo.class, (aucj) olo);
    }

    private olo() {
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
            return aucj.a((audx) I, "\u0001 \u0000\u0002\u0001( \u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0006\b\b\u000b\t\b\f\n\b\r\u000b\u0004\u000e\u000e\u0002\u0012\u0011\u0004\u0015\u0013\u0002\u0018\u0014\u0002\u0019\u0015\u0004\u001a\u0017\u0004\u001e\u0018\u0007\u001f\u0019\f\b\u001a\f\n\u001b\f\u0011\u001c\f\u0017\u001d\f\u001d\u001e\u0004\u001b\u001f\b  \b!!\b\u0004\"\u0004\"#\u0004#$\u0007$%\u0002%&\u0004&'\f\u0005(\t'", new Object[]{"a", "b", "c", "d", "e", "f", "i", "l", "m", "n", "o", "q", "r", "t", "u", "v", "y", "z", "j", avnd.a, "k", avnb.a, "p", avmt.b(), "s", avmx.a, "x", avmu.a, "w", "A", "B", "g", "C", "D", "E", "F", "G", "h", avmr.a, "H"});
        } else if (i3 == 3) {
            return new olo();
        } else {
            if (i3 == 4) {
                return new aucd((aucj) I);
            }
            if (i3 == 5) {
                return I;
            }
            auef auef = J;
            if (auef == null) {
                synchronized (olo.class) {
                    auef = J;
                    if (auef == null) {
                        auef = new auce(I);
                        J = auef;
                    }
                }
            }
            return auef;
        }
    }
}
